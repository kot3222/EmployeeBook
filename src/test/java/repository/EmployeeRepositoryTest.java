package repository;

import model.Employee;
import org.junit.Assert;
import org.junit.Test;
import repository.impl.EmployeeMemRepository;

public class EmployeeRepositoryTest {

    @Test
    public void whenSave() {
        EmployeeMemRepository employeeRepository = new EmployeeMemRepository();
        Employee employee = new Employee("Ilshat", "Russia");
        employeeRepository.save(employee);
        //Employee result = employeeRepository.findById(employee.getId());
        //Assert.assertNotNull(result);
    }
}