/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dbell17
 */
public class Lab2 {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Don ", "Bell", "333-33-3333");
        Employee employee2 = new Employee("Uncle", "Phil", "444-44-4444");
        Employee employee3 = new Employee("Will", "Smith", "555-55-5555");
        Employee employee4 = new Employee("Don ", "Bell", "333-33-3333");
        List employeeList = new ArrayList();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        System.out.println("Size of List: " + employeeList.size() + "\n");
        Employee fromList = (Employee) employeeList.get(1);
        System.out.println(fromList.toString() + "\n");
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i).toString());
        }
        System.out.println();
        Object[] employeeArray = employeeList.toArray();
        int count = 0;
        for (Object o : employeeArray) {
            employeeArray[count] = (Employee) employeeArray[count];
            count++;
        }
        System.out.println(employeeList.contains(employee4));
    }
}

