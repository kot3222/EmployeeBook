package model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;


import java.time.LocalDateTime;
@EqualsAndHashCode
@Getter
@Setter
public class Employee {

    private long id;

    private String name;

    private String city;

    private LocalDateTime created;

    public Employee(@NonNull String  name, String city) {
        this.name = name;
        this.city = city;
        this.created = LocalDateTime.now();
    }
}

