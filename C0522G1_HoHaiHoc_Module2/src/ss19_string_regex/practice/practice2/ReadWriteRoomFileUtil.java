package ss19_string_regex.practice.practice2;

import case_study.model.Room;

import java.io.*;
import java.util.*;

public class ReadWriteRoomFileUtil {
    private static List<String> readFile(String path) {
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

    public static Map<Room, Integer> readRoomFile(String path) {
        List<String> strings = readFile(path);
        Map<Room, Integer> roomIntegerMap = new LinkedHashMap<>();
        String[] info;
        for (String line : strings) {
            info = line.split(",");
            Room room = new Room(info[0],info[1],
                    Double.parseDouble(info[2]),
                    Double.parseDouble(info[3]),
                    Integer.parseInt(info[4]),
                    info[5],
                    info[6]);
            roomIntegerMap.put(room,Integer.parseInt(info[7]));
        }
        return  roomIntegerMap;
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

    public static void writeRoomFile (String path, Map<Room, Integer> roomIntegerMap) {
        String data = "";
        Set<Room> roomSet = roomIntegerMap.keySet();

        for (Room room : roomSet){
            data += room.getInfo() + ", " + roomIntegerMap.get(room) + "\n";
        }
        writeFile(path, data.substring(0, data.length() -1));
    }
}
