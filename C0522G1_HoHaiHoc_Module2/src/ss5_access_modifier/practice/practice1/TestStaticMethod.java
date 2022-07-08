package ss5_access_modifier.practice.practice1;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student student1 = new Student(1, "A");
        Student student2 = new Student(2, "B");

        student1.display();
        student2.display();
    }
}
