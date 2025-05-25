package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Student {
    String name;
    int age;

    Student(String name, int age) {
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
        return "Student {" +
                "name = " +name+
                "age = " + age
                + "}";
    }

}

public class StudentAverage {

    public static void main(String args[]) {
        List<Student> students = Arrays.asList(
                new Student("Suresh", 38),
                new Student("Ramesh ", 32),
                new Student("Anurag", 36),
                new Student("Giridhar", 39)
        );

        double averageAge = students.stream().mapToInt(student -> student.age)
                .average().orElse(0);
        //another way
        double averageAge_ = students.stream().collect(Collectors.averagingInt(Student::getAge));


        System.out.println("Average Age"+ averageAge);

    }
}
