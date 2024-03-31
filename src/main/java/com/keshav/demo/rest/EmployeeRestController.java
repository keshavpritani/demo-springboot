package com.keshav.demo.rest;

import com.keshav.demo.entity.Employee;
import com.keshav.demo.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    private List<Employee> getAllEmployees() {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    private Employee getEmployee(@PathVariable int employeeId) {
        return employeeService.findById(employeeId);
    }

    @PostMapping("/employees")
    private Employee createEmployee(@RequestBody Employee employee) {
        employee.setId(0);
        return employeeService.save(employee);
    }

    @PutMapping("/employees/update")
    private Employee updateEmployee(@RequestBody Employee employee) {
        Employee currentEmployee = employeeService.findById(employee.getId());

        currentEmployee.setFirstName(employee.getFirstName());
        currentEmployee.setLastName(employee.getLastName());
        currentEmployee.setEmail(employee.getEmail());

        return employeeService.save(currentEmployee);
    }

    @DeleteMapping("/employees/delete/{employeeId}")
    private String deleteEmployee(@PathVariable int employeeId) {
        System.out.println("Deleting employee with Id = " + employeeId);
        Employee employee = getEmployee(employeeId);
        employeeService.deleteById(employeeId);
        return "Deleted Employee = " + employee;
    }
}
