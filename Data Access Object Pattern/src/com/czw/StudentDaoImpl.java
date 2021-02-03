package com.czw;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    //列表是当作一个数据库
    List<Student> students;

    public StudentDaoImpl() {
        students = new ArrayList<Student>();
        Student student1 = new Student(0, "Robert");
        Student student2 = new Student(1, "John");
        students.add(student1);
        students.add(student2);
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student.getRollNo());
        System.out.println("Student: Roll No " + student.getRollNo()
                +", deleted from database");
    }

    //从数据库中检索学生名单


    @Override
    public List<Student> getAllStudent() {
        return students;
    }

    @Override
    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No " + student.getRollNo()
                +", updated in the database");
    }
}
