package repository;

import repository.pojo.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserData {
    public static List<User> userList = new ArrayList<>();

    static {
        userList.add(new User("江婷婷", "00001", User.NORMAL, new Date(), new Date()));
        userList.add(new User("曾帅智", "00002", User.MANAGER, new Date(), new Date()));
        userList.add(new User("江婷婷", "00003", User.NORMAL, new Date(), new Date()));
        userList.add(new User("江婷婷", "00004", User.NORMAL, new Date(), new Date()));
        userList.add(new User("曾帅智", "00002", User.MANAGER, new Date(), new Date()));
        userList.add(new User("江婷婷", "00006", User.NORMAL, new Date(), new Date()));
        userList.add(new User("曾帅智", "00002", User.MANAGER, new Date(), new Date()));
        userList.add(new User("江婷婷", "00007", User.NORMAL, new Date(), new Date()));
    }

}
