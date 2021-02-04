package com.czw;

/**
 * 传输对象
 */
public class StudentVO {
    private String studentName;
    private int rollNo;

    public StudentVO(String studentName, int rollNo) {
        this.studentName = studentName;
        this.rollNo = rollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
