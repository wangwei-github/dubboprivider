package service.impl;

import common.ControllerBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.User;
import service.UserService;
import utils.JsonResult;

@RestController
@RequestMapping("user")
public class UserController extends ControllerBase {
    @Autowired
    private UserService userService;

    @RequestMapping("add.do")
    public JsonResult<User> addUser(User user) {
        userService.addUser(user);
        return new JsonResult<>(SUCCESS, user.getUsername() + ",欢迎加入我们！", user);
    }

    @RequestMapping("delete.do")
    public JsonResult<Void> deleteUser(Integer uid) {
        userService.DeleteUser(uid);
        return new JsonResult<>(SUCCESS, "删除id为：" + uid + " 的用户成功！");
    }
}
