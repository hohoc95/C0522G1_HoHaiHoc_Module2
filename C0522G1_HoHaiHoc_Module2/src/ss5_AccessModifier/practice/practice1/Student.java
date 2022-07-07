package ss5_AccessModifier.practice.practice1;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    Student(int r, String n){
        rollno = r;
        name = n;
    }
    static void change(){
        college = "ABCD";
    }
//    public String toString(){
//        return String.format("");
//    }
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}
