package ims.spr.api.controllers;

import ims.spr.core.utilities.results.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ims.spr.business.abstracts.EmployeeService;
import ims.spr.entities.concretes.Employee;

import java.util.List;

@RestController
@RequestMapping("api/employees")
public class EmployeesController {
    private EmployeeService employeeService;

    public EmployeesController() {
        super();
    }

    @Autowired
    public EmployeesController(EmployeeService employeeService) {
        super();
        this.employeeService = employeeService;
    }

    @GetMapping("/getall")
    public DataResult<List<Employee>> getAll() {
        return this.employeeService.getAll();
    }

    @GetMapping("/getByIsno")
    public DataResult<Employee> getByIsno(@RequestParam int isno) {
        return this.employeeService.getByIsno(isno);
    }

    @GetMapping("/getByRfid")
    public DataResult<Employee> getByRfid(@RequestParam String rfid){
        return this.employeeService.getByRfid(rfid);
    }

    @GetMapping("/getByTel")
    public DataResult<Employee> getByTel(@RequestParam long tel){
        return this.employeeService.getByTel(tel);
    }

}
