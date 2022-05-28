package springboot.app.model;

import javax.persistence.Entity;

@Entity
public class Employee extends Organization {
    private String last_name;
    private String empId;

  public Employee() {
    }

    public Employee(String empName, String last_name, String empId) {
        super(empName);
        this.last_name = last_name;
        this.empId = empId;
    }
}
