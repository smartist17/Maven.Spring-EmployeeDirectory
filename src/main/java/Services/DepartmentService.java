package Services;

import controllers.DepartmentControllers;
import models.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.DepartmentRepository;

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    EmployeeService employeeService;

    public Department createDepartment(Department department){
        return departmentRepository.save(department);
    }

    public Department updateDepartment(Department department){
        return departmentRepository.save(department);
    }

    public Department getDepartment(Long id) {
        return departmentRepository.findOne(id);
    }

    //public Department setManager(Long id, Long managerId){


}
