package bank_mvc.service;

public interface ISavingAccountService extends IBankAccountService{
    void add();

    void remove();

    void displayList();

    void searchByName();

    void searchByID();
}
