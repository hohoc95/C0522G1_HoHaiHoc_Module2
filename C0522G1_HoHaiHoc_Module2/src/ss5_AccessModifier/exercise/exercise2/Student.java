package ss5_AccessModifier.exercise.exercise2;

public class Student {
    //Hai thuộc tính có access modifier là private:
    //name (string) có giá trị mặc định là "John", class (String) có giá trị mặc định là "C02".
    private String name = "John";
    private String classes = "C02";

    //Một hàm tạo không có tham số.
    public Student(){
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    //Hai phương thức có access modifier là public: setName và setClasses.
    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String toString(){
        return String.format("student: %s, classes: %s", getName(), getClasses());
    }

}
