package API_tests;

public class ColorsData {

    public Integer id;
    public String name;
    public int year;
    public String color;
    public String pantone_value;

    public ColorsData() {}

    public ColorsData(Integer id, int year, String name, String color, String pantone_value) {
        this.id = id;
        this.year = year;
        this.name = name;
        this.color = color;
        this.pantone_value = pantone_value;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getPantone_value() {
        return pantone_value;
    }
}
