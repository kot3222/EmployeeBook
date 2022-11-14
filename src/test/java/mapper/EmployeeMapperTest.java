package mapper;

import dto.EmployeeDto;
import model.Employee;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeMapperTest {

    private final  EmployeeMapper employeeMapper = new EmployeeMapper();

    @Test
    public void checkTest(){
        Employee employee = new Employee("Ilshat", "Kazan");
        System.out.println(employeeMapper.fromEmployeeToEmployeeDto(employee));
    }

}