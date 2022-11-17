package actions.impl;

import input.ConsoleInput;
import input.Input;
import mapper.EmployeeMapper;
import model.Employee;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import repository.impl.EmployeeMemRepository;
import service.EmployeeService;

import static org.junit.Assert.*;

public class UpdateActionTest {

    private final CreateAction createAction = new CreateAction();

    private final EmployeeMapper employeeMapper = new EmployeeMapper();

    private final EmployeeMemRepository employeeMemRepository = Mockito.mock(EmployeeMemRepository.class);

    private final EmployeeService employeeService= new EmployeeService(employeeMemRepository,employeeMapper);

    public void whenUpdateSuccess() {
        Input input = Mockito.mock(ConsoleInput.class);
        Mockito.when(input.askLong("Enter id: ")).thenReturn(1L);
        Mockito.when(input.askStr("Enter name: ")).thenReturn("Ilshat");
        Mockito.when(input.askStr("Enter city: ")).thenReturn("Moscow");
        Employee employee = new Employee("Nikita", "Moscow");
        Mockito.when(employeeMemRepository.update(1l,ArgumentMatchers.any(Employee.class))).thenReturn();

    }

}