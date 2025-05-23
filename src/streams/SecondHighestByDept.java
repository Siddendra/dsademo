package dynamicprogram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Given a list of employees with their names, department, and salary, write a java 8 stream-based
function to find the 2nd highest paid employee in each department. The input will
be a list of employee objects, and output should be a Map where the key is the
department and value are the 2nd highest paid employee in that department.
 */


class Employee {
    String name;
    String department;
    double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;

    }

    public double getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }

    public String toString() {
        return name + "(" + salary + ")";
    }
}
public class SecondHighestByDept {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "IT", 900000),
                new Employee("Ram", "IT", 1000000),
                new Employee("krish", "IT", 2000000),
                new Employee("Vinay", "HR", 1000000),
                new Employee("Ashok", "HR", 800000),
                new Employee("Sri", "HR", 1800000)
        );

        Map<String, Employee> findSecondHighestByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> list.stream()
                                        .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                                        .skip(1)
                                        .findFirst()
                                        .orElse(null))

                                ));
        findSecondHighestByDept.forEach((dept, emp) ->
                System.out.println(dept + "->"+  emp));



        Map<String, Employee> secondHighestByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> list.stream()
                                        .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                                        .skip(1)
                                        .findFirst()
                                        .orElse(null)
                        )));
        secondHighestByDept.forEach((dept, emp) ->
                System.out.println(dept + "->"+ emp));



    }
}
