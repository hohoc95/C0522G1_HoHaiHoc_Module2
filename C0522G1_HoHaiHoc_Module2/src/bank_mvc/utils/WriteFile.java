package bank_mvc.utils;

import bank_mvc.model.PaymentAccount;
import bank_mvc.model.SavingAccount;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFile {
    private static void writeFile(String path, String data) {
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writePaymentAccount(String path, List<PaymentAccount> paymentAccounts) {
        StringBuilder data = new StringBuilder();
        for (PaymentAccount paymentAccount : paymentAccounts) {
            data.append(paymentAccount.getInfo());
        }

        writeFile(path, data.toString());
    }

    public static void writeSavingAccount(String path, List<SavingAccount> savingAccounts){
        StringBuilder data = new StringBuilder();
        for (SavingAccount savingAccount : savingAccounts) {
            data.append(savingAccount.getInfo()).append("\n");
        }

        writeFile(path, data.toString());

    }

}
