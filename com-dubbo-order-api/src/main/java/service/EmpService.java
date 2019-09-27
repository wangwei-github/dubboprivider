package service;

import pojo.Emp;

public interface EmpService {

   void addEmp(Emp emp) ;
   String sayHelloEmp(String msg);
   void deleteEmp(Integer empno);
}
