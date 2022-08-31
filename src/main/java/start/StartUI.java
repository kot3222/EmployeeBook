package start;

import actions.*;
import input.ConsoleInput;
import input.Input;
import service.EmployeeService;

import java.util.Scanner;

public class StartUI {

    public void init(Input input, EmployeeService employeeService, EmployeeAction[] employeeActions) {

        boolean isRunning = true;

        while (isRunning) {
            showMenu(employeeActions);
            int select = (int) input.askLong("Select: ");
            if (select < 0 || select >= employeeActions.length) {
                System.out.println("Wrong input, you can select: 0 ..." + (employeeActions.length - 1));
                continue;
            }
            EmployeeAction action = employeeActions[select];
            isRunning = action.execute(input, employeeService);
        }
    }

    private void showMenu(EmployeeAction[] employeeAction) {
        System.out.println("Welcone. It is menu");
        for (int index = 0; index < employeeAction.length; index++) {
            System.out.println(index + ". " + employeeAction[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        EmployeeService employeeService = new EmployeeService();

        EmployeeAction[] actions = {
                new CreateAction(),
                new FindAllAction(),
                new DeleteAction(),
                new ExitProgramAction()
        };


        new StartUI().init(input, employeeService, actions);
    }
}
