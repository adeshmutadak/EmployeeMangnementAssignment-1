package EmployeeMagnment.EmployeeMangnementAssignment.Repository;

import EmployeeMagnment.EmployeeMangnementAssignment.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IServiceRepo extends JpaRepository<Employee, Integer> {
//    @Query(value = "SELECT first_name FROM Employee_Management_System WHERE firstName = :firstName", nativeQuery = true)
//    List<Employee> getByFirstName(String firstName);

}
