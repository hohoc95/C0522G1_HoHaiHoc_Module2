package ss6_inheritance.practice.model;

public class GeometricObjects {

    //Có hai thuộc tính là color (String) và filled (boolean).

    //Có hai phương thức khởi tạo, một trong số đó không cần đối số đầu vào mà sử dụng giá trị mặc định:
    //                                                              "green" cho color và true cho filled.
    // Phương thức khởi tạo còn lại đặt giá trị cho thuộc tính của color và filled theo giá trị của đối số truyền vào.

    private String color = "green";
    private boolean filled = true;

    public GeometricObjects(){

    }

    public GeometricObjects(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    //Có các getter cho tất cả các thuộc tính.
    public String getColor() {
        return color;
    }
    public boolean isFilled() {
        return filled;
    }

    //Setter cho tất cả các thuộc tính
    public void setColor(String color) {
        this.color = color;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    //Được cài đè phương thức toString trả về chuỗi ký tự theo mẫu "A Shape with color of xxx and filled/not filled".
    @Override
    public String toString(){
        return String.format("A Shape with color of %s and %s filled",color, filled);
    }

}
