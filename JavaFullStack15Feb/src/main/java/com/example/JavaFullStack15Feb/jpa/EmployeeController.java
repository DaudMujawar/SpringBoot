package com.example.JavaFullStack15Feb.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @PostMapping(value = "saveEmployee")
    public String saveEmp(@RequestBody Employee employee) {
        employeeRepository.save(employee);
        return "Employee Saved Successfully...";
    }

    @GetMapping(value = "getEmployee")
    public List<Employee> getListEmp() {
        return employeeRepository.findAll();
    }

//    @DeleteMapping(value = "deleteById/{id}")
//    public String deleteEmp(@PathVariable Long id) {
//        employeeRepository.deleteById(id);
//        return "Employee deleted successfully...";
//    }

    @DeleteMapping(value = "deleteById/{id}")
    public ResponseEntity<?> deleteEmp(@PathVariable Long id) {

        Optional<Employee> employee = employeeRepository.findById(id);
        if (employee.isPresent()) {
            employeeRepository.delete(employee.get());
            return new ResponseEntity<>(employee, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Record Not Found", HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping(value = "update/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Employee employee) {

        Employee update = employeeRepository.findById(id).get();
        update.setAddress(employee.getAddress());
        update.setName(employee.getName());

        employeeRepository.save(update);
        return new ResponseEntity<>(update, HttpStatus.OK);
    }

}
