package actions.impl;

import actions.EmployeeAction;
import input.Input;
import service.EmployeeService;
import util.Constants;

import java.time.format.DateTimeParseException;

public class FindByIntervalDateAction implements EmployeeAction {

    @Override
    public String name() {
        return "==== Find Employees By Interval Date ====";
    }

    @Override
    public boolean execute(Input input, EmployeeService employeeService) {
        System.out.printf("Please enter date by format - %s\n", Constants.PATTERN_DATE);
        String start = input.askStr("Enter start date: ");
        String end = input.askStr("Enter end date: ");
        try {
            employeeService.findAllByIntervalDate(start,end)
                    .forEach(System.out::println);
        } catch (DateTimeParseException exception) {
            System.out.println("Incorrect date format, Repeat please.");
        }
        return true;
    }
}
