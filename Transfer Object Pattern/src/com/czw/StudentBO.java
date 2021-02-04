package com.czw;

import java.util.ArrayList;
import java.util.List;

/**
 * 业务对象，为传输对象填充数据
 */
public class StudentBO {
    //假设是一个数据库
    private List<StudentVO> students;

    public StudentBO() {
        this.students = new ArrayList<>();
        StudentVO student1 = new StudentVO("Robert", 0);
        StudentVO student2 = new StudentVO("John", 1);
        students.add(student1);
        students.add(student2);
    }

    public void deleteStudent(StudentVO student) {
        students.remove(student.getRollNo());
        System.out.println("Student: Roll No "
                + student.getRollNo() + ", deleted from database");
    }

    public List<StudentVO> getAllStudents() {
        return students;
    }

    public StudentVO getStudent(int rollNo) {
        return students.get(rollNo);
    }

    public void updateStudent(StudentVO student) {
        students.get(student.getRollNo()).setStudentName(student.getStudentName());
        System.out.println("Student: Roll No "
                + student.getRollNo() + ", updated in the database");
    }
}
