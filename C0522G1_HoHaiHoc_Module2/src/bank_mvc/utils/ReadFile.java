package bank_mvc.utils;

import bank_mvc.model.PaymentAccount;
import bank_mvc.model.SavingAccount;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private static List<String> readFile(String path){
        List<String> stringList = new ArrayList<>();
        String line;
        try{
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null ){
                stringList.add(line);
            }

            bufferedReader.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        return stringList;
    }

    public static List<PaymentAccount> readPaymentAccount (String path){
        List<String> stringList = readFile(path);
        List<PaymentAccount> paymentAccountList = new ArrayList<>();
        String[] info;

        for (String line : stringList) {
            info = line.split(",");
            if (info.length == 6){
                paymentAccountList.add(new PaymentAccount(Integer.parseInt(info[0]), info[1], info[2], info[3],
                        info[4], info[5]));
            }
        }
        return paymentAccountList;
    }

    public static List<SavingAccount> readSavingAccount (String path){
        List<String> stringList = readFile(path);
        List<SavingAccount> savingAccountList = new ArrayList<>();
        String[] info;

        for (String line : stringList) {
            info = line.split(",");
            if (info.length == 8){
                savingAccountList.add(new SavingAccount(Integer.parseInt(info[0]), info[1], info[2], info[3], info[4],
                        info[5], Integer.parseInt(info[6]), info[7]));
            }
        }
        return savingAccountList;
    }
}
