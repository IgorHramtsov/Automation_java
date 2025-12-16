package API_tests;

import java.util.Date;

public class CreateUser {

    private String name;
    private String job;
    private String id;
    private Date createdAt;

    public CreateUser() {
    }

    public CreateUser(String name, String job, String id, Date createdAt) {
        this.name = name;
        this.job = job;
        this.id = id;
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public String getId() {
        return id;
    }
}
