package ss16_io_text_file.exercise.exercise2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileCSVRead {
    public static void main(String[] args)  throws IOException {
        File file = new File("D:\\hohoc95-C0522G1_HoHaiHoc_Module2\\C0522G1_HoHaiHoc_Module2\\src\\ss16_io_text_file\\exercise\\exercise2\\CSV.txt");

        FileReader fileReader = new FileReader(file);

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        String [] list;

        List<Country> countries = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null){
            list = line.split(",");
            countries.add(new Country(Integer.parseInt(list[0]), list[1], list[2]));
        }
        bufferedReader.close();

        //System.out.print("Danh sách các quốc gia: ");
        System.out.print(countries);

    }
}
