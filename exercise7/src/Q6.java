import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

class Q6 {
    public static <T> int countElementsWithProperty(Collection<T> collection, Predicate<T> predicate) {
        int count = 0;
        for (T element : collection) {
            if (predicate.test(element)) {
                count++;
            }
        }
        return count;
    }

    public static <T> void exchangeElements(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static <T extends Comparable<T>> T maxInRange(List<T> list, int begin, int end) {
        T max = list.get(begin);
        for (int i = begin + 1; i < end; i++) {
            T element = list.get(i);
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> isOdd = (n) -> n % 2 == 1;
        int count = countElementsWithProperty(numbers, isOdd);
        System.out.println(count);

        Integer[] numbers2 = {1, 2, 3, 4, 5};
        exchangeElements(numbers2, 0, 1);
// numbers is now {2, 1, 3, 4, 5}

        System.out.println(Arrays.toString(numbers2));

        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(maxInRange(numbers3, 1, 5));

    }

}