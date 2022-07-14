package exercise_mvc.model;

public class Teacher extends Person {
    private String specialize;

    public Teacher(){
    }

    public Teacher(int id, String name, String dateOfBirth, boolean gender, String specialize) {
        super(id, name, dateOfBirth, gender);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSubject(String specialize) {
        this.specialize = specialize;
    }

//    @Override
//    public String toString() {
//        return "Teacher{" +
//                "specialize='" + specialize + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return "Teacher{" +
                "specialize='" + specialize + '\'' +
                "} " + super.toString();
    }
}
