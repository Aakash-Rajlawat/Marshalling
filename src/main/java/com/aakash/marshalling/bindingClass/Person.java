package com.aakash.marshalling.bindingClass;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@XmlRootElement
public class Person {

    private String firstName;

    private String lastName;

    private int age;

    private Address address;
}
