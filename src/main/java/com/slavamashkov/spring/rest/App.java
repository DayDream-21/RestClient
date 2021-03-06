package com.slavamashkov.spring.rest;

import com.slavamashkov.spring.rest.configuration.MyConfig;
import com.slavamashkov.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication",
                Communication.class);

        /*List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);

        Employee employeeById = communication.getEmployee(1);
        System.out.println(employeeById);*/

        /*Employee employee = new Employee("Sveta", "Sokolova",
                "IT", 1200);
        employee.setId(9);
        communication.saveEmployee(employee);*/

        communication.deleteEmployee(10);
    }
}
