import java.util.regex.Matcher;
import java.util.regex.Pattern;

 class RegexDemo {
    public static void main(String[] args) {
        // Set up the subject strings for testing
        String emailSubject = "my.email@domain.com";
        String phoneSubject = "123-456-7890";
        String dateSubject = "12/31/2022";
        String timeSubject = "23:59:59";
        String alphanumericSubject = "abc123";

        // Define the regular expression patterns to use
        String emailPattern = "^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$";
        String phonePattern = "^\\d{3}-\\d{3}-\\d{4}$";
        String datePattern = "^\\d{1,2}/\\d{1,2}/\\d{4}$";
        String timePattern = "^\\d{1,2}:\\d{1,2}:\\d{1,2}$";
        String alphanumericPattern = "^[a-zA-Z0-9]+$";

        // Test the email pattern
        System.out.println("Testing email pattern: " + emailPattern);
        System.out.println("Subject string: " + emailSubject);
        System.out.println("Positive match: " + emailSubject.matches(emailPattern));
        System.out.println("Negative match: " + "myemail@domain".matches(emailPattern));
        System.out.println();

        // Test the phone pattern
        System.out.println("Testing phone pattern: " + phonePattern);
        System.out.println("Subject string: " + phoneSubject);
        System.out.println("Positive match: " + phoneSubject.matches(phonePattern));
        System.out.println("Negative match: " + "1234567890".matches(phonePattern));
        System.out.println();

        // Test the date pattern
        System.out.println("Testing date pattern: " + datePattern);
        System.out.println("Subject string: " + dateSubject);
        System.out.println("Positive match: " + dateSubject.matches(datePattern));
        System.out.println("Negative match: " + "12-31-2022".matches(datePattern));
        System.out.println();

        // Test the time pattern
        System.out.println("Testing time pattern: " + timePattern);
        System.out.println("Subject string: " + timeSubject);
        System.out.println("Positive match: " + timeSubject.matches(timePattern));
        System.out.println("Negative match: " + "235959".matches(timePattern));
        System.out.println();

        // Test the alphanumeric pattern
        System.out.println("Testing alphanumeric pattern: " + alphanumericPattern);
        System.out.println("Subject string: " + alphanumericSubject);
        System.out.println("Positive match: " + alphanumericSubject);
    }
 }