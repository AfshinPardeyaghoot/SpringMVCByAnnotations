package maktab.dao;

import maktab.Entity.Employee;

import java.util.List;

public interface AbstractEmployeeDAO {

    Employee getEmployeeById(Integer id);
    List<Employee> getAllEmployee() ;
    boolean deleteEmployee(Employee employee);
    boolean updateEmployee(Employee employee);
    boolean createEmployee(Employee employee);

}
