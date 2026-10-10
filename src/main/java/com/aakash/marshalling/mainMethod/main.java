package com.aakash.marshalling.mainMethod;

import com.aakash.marshalling.bindingClass.Address;
import com.aakash.marshalling.bindingClass.Person;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import org.springframework.stereotype.Controller;

import java.io.File;


public class main {

    public static void main(String[] args) throws JAXBException {
        Person p1 = new Person();
        p1.setFirstName("John");
        p1.setLastName("Doe");
        p1.setAge(30);

        Address addr = new Address();
        addr.setStreet("123 Main St");
        addr.setCity("New York");
        addr.setState("NY");
        p1.setAddress(addr);

        JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);
        Marshaller marshaller = jaxbContext.createMarshaller();

        marshaller.marshal(p1, new File("person.xml"));

        System.out.println("person.xml has been marshalled");

    }

}
