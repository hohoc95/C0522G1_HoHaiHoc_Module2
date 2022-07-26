package ss19_string_regex.exercise.ClassName;

public class ClassNameTest {
    private static ClassName className;

    public static final String [] validClassName= new String[] {"C0522G","A0122H","P0222I"};
    public static final String [] invalidClassName= new String[] {"MN152F","12ABCD","@#12AB"};

    public static void main(String[] args) {
        className = new ClassName();
        for (String classExample : validClassName){
            boolean isValid = className.validate(classExample);
            System.out.println("Class name is " + classExample + " is valid " + isValid);
        }
        for (String classExample : invalidClassName){
            boolean isValid = className.validate(classExample);
            System.out.println("Class name is " + classExample + " is valid " + isValid);
        }
    }
}
