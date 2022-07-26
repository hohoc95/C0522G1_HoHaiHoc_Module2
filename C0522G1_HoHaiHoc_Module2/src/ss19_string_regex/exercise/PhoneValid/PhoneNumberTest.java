package ss19_string_regex.exercise.PhoneValid;

public class PhoneNumberTest {
    private static PhoneNumber phoneNumber;

    public static final String [] validPhoneNumber= new String[] {"(84)-(0123456789)","(84)-(0112233445)"};
    public static final String [] invalidPhoneNumber= new String[] {"(8A)-(A123456789)","(A4)-(B112233445)"};

    public static void main(String[] args) {
        phoneNumber = new PhoneNumber();
        for (String classExample : validPhoneNumber){
            boolean isValid = phoneNumber.validate(classExample);
            System.out.println("Class name is " + classExample + " is valid " + isValid);
        }
        for (String classExample : invalidPhoneNumber){
            boolean isValid = phoneNumber.validate(classExample);
            System.out.println("Class name is " + classExample + " is valid " + isValid);
        }
    }
}
