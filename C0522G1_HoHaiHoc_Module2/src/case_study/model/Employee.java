package case_study.model;

public class Employee extends Person{
    private String employeeCode;
    private String level;
    private String poisition;
    private int salary;

    public Employee(){
    }

    public Employee(String id, String name, String dateOfBirth, String gender, String email, String phoneNumber,
                    String employeeCode, String level, String poisition, int salary) {
        super(id, name, dateOfBirth, gender, email, phoneNumber);
        this.employeeCode = employeeCode;
        this.level = level;
        this.poisition = poisition;
        this.salary = salary;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPoisition() {
        return poisition;
    }

    public void setPoisition(String poisition) {
        this.poisition = poisition;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s\n",this.getId(),this.getName(),this.getDateOfBirth(),
                this.getGender(),this.getEmail(),this.getPhoneNumber(),this.getEmployeeCode(),this.getLevel(),
                this.getPoisition(),this.getSalary());
    }

    @Override
    public String toString() {
        return  "Employee: "+ super.toString()+
                "employeeCode: " + employeeCode +
                ", level: " + level +
                ", poisition: " + poisition +
                ", Salary: " + salary;
    }
}
