package service;

import pojo.User;

public interface UserService {

    void addUser(User user);
    String sayHello(String msg);
    void DeleteUser(Integer uid);
}
