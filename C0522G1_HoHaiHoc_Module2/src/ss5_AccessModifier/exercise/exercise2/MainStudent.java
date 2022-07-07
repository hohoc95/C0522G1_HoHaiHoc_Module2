package ss5_AccessModifier.exercise.exercise2;

public class MainStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.setName("A B");
        student1.setClasses("C05");
        student2.setName("C D");
        student2.setClasses("C05");
        
        System.out.println(student1);
        System.out.println(student2);


    }
}
