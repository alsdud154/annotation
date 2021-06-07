package kr.co.velnova.annotation.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Person {
    private Long id;
    private String name;
    private Integer age;
    private String type;
}
