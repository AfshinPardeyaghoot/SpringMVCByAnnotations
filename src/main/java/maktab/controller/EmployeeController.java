package maktab.controller;

import maktab.Entity.Employee;
import maktab.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {


    private EmployeeService employeeService ;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public ModelAndView getAllStudents(){
        List<Employee> employees = employeeService.getAllEmployee();
        ModelAndView modelAndView = new ModelAndView("allEmployees");
        modelAndView.addObject("employee",employees);
        return modelAndView ;
    }

    @RequestMapping(value = "/getById",method = RequestMethod.GET)
    protected ModelAndView handleRequestInternal2(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        Integer id = Integer.valueOf(httpServletRequest.getParameter("id"));
        Employee employee = employeeService.getEmployeeById(id);
        ModelAndView modelAndView = new ModelAndView("getEmpByID");
        modelAndView.addObject("employee",employee);
        return modelAndView;
    }

    @RequestMapping(value = "/create")
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        String name = httpServletRequest.getParameter("name");
        Employee employee = new Employee();
        employee.setName(name);
        employeeService.createEmployee(employee);
        ModelAndView modelAndView = new ModelAndView("createEmployee");
        return modelAndView ;
    }

    @RequestMapping(value = "/delete")
    protected ModelAndView handleRequestInternal3(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        Integer id = Integer.valueOf(httpServletRequest.getParameter("id"));
        employeeService.deleteEmployee(id);
        ModelAndView modelAndView = new ModelAndView("deleteEmp");
        return modelAndView;
    }




}
