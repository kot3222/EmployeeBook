package actions.impl;

import actions.EmployeeAction;
import input.Input;
import service.EmployeeService;

public class ExitProgramAction implements EmployeeAction {
    @Override
    public String name() {
        return "==== Exit Program ====";
    }

    @Override
    public boolean execute(Input input, EmployeeService employeeService) {
        return false;
    }
}
