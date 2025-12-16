package API_tests;

public class UserData {

    private Integer id;
    private String email;
    private String first_name;
    private String last_name;
    private String avatar;

    public UserData() {}

    public UserData(Integer id, String email, String avatar, String last_name, String first_name) {
        this.id = id;
        this.email = email;
        this.avatar = avatar;
        this.last_name = last_name;
        this.first_name = first_name;
    }

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getFirst_name() {
        return first_name;
    }
}
