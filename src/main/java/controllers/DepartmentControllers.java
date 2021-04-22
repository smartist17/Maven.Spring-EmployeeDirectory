package controllers;


import Services.DepartmentService;
import models.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class DepartmentControllers {

    @Autowired
    public DepartmentService departmentService;


    @PutMapping("/departments/{id}")
    public ResponseEntity<Department> updateDepartment (@RequestBody Department department) {
        return new ResponseEntity<Department>(departmentService.updateDepartment(department), HttpStatus.OK);
    }

    @PostMapping("/departments")
    public ResponseEntity<Department> addDepartment (@RequestBody Department department){
        return new ResponseEntity<Department>(departmentService.createDepartment(department), HttpStatus.CREATED);
    }


}
