package ss18_string_regex.practice.practice1;

public class EmailExampleTest {
    private static EmailExample emailExample;

    public static final String [] valiEmail = new String[] {"abcd@gmail.com", "abcd@yahoo.com"};
    public static final String [] invaliEmail = new String[] {"@gmail.com", "$abcd@yahoo.com"};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String email :valiEmail) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email is " +email + " is valid: " + isValid);
        }
        for (String email :invaliEmail) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email is " +email + " is valid: " + isValid);
        }
    }

}
