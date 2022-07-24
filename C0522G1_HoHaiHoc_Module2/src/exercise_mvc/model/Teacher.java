package exercise_mvc.model;

public class Teacher extends Person {
    private String specialize;

    public Teacher(){
    }

    public Teacher(int id, String name, String dateOfBirth, String gender, String specialize) {
        super(id, name, dateOfBirth, gender);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSubject(String specialize) {
        this.specialize = specialize;
    }

    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s\n", this.getId(), this.getName(), this.getDateOfBirth(), this.getGender(), this.getSpecialize());
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() +
                ", id: " + super.getId() +
                ", DateOfBirth: " + super.getDateOfBirth()+
                ", gender: " + super.getGender() +
                ", speciality: " + this.specialize;
    }
}
