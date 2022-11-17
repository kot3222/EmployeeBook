package actions.impl;

import actions.EmployeeAction;
import input.dto.EmployeeDto;
import input.Input;
import service.EmployeeService;
import util.OutputUtil;

import java.util.List;

public class FindByNameAction implements EmployeeAction{
    @Override
    public String name() {
        return  "==== Find Employees By Name. ====";
    }

    @Override
    public boolean execute(Input input, EmployeeService employeeService) {
        String name = input.askStr("Enter name");
        OutputUtil.print(employeeService.findAllByName(name));
        return true;
    }
}
