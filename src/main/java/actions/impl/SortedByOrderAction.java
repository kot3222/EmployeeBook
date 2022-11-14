package actions.impl;
import actions.EmployeeAction;
import input.Input;
import service.EmployeeService;
import sort.Ordered;

public class SortedByOrderAction implements EmployeeAction{
    @Override
    public String name() {
        return "====Sorted Employee by ASC/DESC.====";
    }

    @Override
    public boolean execute(Input input, EmployeeService employeeService) {
        String orderedType = input.askStr("Enter order type (ASC/DESC): ");
        try {
            employeeService.findAll(Ordered.valueOf(orderedType)).forEach(System.out::println);
        } catch (IllegalArgumentException exception) {
            System.out.println("Incorrect order.");

        }
        return true;
    }
}
