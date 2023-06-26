package EmployeeMagnment.EmployeeMangnementAssignment.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.LazyToOne;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee_Info")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int employeeId;

    private  String firstName;

    private  String lastName;

    @Email(message = "Please provide a valid email ID")
    private String email;

    @Length (min = 10 ,max = 10 , message = "Please Enter valid Number")
    private String phoneNumber;

    private  String jobRole;

    private  long salary;


}
