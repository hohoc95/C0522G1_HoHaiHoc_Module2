package case_study.service.impl;

import case_study.exception.DuplicateIDException;
import case_study.model.Customer;
import case_study.model.Employee;
import case_study.service.IEmployeeService;
import case_study.utils.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static final String PATH = "C0522G1_HoHaiHoc_Module2/src/case_study/data/customer.csv";

    @Override
    public void displayList() {
        for(Employee employee: employeeList){
            System.out.println(employee);
        }
    }

    @Override
    public void add() {
        int id;
        while (true){
            try{
                System.out.print("Enter Id: ");
                id = Integer.parseInt(scanner.nextLine());

                for (Employee employee : employeeList){
                    if(employee.getId() == id){
                        throw new DuplicateIDException("ID already exists, please re-enter ");
                    }
                }
                break;
            }
            catch (NumberFormatException e){
                System.out.println("");
            }
            catch (DuplicateIDException e){
                System.out.println(e.getMessage());
            }
            String name = Utils.getName();

            String dateOfBirth = Utils.getDateOfBirth();

            String email = Utils.getEmail();

        }
    }

    @Override
    public void edit() {

    }
}
