package ss10_dsa_list.practice.practice1_simple_list_class.model;

import java.util.Arrays;

public class MyList<E> {

    /**
     * size: kích thước mảng
     * DEFAULT_CAPACITY: kích thước mặc định
     * elements[]: mảng ban đầu
     */

    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    /**
     * Khởi tạo mảng ban đầu với kích thước mặc định
     */

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    /**
     *  Mục đích: Tăng gấp đôi kích thước mảng chứa các phần tử
     */
    private void  ensureCapa(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    /**
     * Cài đặt phương thức add()
     * Mục đích: thêm một phần tử vào cuối của danh sách
     * Tham số đầu vào: phần tử cần thêm vào danh sách
     */

    public void add(E e){
        if (size == elements.length){
            ensureCapa();
        }
        elements[size++] = e;
    }
    /**
     * Cài đặt phương thức get()
     * Mục đích: p/t get() trả về phần tử vừa ở vị trí thứ i trong danh sách.
     * Tham số đầu vào: số nguyên chứa vị trí cần truy cập đến phần tử trong dách sách
     */
    public E get (int i) {
        if (i >= size || i < 0){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size" +i);
        }
        return (E) elements[i];
    }
}
