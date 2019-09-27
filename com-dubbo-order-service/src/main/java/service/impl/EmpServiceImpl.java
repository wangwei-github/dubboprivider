package service.impl;

import mappers.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Emp;
import service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;


    @Override
    public void addEmp(Emp emp) {
        int rows = empMapper.insert(emp);
        if (rows==0){
            throw new RuntimeException("添加员工失败！");
        }
    }

    @Override
    public String sayHelloEmp(String msg) {
        return msg +"666666666666";
    }


    @Override
    public void deleteEmp(Integer empno) {

        int rows = empMapper.deleteByPrimaryKey(empno);
        if (rows==0){
            throw new RuntimeException("删除员工信息失败！");
        }
    }
}
