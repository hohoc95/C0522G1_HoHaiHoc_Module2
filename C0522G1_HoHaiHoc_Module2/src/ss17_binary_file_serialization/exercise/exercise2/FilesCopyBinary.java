package ss17_binary_file_serialization.exercise.exercise2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class FilesCopyBinary {
    public static void main(String[] args) {
        String sourcePath ="src/ss17_binary_file_serialization/exercise/exercise2/FileSource.csv";
        String destPath = "src/ss17_binary_file_serialization/exercise/exercise2/FileDest.csv";
        Scanner in = new Scanner(System.in);

        try {
            File sourceFile = new File(sourcePath);
            File destFile = new File(destPath);
            if (destFile.exists()){
                throw new FileExistsException("File đã tồn tại!");
            }
            copyFileUsingStream(sourceFile,destFile);
        }catch (IOException e){
            e.printStackTrace();
        } catch (FileExistsException e){
            System.out.println(e.getMessage());
        }
    }

    private static void copyFileUsingJava8File(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        int count = 0;
        try {
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(dest);
            byte [] buffer = new byte[1024];
            int length;

            while ((length = inputStream.read(buffer)) > 0){
                outputStream.write(buffer, 0, length);
                count += length;
            }
            System.out.println("số lần xuất hiện trong file là: " + count);
        }
        finally {
            inputStream.close();
            outputStream.close();
        }
    }
}
