package maktab.service;

import maktab.Entity.Employee;
import maktab.dao.AbstractEmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private AbstractEmployeeDAO abstractEmployeeDAO;

    @Autowired
    public EmployeeService(AbstractEmployeeDAO abstractEmployeeDAO) {
        this.abstractEmployeeDAO = abstractEmployeeDAO;
    }

    public List<Employee> getAllEmployee(){
        List<Employee> employees = abstractEmployeeDAO.getAllEmployee();
        return employees;
    }

    public Employee getEmployeeById(Integer id){
        Employee employee = abstractEmployeeDAO.getEmployeeById(id);
        return employee;
    }

    public void createEmployee(Employee employee){
        abstractEmployeeDAO.createEmployee(employee);
    }

    public void deleteEmployee(Integer id){
        Employee employee = abstractEmployeeDAO.getEmployeeById(id);
        abstractEmployeeDAO.deleteEmployee(employee);
    }

}
