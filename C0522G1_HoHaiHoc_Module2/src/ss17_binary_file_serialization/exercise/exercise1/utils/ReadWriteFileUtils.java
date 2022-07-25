package ss17_binary_file_serialization.exercise.exercise1.utils;

import ss17_binary_file_serialization.exercise.exercise1.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFileUtils {
    public static List<Product> readDataFromFile(String path) {
        List<Product> productList = new ArrayList<>();

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            productList = (List<Product>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return productList;
    }
    public static void writeDataFromFile (String path, List<Product> productList) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);

            objectOutputStream.close();
            fileOutputStream.close();
        }
        catch (IOException  e){
            e.printStackTrace();
        }
    }
}
