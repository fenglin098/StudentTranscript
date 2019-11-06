import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Student {
    private int studentID;
    private String studentName;
    private ArrayList<Course> classes;


    public Student() {
    }

    public Student(int studentID, String studentName, ArrayList<Course> classes) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.classes = classes;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public ArrayList<Course> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<Course> classes) {
        this.classes = classes;
    }

//    public void getDisplayText(){
//        System.out.println("Student Name: "+studentName);
//        for (Course i: )
//        System.out.println("Courses: ");
//    }


}
