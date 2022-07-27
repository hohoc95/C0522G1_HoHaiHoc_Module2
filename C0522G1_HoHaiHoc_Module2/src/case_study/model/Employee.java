package case_study.model;

public class Employee extends Person{
    private String employeeCode;
    private String level;
    private String poisition;
    private String Salary;

    public Employee(){
    }

    public Employee(int id, String name, String dateOfBirth, String gender, String email, String phoneNumber, String employeeCode, String level, String poisition, String salary) {
        super(id, name, dateOfBirth, gender, email, phoneNumber);
        this.employeeCode = employeeCode;
        this.level = level;
        this.poisition = poisition;
        Salary = salary;
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

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " +
                "employeeCode: " + employeeCode +
                ", level: " + level +
                ", poisition: " + poisition +
                ", Salary: " + Salary;
    }
}
