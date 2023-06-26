package EmployeeMagnment.EmployeeMangnementAssignment.Controller;

import EmployeeMagnment.EmployeeMangnementAssignment.Model.Employee;
import EmployeeMagnment.EmployeeMangnementAssignment.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/")
    ResponseEntity<String> createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @GetMapping("/getAllEmployee")
    public List<Employee> getListOfEmployee() {
        return employeeService.getListOfEmployee();
    }

    @PutMapping("/update/{id}")
    ResponseEntity<String> updateEmployee(@RequestBody Employee employee, @PathVariable int id) {
        return employeeService.updateEmployee(employee, id);
    }

    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@RequestBody Employee employee, @PathVariable int id) {
        return employeeService.deleteById(employee, id);
    }

    @DeleteMapping("/deleteAll")
    ResponseEntity<String> deleteAll(@RequestBody List<Employee> deleteList) {
        return employeeService.deleteAll(deleteList);
    }

    @GetMapping("/getById/{id}")
    public Optional<Employee> getById(@PathVariable int id) {
        return employeeService.getById(id);
    }
//    @GetMapping("/getByName/{firstName}")
//    public List<Employee>getByFirstName(@PathVariable String firstName){
//        return employeeService.getByFirstName(firstName);
//    }
}