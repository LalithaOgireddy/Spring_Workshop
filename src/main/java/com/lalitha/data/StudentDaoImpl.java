package com.lalitha.data;

import org.springframework.stereotype.Component;
import com.lalitha.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class StudentDaoImpl implements StudentDao{

    private List<Student> students;

    public StudentDaoImpl() {
        this.students = new ArrayList<>();
    }

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
    public void delete(int id) {
        students.remove(find(id));
    }
}
