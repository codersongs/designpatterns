package com.codersongs.framepattern.mvc;

public class StudentController {
    private Student student;
    private StudentView studentView;

    public StudentController(Student student, StudentView studentView) {
        this.student = student;
        this.studentView = studentView;
    }

    public void setStudentName(String name){
        student.setName(name);
    }

    public String getStudentName(){
        return student.getName();
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentView getStudentView() {
        return studentView;
    }

    public void setStudentView(StudentView studentView) {
        this.studentView = studentView;
    }

    public void updateView(){
        this.studentView.printStudentDetails(this.student.getName(), this.student.getRealNo());
    }
}
