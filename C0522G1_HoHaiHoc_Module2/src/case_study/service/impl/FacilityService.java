package case_study.service.impl;

import case_study.exception.*;
import case_study.model.Facility;
import case_study.model.House;
import case_study.model.Room;
import case_study.model.Villa;

import case_study.service.IFacilityService;
import case_study.utils.ReadWriteFacilityFileUtil;
import case_study.utils.RegexExceptionUtil;
import case_study.utils.Utils;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityService implements IFacilityService {
    private static Scanner scanner = new Scanner(System.in);
    private static final String PATH_VILLA = "CC0522G1_HoHaiHoc_Module2/src/case_study/data/villa.csv";
    private static final String PATH_HOUSE = "C0522G1_HoHaiHoc_Module2/src/case_study/data/house.csv";
    private static final String PATH_ROOM = "C0522G1_HoHaiHoc_Module2/src/case_study/data/room.csv";

    private void inputFacility(Facility facility) {
        Map<Facility, Integer> villaList = ReadWriteFacilityFileUtil.readFacilityFile(PATH_VILLA);
        Map<Facility, Integer> houseList = ReadWriteFacilityFileUtil.readFacilityFile(PATH_HOUSE);
        Map<Facility, Integer> roomList = ReadWriteFacilityFileUtil.readFacilityFile(PATH_ROOM);

        String serviceCode;
        String nameService;
        while (true) {
            try {
                System.out.print("Nhập vào mã dịch vụ: ");
                serviceCode = scanner.nextLine();
                if (facility instanceof Villa) {
                    if (!serviceCode.matches("^SVVL-\\d{4}$")) {
                        throw new IdFormatException("Mã dịch vụ không hợp lệ, vui lòng nhập theo định dạng " +
                                "SVVL-YYYY (với Y là số từ 0-9)!");
                    }

                    for (Facility villa : villaList.keySet()) {
                        if (serviceCode.equals(villa.getServiceCode())) {
                            throw new DuplicateIDException("Mã dịch vụ đã tồn tại, vui lòng nhập lại!");
                        }
                    }

                    nameService = "Villa";
                } else if (facility instanceof House) {
                    if (!serviceCode.matches("^SVHO-\\d{4}$")) {
                        throw new IdFormatException("Mã dịch vụ không hợp lệ, vui lòng nhập theo định dạng " +
                                "SVHO-YYYY (với Y là số từ 0-9)!");
                    }

                    for (Facility house : houseList.keySet()) {
                        if (serviceCode.equals(house.getServiceCode())) {
                            throw new DuplicateIDException("Mã dịch vụ đã tồn tại, vui lòng nhập lại!");
                        }
                    }

                    nameService = "House";
                } else {
                    if (!serviceCode.matches("^SVRO-\\d{4}$")) {
                        throw new IdFormatException("Mã dịch vụ không hợp lệ, vui lòng nhập theo định dạng " +
                                "SVRO-YYYY (với Y là số từ 0-9)!");
                    }

                    for (Facility room : roomList.keySet()) {
                        if (serviceCode.equals(room.getServiceCode())) {
                            throw new DuplicateIDException("Mã dịch vụ đã tồn tại, vui lòng nhập lại!");
                        }
                    }

                    nameService = "Room";
                }
                facility.setServiceCode(serviceCode);
                facility.setNameService(nameService);
                break;
            } catch (IdFormatException | DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.print("Nhập diện tích sử dụng (m2): ");
        double usabeArea;
        while (true) {
            try {
                usabeArea = Double.parseDouble(scanner.nextLine());
                if (usabeArea <= 30) {
                    throw new AreaInvalidException("Diện tích sử dụng phải là số thực lớn hơn 30m2!");
                }
                facility.setUsabeArea(usabeArea);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            } catch (AreaInvalidException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.print("Nhập chi phí thuê (VNĐ): ");
        int rentalCosts;
        while (true) {
            try {
                rentalCosts = Integer.parseInt(scanner.nextLine());
                if (rentalCosts <= 0) {
                    throw new NumberValueInvalidException("Giá trị nhập vào phải lớn hơn 0, vui lòng nhập lại!");
                }
                facility.setRentalCosts(rentalCosts);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            } catch (NumberValueInvalidException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.print("Nhập số người tối đa: ");
        int maximumPeople;
        while (true) {
            try {
                maximumPeople = Integer.parseInt(scanner.nextLine());
                if (maximumPeople <= 0 || maximumPeople >= 20) {
                    throw new MaxNumberOfPeopleInvalidException("Số lượng người tối đa phải lớn hơn 0 và nhỏ hơn 20!");
                }
                facility.setMaximumPeople(maximumPeople);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            } catch (MaxNumberOfPeopleInvalidException e) {
                System.out.println(e.getMessage());
            }
        }


        System.out.println("Nhập vào kiểu thuê");
        String leaseType = Utils.getLeaseType();

        facility.setLeaseType(leaseType);
    }


    @Override
    public void displayList() {
        System.out.println("\nDanh sách cơ sở: ");

        System.out.println("1. Danh sách Villa: ");

        Map<Facility, Integer> villaIntegerMap = ReadWriteFacilityFileUtil.readFacilityFile(PATH_VILLA);
        Set<Facility> villaSet = villaIntegerMap.keySet();
        for (Facility villa: villaIntegerMap.keySet()){
            System.out.println(villa + ",\t times: " + villaIntegerMap.get(villa));
        }

        System.out.println("2. Danh sách nhà: ");
        Map<Facility, Integer> houseIntegerMap = ReadWriteFacilityFileUtil.readFacilityFile(PATH_HOUSE);
        Set<Facility> houseSet = houseIntegerMap.keySet();
        for (Facility house: houseIntegerMap.keySet()){
            System.out.println(house + ",\t times: " + houseIntegerMap.get(house));
        }

        System.out.println("3. Danh sách phòng: ");
        Map<Facility, Integer> roomIntegerMap = ReadWriteFacilityFileUtil.readFacilityFile(PATH_ROOM);
        Set<Facility> roomSet = roomIntegerMap.keySet();
        for (Facility room: roomIntegerMap.keySet()){
            System.out.println(room + ",\t times: " + roomIntegerMap.get(room));
        }

    }

    @Override
    public void add() {
        while (true){
            System.out.println("Thêm cơ sở:\n " +
                    "1. Thêm Villa.\n" +
                    "2. Thêm nhà. \n" +
                    "3. Thêm phòng. \n" +
                    "4. Trở về meu quản lý cơ sở.");

            int choice = 0;
            try{
                System.out.print("Lựa chọn của bạn: ");
                choice = Integer.parseInt(scanner.nextLine());
            }
            catch (NumberFormatException e){
                System.out.println("Vui lòng nhập kiểu số");
                e.printStackTrace();
            }
            switch (choice){
                case 1: {
                    Map<Facility, Integer> villaList = ReadWriteFacilityFileUtil.readFacilityFile(PATH_VILLA);
                    Villa villa = new Villa();
                    inputFacility(villa);

                    System.out.println("Nhập vào tiêu chuẩn phòng: ");
                    String roomStandardVilla = RegexExceptionUtil.getRoomStandard();
                    villa.setRoomStandard(roomStandardVilla);

                    System.out.println("Nhập vào diện tích hồ bơi: ");
                    double poolArea;
                    while (true) {
                        try {
                            poolArea = Double.parseDouble(scanner.nextLine());
                            if (poolArea <= 30) {
                                throw new AreaInvalidException("Diện tích sử dụng phải là số thực lớn hơn 30m2!");
                            }
                            villa.setUsabeArea(poolArea);
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Vui lòng nhập số!");
                        } catch (AreaInvalidException e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    System.out.println("Nhập tầng: ");
                    Integer floorVilla = RegexExceptionUtil.getNumberGreaterThan0();
                    villa.setFloor(floorVilla);


                    villaList.put(villa, 0);
                    ReadWriteFacilityFileUtil.writeFacilityFile(PATH_VILLA, villaList);

                    System.out.println("Thêm mới thành công!");
                    break;
                }

                case 2: {
                    Map<Facility, Integer> houseList = ReadWriteFacilityFileUtil.readFacilityFile(PATH_HOUSE);
                    House house = new House();
                    inputFacility(house);

                    System.out.println("Nhập vào tiêu chuẩn phòng: ");
                    String roomStandardHouse = RegexExceptionUtil.getRoomStandard();
                    house.setRoomStandard(roomStandardHouse);

                    System.out.println("Nhập tầng: ");
                    Integer floorHouse = RegexExceptionUtil.getNumberGreaterThan0();
                    house.setFloor(floorHouse);

                    houseList.put(house, 0);
                    System.out.println("Add successfull!");
                    ReadWriteFacilityFileUtil.writeFacilityFile(PATH_HOUSE,houseList);
                    break;
                }
                case 3:{
                    Map<Facility, Integer> roomList = ReadWriteFacilityFileUtil.readFacilityFile(PATH_ROOM);
                    Room room = new Room();
                    inputFacility(room);

                    System.out.println("Nhập vào dịch vụ miễn phí đi kèm");
                    String freeService = scanner.nextLine();
                    room.setFreeService(freeService);

                    roomList.put(room,0);
                    ReadWriteFacilityFileUtil.writeFacilityFile(PATH_ROOM,roomList);
                    System.out.println("Add successfull!");
                    break;
                }
                case 4: return;
            }
        }
    }

}
