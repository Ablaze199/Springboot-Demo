package com.spring.demo.springcontroler;

import com.spring.demo.model.Employee;
import com.spring.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    //display list of employees
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listEmployees", employeeService.getAllEmployees());
        return "index";
    }
    @GetMapping("/showNewEmployeeform")
    public String showNewEmployeeform( Model model){
        //create model attribute to bind data
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "new_employee";

    }
}
