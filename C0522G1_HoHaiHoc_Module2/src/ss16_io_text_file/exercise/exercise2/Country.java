package ss16_io_text_file.exercise.exercise2;

public class Country {
    private int id;
    private String code;
    private String name;

    public Country(){
    }

    public Country(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return String.format("%s,%s,%s\n", this.getId(), this.getCode(), this.getName());
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s\n", this.getId(), this.getCode(), this.getName());
    }
}
