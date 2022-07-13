package ss10_dsa_list.exercise.exercise1.view;

import ss10_dsa_list.exercise.exercise1.model.MyList;
import ss10_dsa_list.exercise.exercise1.model.Student;

public class View {
    public static void main(String[] args) {
        Student student1 = new Student(1,"Huỳnh Trung Thuyên");
        Student student2 = new Student(2,"Lê Đại Lợi");
        Student student3 = new Student(3,"Hoàng Minh Trí");
        Student student4 = new Student(4,"Bùi Hùng");
        Student student5 = new Student(5,"Võ Văn Tý");
        Student student6 = new Student(6,"Nguyễn Văn Phúc");
        Student student7 = new Student(7,"Nguyễn Văn A");




        MyList<Student> studentMyList = new MyList<>();
        studentMyList.add(student1);
        studentMyList.add(student2);
        studentMyList.add(student3);
        studentMyList.add(student4);
        studentMyList.add(student5);
        studentMyList.add(student6);
        studentMyList.add(6, student5);
        studentMyList.add(5, student6);
        studentMyList.remove(6);

        for (int i = 0; i < studentMyList.size(); i++) {
            System.out.println((i+1) + ". " + studentMyList.elements[i]);
        }

        System.out.println(studentMyList.get(1));

    }
}
