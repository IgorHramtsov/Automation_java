package hometask_12.task1;

public class Person {
    @Annotation1(name = "Name field")
    private String name;
    private int age;
    @Annotation1(name = "Height field")
    private int height;

    private String surname;

    public Person(String name, int age, int height, String surname) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", surname='" + surname + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void printName() {
        System.out.println("Name: " + name);;
    }

    public boolean isHigherThan170cm() {
        if (getHeight() > 170) {
            return true;
        } else {
            return false;
        }
    }

    public int doubleAge() {
        return getAge()*2;
    }
}
