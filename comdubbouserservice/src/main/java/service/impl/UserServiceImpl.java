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

    public void addUser(User user) {
        int rows = userMapper.insert(user);
        if (rows==0){
            throw new RuntimeException("添加用户失败！");
        }
    }

    public String sayHello(String msg) {
        return msg;
    }

    @Override
    public void DeleteUser(Integer uid) {
        int rows = userMapper.deleteByPrimaryKey(uid);
        if (rows==0){
            throw new RuntimeException("删除用户失败！");
        }
    }
}
