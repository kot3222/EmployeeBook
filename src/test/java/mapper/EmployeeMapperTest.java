package mapper;

import input.dto.EmployeeDto;
import lombok.extern.slf4j.Slf4j;
import model.Employee;
import org.junit.Assert;
import org.junit.Test;

import java.time.DateTimeException;

@Slf4j
public class EmployeeMapperTest {

    private final EmployeeMapper employeeMapper = new EmployeeMapper();

    @Test
    public void fromEmployeeToEmployeeDto() {
        try {
            Employee employee = new Employee("Ilshat", "Kazan");
            log.info("Employee DTO - {}", employeeMapper.fromEmployeeToEmployeeDto(employee));
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void fromEmployeDtoToEmployee() {
        try {
            EmployeeDto employeeDto = new EmployeeDto("Ilshat", "Kazan");
            log.info("Employee DTO - {}", employeeMapper.fromEmployeeDtoToEmployeeEntity(employeeDto));
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void parseDate() {
        try {
            String date = "16-11-2022 15:13";
            employeeMapper.parseDate(date);
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test(expected = DateTimeException.class)
    public void whenParseWithException() {
        employeeMapper.parseDate("gfgdfgdfg");
    }
}
