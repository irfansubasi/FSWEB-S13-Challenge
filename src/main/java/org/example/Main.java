package org.example;

import org.example.enums.Plan;

public class Main {

    public static void main(String[] args){
        executeOps();
    }

    public static void executeOps(){

        //healthplan
        Healthplan healthplan1 = new Healthplan(1, "Basic Healthplan", Plan.BASIC);
        System.out.println(healthplan1);

        //employee
        String[] healthplans = new String[2];
        Employee employee1 = new Employee(1,"İrfan Subaşı", "irfannsubasi@gmail.com", "imbatman", healthplans);
        employee1.addHealthPlan(0, healthplan1.getName());
        employee1.addHealthPlan(1, "Premium Plan");
        employee1.addHealthPlan(1, "Ultimate Plan");
        System.out.println(employee1);

        //company
        String[] developers = new String[3];
        Company company1 = new Company(1, "Vito Corp", 200000000, developers);
        company1.addEmployee(0, "Ali Yüzbaşı");
        company1.addEmployee(1, "Emre Can Kurt");
        company1.addEmployee(1, "İrfan Subaşı");
        System.out.println(company1);


    }

}