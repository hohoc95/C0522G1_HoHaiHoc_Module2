package case_study.service.impl;

import case_study.exception.DuplicateIDException;
import case_study.model.Customer;
import case_study.service.ICustomerService;
import exercise_mvc.utils.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static List<Customer> customerList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static final String PATH = "C0522G1_HoHaiHoc_Module2/src/case_study/data/customer.csv";

    @Override
    public void displayList() {
        for(Customer customer: customerList){
            System.out.println(customer);
        }
    }

    @Override
    public void add() {
        int id;
        while (true){
            try{
                System.out.print("Enter Id: ");
                id = Integer.parseInt(scanner.nextLine());

                for (Customer customer : customerList){
                    if(customer.getId() == id){
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
            String name = Util.getName();

            String dateOfBirth = scanner.nextLine();

            System.out.println("Enter email");


        }
    }

    @Override
    public void edit() {

    }
}
