package actions.impl;

import actions.EmployeeAction;
import input.Input;
import input.dto.EmployeeDto;
import model.Employee;
import service.EmployeeService;

public class CreateAction implements EmployeeAction {

    @Override
    public String name() {
        return "==== Create a new employee ====";
    }

    @Override
    public boolean execute(Input input, EmployeeService employeeService) {
        String name = input.askStr("Enter name: ");
        String city = input.askStr("Enter city");
        EmployeeDto employee = new EmployeeDto(name, city);
        return employeeService.save(employee);
    }
}
