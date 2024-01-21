package org.example;

public class Student {
    int studentId;
    String studentName;
    long studentMobileNumber;
    String studentAddress;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getStudentMobileNumber() {
        return studentMobileNumber;
    }

    public void setStudentMobileNumber(long studentMobileNumber) {
        this.studentMobileNumber = studentMobileNumber;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public Student() {
        super();
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentMobileNumber=" + studentMobileNumber +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}
