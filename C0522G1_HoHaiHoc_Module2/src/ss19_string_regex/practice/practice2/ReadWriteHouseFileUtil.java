package ss19_string_regex.practice.practice2;

import case_study.model.House;

import java.io.*;
import java.util.*;

public class ReadWriteHouseFileUtil {
    private static List<String> readFile (String path) {
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

    public static Map<House, Integer> readHouseFile (String path) {
        List<String> strings = readFile(path);
        Map<House, Integer> houseIntegerMap = new LinkedHashMap<>();
        String[] info;
        for (String line : strings){
            info = line.split(",");
            House house = new House(info[0],info[1],
                    Double.parseDouble(info[2]),
                    Double.parseDouble(info[3]),
                    Integer.parseInt(info[4]),
                    info[5],
                    info[6],
                    Integer.parseInt(info[7]));
            houseIntegerMap.put(house,Integer.parseInt(info[8]));
        }
        return houseIntegerMap;
    }

    private static void writeFile (String path, String data) {
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

    public static void writeHouseFile (String path, Map<House, Integer> houseIntegerMap) {
        String data = "";
        Set<House> houseSet = houseIntegerMap.keySet();

        for (House house : houseSet){
            data += house.getInfo() + ", " + houseIntegerMap.get(house) + "\n";
        }

        writeFile(path, data.substring(0, data.length() -1));
    }
}
