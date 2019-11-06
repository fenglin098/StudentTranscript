import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TranscriptApp {
    public static void main(String[] args) {
        ArrayList<Student> transcript = new ArrayList<>();

        Student st1 = new Student();
        st1.setStudentID(1);
        st1.setStudentName("John Doe");
        ArrayList<Course> jdcs1 = new ArrayList<>();
        Course cs1 = new Course();
        cs1.setCourseID(101);
        cs1.setCourseTitle("Java 101");
        cs1.setCredits(3);
        cs1.setGrade("A");
        jdcs1.add(cs1);

        st1.setClasses(jdcs1);


 public Course (int courseID,String courseTitle,int credits,String grade){

        private int studentID;
        private String studentName;
        private ArrayList<Course> classes;
        private int courseID;
        private String courseTitle;
        private int credits;
        private String grade;






    }
}
