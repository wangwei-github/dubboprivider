package service;

import pojo.User;

public interface UserService {

    Integer addUser(User user);
    String sayHello(String msg);
}
