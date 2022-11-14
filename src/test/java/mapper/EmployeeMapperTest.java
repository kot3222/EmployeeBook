package mapper;

import model.Employee;
import org.junit.Test;

public class EmployeeMapperTest {

    private final  EmployeeMapper employeeMapper = new EmployeeMapper();

    @Test
    public void checkTest(){
        Employee employee = new Employee("Ilshat", "Kazan");
        System.out.println(employeeMapper.fromEmployeeToEmployeeDto(employee));
    }

}