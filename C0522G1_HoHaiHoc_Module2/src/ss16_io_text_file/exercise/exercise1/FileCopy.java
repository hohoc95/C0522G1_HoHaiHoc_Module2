package ss16_io_text_file.exercise.exercise1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileCopy {
    public static List<String> readFile(String path) {
        List<String> list = new ArrayList<>();
        File file = new File(path);
        String line;
        int sum = 0;

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                sum += line.length();
                list.add(line);
            }

            bufferedReader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Số ký tự có trong file là: " + sum);
        return list;
    }

    public static void writeFile(String path, List<String> list) {
        File file = new File(path);

        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (String str : list) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String source = "src/ss16_io_text_file/exercise/exercise1/source.txt";
        String target = "src/ss16_io_text_file/exercise/exercise1/target.txt";
        FileCopy.writeFile(target,FileCopy.readFile(source));
    }
}