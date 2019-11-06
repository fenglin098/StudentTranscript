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
        ArrayList<Course> jdclasses = new ArrayList<>();
        Course jd1 = new Course();
        jd1.setCourseID(101);
        jd1.setCourseTitle("Java 101");
        jd1.setCredits(3);
        jd1.setGrade("A");
        jdclasses.add(jd1);
        st1.setClasses(jdclasses);

        Course jd2 = new Course();
        jd2.setCourseID(102);
        jd2.setCourseTitle("English 101");
        jd2.setCredits(3);
        jd2.setGrade("B");
        jdclasses.add(jd2);
        st1.setClasses(jdclasses);

        Student st2 = new Student();
        st2.setStudentID(2);
        st2.setStudentName("Susan Young");
        ArrayList<Course> sycs= new ArrayList<>();
        Course





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
