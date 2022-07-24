package exercise_mvc.model;

public class Student  extends Person {
    private String nameClass;
    private double point;

    public Student() {
    }

    public Student(int id, String name, String dateOfBirth, String gender, String nameClass, double point) {
        super(id, name, dateOfBirth, gender);
        this.nameClass = nameClass;
        this.point = point;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s,%s\n", this.getId(), this.getName(),this.getDateOfBirth(),this.getGender(), this.getNameClass(), this.getPoint());
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() +
                ", id: " + super.getId() +
                ", DateOfBirth: " + super.getDateOfBirth()+
                ", gender: " + super.getGender() +
                ", className: " + getNameClass() +
                ", score: " + getPoint();

    }
}