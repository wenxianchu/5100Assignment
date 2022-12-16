import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Student {
    // Properties
    private String name;
    private int age;
    private String gender;

    // Constructor
    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}

class PartTimeStudent extends Student {
    // Properties
    private int[] quizScores;

    // Constructor
    public PartTimeStudent(String name, int age, String gender, int[] quizScores) {
        super(name, age, gender);
        this.quizScores = quizScores;
    }

    // Getter
    public int[] getQuizScores() {
        return this.quizScores;
    }

    @Override
    public String toString() {
        return "PartTimeStudent{" +
                "quizScores=" + Arrays.toString(quizScores) +
                '}';
    }
}


class FullTimeStudent extends Student {
    // Properties
    private int[] quizScores;
    private int[] examScores;

    // Constructor
    public FullTimeStudent(String name, int age, String gender, int[] quizScores, int[] examScores) {
        super(name, age, gender);
        this.quizScores = quizScores;
        this.examScores = examScores;
    }

    // Getters
    public int[] getQuizScores() {
        return this.quizScores;
    }

    public int[] getExamScores() {
        return this.examScores;
    }

    @Override
    public String toString() {
        return "FullTimeStudent{" +
                "quizScores=" + Arrays.toString(quizScores) +
                ", examScores=" + Arrays.toString(examScores) +
                '}';
    }
}

class Session {
    // Properties
    private Student[] students;

    // Constructor
    public Session(Student[] students) {
        this.students = students;
    }

    // Public methods
    public double calculateAverageQuizScore() {
        double total = 0;
        for (Student student : students) {
            if (student instanceof PartTimeStudent) {
                for (int s : ((PartTimeStudent) student).getQuizScores())
                    total += s;
            } else if (student instanceof FullTimeStudent) {
                for (int s : ((FullTimeStudent) student).getQuizScores())
                    total += s;
            }
        }
        return total / students.length;
    }

    public void printQuizScore() {
        List<Student> s = Arrays.asList(students);
        s.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                double s1 = 0;
                if (o1 instanceof PartTimeStudent) {
                    for (int s : ((PartTimeStudent) o1).getQuizScores())
                        s1 += s;
                }
                if (o1 instanceof FullTimeStudent) {
                    for (int s : ((FullTimeStudent) o1).getQuizScores())
                        s1 += s;
                }

                double s2 = 0;
                if (o2 instanceof PartTimeStudent) {
                    for (int s : ((PartTimeStudent) o2).getQuizScores())
                        s2 += s;
                }
                if (o2 instanceof FullTimeStudent) {
                    for (int s : ((FullTimeStudent) o2).getQuizScores())
                        s2 += s;
                }

                double v = s1 - s2;
                return (int) v;
            }
        });

        for(Student i : s) {
            System.out.println(i);
        }
    }

    public void printPartTimeStudentName() {
        for (Student student : students) {
            if (student instanceof PartTimeStudent) {
                System.out.println(student.getName());
            }
        }
    }


    public void printFullTimeStudentName() {
        for (Student student : students) {
            if (student instanceof FullTimeStudent) {
                System.out.println(student.getName());
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        // Create an array of students
        Student[] students = new Student[20];

        students[0] = new FullTimeStudent("s1", 18, "M", new int[]{10, 20, 30}, new int[]{30, 40, 50});
        students[1] = new PartTimeStudent("s2", 18, "M", new int[]{10, 20, 30});
        students[2] = new FullTimeStudent("s3", 18, "M", new int[]{10, 20, 30}, new int[]{30, 40, 50});
        students[3] = new FullTimeStudent("s4", 18, "M", new int[]{10, 20, 30}, new int[]{30, 40, 50});
        students[4] = new PartTimeStudent("s5", 18, "M", new int[]{10, 20, 30});
        students[5] = new FullTimeStudent("s6", 18, "M", new int[]{10, 20, 30}, new int[]{30, 40, 50});
        students[6] = new PartTimeStudent("s7", 18, "M", new int[]{10, 20, 30});
        students[7] = new FullTimeStudent("s8", 18, "M", new int[]{10, 20, 30}, new int[]{30, 40, 50});
        students[8] = new FullTimeStudent("s9", 18, "M", new int[]{10, 20, 30}, new int[]{30, 40, 50});
        students[9] = new FullTimeStudent("s10", 18, "M", new int[]{10, 20, 30}, new int[]{30, 40, 50});
        students[10] = new FullTimeStudent("s11", 18, "M", new int[]{10, 20, 30}, new int[]{30, 40, 50});
        students[11] = new PartTimeStudent("s12", 18, "M", new int[]{10, 20, 30});
        students[12] = new PartTimeStudent("s13", 18, "M", new int[]{10, 20, 30});
        students[13] = new PartTimeStudent("s14", 18, "M", new int[]{30, 40, 50});
        students[14] = new FullTimeStudent("s15", 18, "M", new int[]{10, 20, 30}, new int[]{30, 40, 50});
        students[15] = new FullTimeStudent("s16", 18, "M", new int[]{10, 20, 30}, new int[]{30, 40, 50});
        students[16] = new FullTimeStudent("s17", 18, "M", new int[]{10, 20, 30}, new int[]{30, 40, 50});
        students[17] = new PartTimeStudent("s18", 18, "M", new int[]{30, 40, 50});
        students[18] = new FullTimeStudent("s19", 18, "M", new int[]{10, 20, 30}, new int[]{30, 40, 50});
        students[19] = new FullTimeStudent("s20", 18, "M", new int[]{10, 20, 30}, new int[]{30, 40, 50});

        Session session = new Session(students);

        session.printPartTimeStudentName();
        session.printFullTimeStudentName();

        System.out.println("quiz average score: " + session.calculateAverageQuizScore());

        session.printQuizScore();
    }
}

