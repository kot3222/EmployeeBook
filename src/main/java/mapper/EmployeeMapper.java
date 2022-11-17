package mapper;

import input.dto.EmployeeDto;
import model.Employee;
import util.Constants;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class EmployeeMapper {

    private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(Constants.PATTERN_DATE);


    /**
     * Преобразует сущность в ДТО + аврсит в формат 1980-10-15 15:33
     *
     * @param employee entity
     * @return dto
     */
    public EmployeeDto fromEmployeeToEmployeeDto(Employee employee) {

        String date = employee.getCreated().format(dateTimeFormatter);

        return EmployeeDto.builder()
                .name(employee.getName())
                .city(employee.getCity())
                .created(employee.getCreated().format(dateTimeFormatter))
                .build();
    }

    /**
     * Преобразует  employeedto в сущность  entity.
     * @param employeeDto dto
     * @return entity
     */
    public Employee fromEmployeeDtoToEmployeeEntity (EmployeeDto employeeDto) {
        return Employee.builder()
                .name(employeeDto.getName())
                .city(employeeDto.getCity())
                .created(LocalDateTime.now())
                .build();
    }

    /**
     * Парсим строку в дату.
     * @param date строка представленная датой
     * @return дата
     */
    public LocalDateTime parseDate(String date) {
        return LocalDateTime.parse(date, dateTimeFormatter);
    }
}
