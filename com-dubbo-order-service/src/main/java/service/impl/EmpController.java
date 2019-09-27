package service.impl;

import common.ControllerBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.Emp;
import service.EmpService;
import utils.JsonResult;

@RestController
@RequestMapping("emp")
public class EmpController extends ControllerBase {
    @Autowired
    private EmpService empService;
    @RequestMapping("add.do")
    public JsonResult<Emp> hello(Emp emp) {
       empService.addEmp(emp);
       empService.sayHelloEmp("==============");
        return new JsonResult<>(SUCCESS, emp.getEname() + ",欢迎加入我们！", emp);
    }

    @RequestMapping("delete.do")
    public JsonResult<Void> addEmp(Integer empno) {
        empService.deleteEmp(empno);
        return new JsonResult<>(SUCCESS, "删除id为：" + empno + " 的员工成功！");
    }

    @RequestMapping("hello.do")
    public JsonResult<Void> hello() {

        return new JsonResult<>(SUCCESS, " emp hello！");
    }

}
