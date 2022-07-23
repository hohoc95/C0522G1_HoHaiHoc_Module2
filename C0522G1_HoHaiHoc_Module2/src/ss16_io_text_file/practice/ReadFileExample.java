package ss16_io_text_file.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText (String filePath){
        try {
            File file = new File(filePath);

            if(!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;

            while ((line = br.readLine()) != null){
                System.out.print(line + ", ");
                sum += Integer.parseInt(line);
            }

            br.close();

            System.out.print("\nTổng = " + sum);
        }
        catch (Exception e){
            System.err.print("File không tồn tại hoặc bạn không có quyền truy cập file.");
        }
    }

    public static void main(String[] args) {
        System.out.print("Nhập đường dẫn file: ");
        //D:\hohoc95-C0522G1_HoHaiHoc_Module2\C0522G1_HoHaiHoc_Module2\src\ss16_io_text_file\practice\input.txt
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFileEx = new ReadFileExample();
        readFileEx.readFileText(path);
    }
}
