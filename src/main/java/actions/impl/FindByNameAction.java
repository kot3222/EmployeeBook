package actions.impl;

import actions.EmployeeAction;
import input.dto.EmployeeDto;
import input.Input;
import service.EmployeeService;

import java.util.List;

public class FindByNameAction implements EmployeeAction{
    @Override
    public String name() {
        return  "==== Find Employees By Name. ====";
    }

    @Override
    public boolean execute(Input input, EmployeeService employeeService) {
        String name = input.askStr("Enter name");
        List<EmployeeDto> employees = employeeService.findAllByName(name);

        if(employees.isEmpty()) {
            System.out.println("Employees not found.");
        } else {
            employees.forEach(System.out::println);
        }
        return true;
    }
}
