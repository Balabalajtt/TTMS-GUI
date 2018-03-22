package repository.pojo;

import java.util.Date;

public class User {
    public String userName;
    public String userId;
    public int userType;
    public Date registerDate;
    public Date lastDate;

    public static final int NORMAL = 0;
    public static final int MANAGER = 1;


    public User(String userName, String userId, int userType, Date registerDate, Date lastDate) {
        this.userName = userName;
        this.userId = userId;
        this.userType = userType;
        this.registerDate = registerDate;
        this.lastDate = lastDate;
    }
}
