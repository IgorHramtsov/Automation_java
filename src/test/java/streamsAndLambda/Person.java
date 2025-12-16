package streamsAndLambda;

public class Person {
    private final String name;
    private final int age;
    private final String city;
    private final boolean active;
    private final int income;

    public Person(String name, int age, String city, boolean active, int income) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.active = active;
        this.income = income;
    }

    public String getName() {
        return name; }
    public int getAge() {
        return age; }
    public String getCity() {
        return city; }
    public boolean isActive() {
        return active; }
    public int getIncome() {
        return income; }

    @Override
    public String toString() {
        return name + " (" + age + ", " + city + ", income=" + income + ")";
    }
}
