package com.lalitha.data;

import org.springframework.stereotype.Component;
import com.lalitha.model.Student;
import java.util.Collections;
import java.util.List;

public class StudentDaoImpl implements StudentDao{

    List<Student> students;

    @Override
    public Student save(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public Student find(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public List<Student> findAll() {
        return Collections.unmodifiableList(students);
    }

    @Override
    public void delete(Student student) {
        students.remove(student);
    }
}
