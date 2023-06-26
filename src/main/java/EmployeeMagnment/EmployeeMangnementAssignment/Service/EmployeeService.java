package EmployeeMagnment.EmployeeMangnementAssignment.Service;

import EmployeeMagnment.EmployeeMangnementAssignment.Model.Employee;
import EmployeeMagnment.EmployeeMangnementAssignment.Repository.IServiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    IServiceRepo iServiceRepo;
    public ResponseEntity<String> createEmployee(Employee employee) {
        employee.setSalary(-1);
        employee.setJobRole("");
        iServiceRepo.save(employee);
        return  new ResponseEntity<>("Employee Created a Successfully", HttpStatus.CREATED);
    }

    public List<Employee> getListOfEmployee() {
        return iServiceRepo.findAll();
    }

    public ResponseEntity<String> updateEmployee(Employee employee, int id) {

        if(!iServiceRepo.findById(id).isPresent()){
            return new ResponseEntity<>("Employee Record Does Not Exist",HttpStatus.NOT_FOUND);
        }

        Employee employeeDetails=iServiceRepo.findById(id).get();
        if(employee.getEmail()!=null){
            employeeDetails.setEmail(employee.getEmail());
        }
        if(employee.getFirstName()!=null){
            employeeDetails.setFirstName(employee.getFirstName());
        }
        if(employee.getLastName()!=null){
            employeeDetails.setLastName(employee.getLastName());
        }
        if(employee.getPhoneNumber()!=null){
            employeeDetails.setPhoneNumber(employee.getPhoneNumber());
        }
        iServiceRepo.save(employeeDetails);
        return new ResponseEntity<>("Updated Successfully",HttpStatus.OK);

    }

    public String deleteById(Employee employee, int id) {
      if  (!iServiceRepo.findById(id).isPresent()) {
          return "Id Not Found";
      }
       iServiceRepo.deleteById(id);
      return "String Delete SuccssFully";
    }


    public ResponseEntity<String> deleteAll(List<Employee> deleteList) {
        iServiceRepo.deleteAll();
        return new ResponseEntity<>("Deleted Successfully",HttpStatus.OK);
    }




    public Optional<Employee> getById(int id) {
        return iServiceRepo.findById(id);
    }

//    public List<Employee> getByFirstName(String firstName) {
//        return iServiceRepo.getByFirstName(firstName);
//    }


//    public List<Employee> getByFirstName(String firstName) {
//        return iServiceRepo.getByFirstName(firstName);
//    }
}
