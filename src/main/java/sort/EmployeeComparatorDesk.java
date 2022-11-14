package sort;

import dto.EmployeeDto;

import java.util.Comparator;

public class EmployeeComparatorDesk implements Comparator<EmployeeDto> {
    @Override
    public int compare(EmployeeDto o1, EmployeeDto o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
