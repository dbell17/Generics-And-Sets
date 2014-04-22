/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author dbell17
 */
public class Lab5 {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Don  ", "Bell", "333-33-3333");
        Employee employee2 = new Employee("Uncle", "Phil", "444-44-4444");
        Employee employee3 = new Employee("Will", "Smith", "555-55-5555");
        Employee employee4 = new Employee("Don ", "Bell", "333-33-3333");
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        System.out.println("Size of List: " + employeeList.size() + "\n");
        for (Employee e : employeeList) {
            System.out.println(e.toString());
        }
        System.out.println();
        Map<String, Employee> employeeMap = new HashMap<String, Employee>();
        for (Employee e : employeeList) {
            employeeMap.put(e.getSsn(), e);
        }
        System.out.println(employeeMap.keySet());
        System.out.println("");
        for (Employee em : employeeList) {
            System.out.println(employeeMap.get(em.getSsn()));
        }
    }
}

