package ss19_string_regex.practice.practice2;

import case_study.model.Villa;

import java.io.*;
import java.util.*;

public class ReadWriteVillaFileUtil {
    private static List<String> readFile(String path){
        List<String> strings = new ArrayList<>();
        String line;
        try{
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null ){
                strings.add(line);
            }

            bufferedReader.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        return strings;
    }

    public static Map<Villa, Integer> readVillaFile (String path) {
        List<String> strings = readFile(path);
        Map<Villa, Integer> villaIntegerLinkedHashMap = new LinkedHashMap<>();
        String[] info;
        for (String line : strings){
            info = line.split(",");
            Villa villa = new Villa(info[0],info[1],
                    Double.parseDouble(info[2]),
                    Double.parseDouble(info[3]),
                    Integer.parseInt(info[4]),
                    info[5],
                    info[6],
                    Double.parseDouble(info[7]),
                    Integer.parseInt(info[8]));
            villaIntegerLinkedHashMap.put(villa,Integer.parseInt(info[9]));
        }
        return villaIntegerLinkedHashMap;
    }

    private static void writeFile (String path, String data)  {
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        }
        catch (IOException e){

        }

    }

    public static void writeVillaFile (String path, Map<Villa, Integer> villaIntegerMap) {
        String data = "";
        Set<Villa> villaSet = villaIntegerMap.keySet();
        for (Villa villa : villaSet){
            data += villa.getInfo() + ", " + villaIntegerMap.get(villa) + "\n";
        }

        writeFile(path, data.substring(0, data.length() -1));
    }
}