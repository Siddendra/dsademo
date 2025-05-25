package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class EmployeeB{
    String name;
    int age;

    EmployeeB(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + "(" + age + ")";
    }
}
public class SortByMultipleFields {

    public static void main(String args[]) {
        List<EmployeeB> employeeList = Arrays.asList(
                new EmployeeB("Amar", 42),
                new EmployeeB("Guru", 42),
                new EmployeeB("Suresh", 38)
        );

        employeeList.stream()
                .sorted(Comparator.comparingInt(EmployeeB::getAge)
                .thenComparing(EmployeeB::getName)
                        .reversed())
                .forEach(System.out::println);

    }

}
