package maktab.dao;

import maktab.Entity.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
        Employee employee = new Employee();
        employee.setName(resultSet.getString("name"));
        employee.setId(resultSet.getInt("id"));
        return employee;
    }
}
