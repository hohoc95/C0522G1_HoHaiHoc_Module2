package phone_mvc.service.impl;

import phone_mvc.exception.AmountException;
import phone_mvc.exception.NotFoundProductException;
import phone_mvc.exception.PriceException;
import phone_mvc.exception.WarrantyPeriodException;
import phone_mvc.model.GenuinePhone;
import phone_mvc.model.Phone;
import phone_mvc.service.IGenuinePhoneService;
import phone_mvc.utils.ReadWritePhoneUtils;

import java.util.List;
import java.util.Scanner;

public class GenuinePhoneService implements IGenuinePhoneService {

    private static Scanner scanner = new Scanner(System.in);
    private static final String PATH_GENUINE_PHONE = "C0522G1_HoHaiHoc_Module2/src/phone_mvc/data/genuinephone.csv";
    //private static List<GenuinePhone> genuinePhoneList = new ArrayList<>();

    @Override
    public void add() {
        List<Phone> phoneList = ReadWritePhoneUtils.readPhoneFile(PATH_GENUINE_PHONE);

        int phoneID;
        if (phoneList.size() == 0) {
            phoneID = 1;
        } else {
            phoneID = phoneList.get(phoneList.size() - 1).getPhoneId() + 1;
        }

        System.out.println("Nhập vào tên điện thoại: ");
        String phoneName = scanner.nextLine();

        int price;
        while (true) {
            try {
                System.out.println("Nhập số tiền");
                price = Integer.parseInt(scanner.nextLine());
                if (price <= 0) {
                    throw new PriceException("Số tiền phải lớn hơn 0");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            } catch (PriceException e) {
                System.out.println(e.getMessage());
            }
        }

        int amount;
        while (true) {
            try {
                System.out.println("vui lòng nhập số lượng");
                amount = Integer.parseInt(scanner.nextLine());
                if (amount <= 0) {
                    throw new AmountException("Số lượng phải lớn hơn 0");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("vui lòng nhập số!");
            } catch (AmountException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Nhập vào nhà sản xuất: ");
        String producer = scanner.nextLine();

//        System.out.println("Nhập vào thời hạn bảo hành: ");
//        int warrantyPeriod = Integer.parseInt(scanner.nextLine());

        int warrantyPeriod;
        while (true) {
            try {
                System.out.println("Nhập vào thời hạn bảo hành");
                warrantyPeriod = Integer.parseInt(scanner.nextLine());
                if (warrantyPeriod <= 0 || warrantyPeriod > 730) {
                    throw new WarrantyPeriodException("Thời gian bảo hành phải >0 và <=730 ngày");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số");
            } catch (WarrantyPeriodException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Nhập phạm vi bảo hành: ");
        String warrantyCoverage = scanner.nextLine();

        phoneList.add(new GenuinePhone(phoneID, phoneName, price,
                amount, producer, warrantyPeriod, warrantyCoverage));
        ReadWritePhoneUtils.writePhoneFile(PATH_GENUINE_PHONE, phoneList);
        System.out.println("Thêm mới thành công.");

    }

    @Override
    public void remove() {
        List<Phone> phoneList = ReadWritePhoneUtils.readPhoneFile(PATH_GENUINE_PHONE);
        boolean isExist = false;
        int idRemove;

        do {
            System.out.println("Mời bạn nhập id cần xóa: ");
            idRemove = Integer.parseInt(scanner.nextLine());
            for (Phone phone : phoneList) {
                if (phone.getPhoneId() == idRemove) {
                    System.out.println("Điện thoại cần xóa: ");
                    System.out.println(phone);
                    System.out.println("Bạn có chắc muốn xóa hay không? \n" +
                            "1. Nhấn phím '1' nếu chọn CÓ. \n" +
                            "2. Nhấn phím khác nếu chọn KHÔNG.");
                    String luaChon = scanner.nextLine();
                    if (luaChon.equals("1")) {
                        phoneList.remove(phone);
                        ReadWritePhoneUtils.writePhoneFile(PATH_GENUINE_PHONE, phoneList);
                        System.out.println("xóa thành công");
                    }
                    isExist = true;
                    break;
                }
            }
            try {
                if (!isExist) {
                    throw new NotFoundProductException("Id không tồn tại");
                }
            } catch (NotFoundProductException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }

        } while (!isExist);
    }

    @Override
    public void displayList() {
        List<Phone> phoneList = ReadWritePhoneUtils.readPhoneFile(PATH_GENUINE_PHONE);
        for (Phone phone : phoneList) {
            System.out.println(phone);
        }
    }

    @Override
    public void searchByName() {
        List<Phone> phoneList = ReadWritePhoneUtils.readPhoneFile(PATH_GENUINE_PHONE);
        boolean isExist = false;
        System.out.println("Nhập id hoặc tên điện thoại");
        String search = scanner.nextLine();
        for (Phone phone : phoneList) {
            if (phone.getPhoneName().contains(search) || Integer.toString(phone.getPhoneId()).contains(search)) {
                System.out.println(phone);
                isExist = true;
            }
            if (!isExist) {
                System.out.println("Không tìm thấy");
            }

        }
    }
}
