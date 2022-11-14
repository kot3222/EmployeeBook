package dto;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class EmployeeDto {

    private String name;

    private String city;

    private String created;

    @Override
    public String toString() {
        return String.format("Employee info. Name - %s, City - %s, Created - %s.", name, city, created);
    }
}
