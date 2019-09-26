package service.impl;

import mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.User;
import service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public Integer addUser(User user) {
        int rows = userMapper.insert(user);
        return rows;
    }

    public String sayHello(String msg) {
        return msg;
    }
}
