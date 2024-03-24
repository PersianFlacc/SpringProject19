package org.example.project19;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {

    List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Vladislav Pozdnyakov", 4, 9.7);
        Student st2 = new Student("Elena Malyusheva", 1, 6.3);
        Student st3 = new Student("Ivan Ivanov", 3, 8.5);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Начало работы метода getStudents");
        System.out.println("Information from method getStudents: ");
        System.out.println(students);
        return students;
    }
}
