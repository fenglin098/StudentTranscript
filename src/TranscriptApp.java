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
        Course sy1 = new Course();
        ArrayList<Course> syclasses= new ArrayList<>();
        sy1.setCourseID(101);
        sy1.setCourseTitle("Java 101");
        sy1.setCredits(3);
        sy1.setGrade("B");
        syclasses.add(sy1);
        Course sy2 = new Course();
        sy2.setCourseID(202);
        sy2.setCourseTitle("Calculus 2");
        sy2.setCredits(4);
        sy2.setGrade("A");
        syclasses.add(sy2);
        st2.setClasses(syclasses);


        Student st3 = new Student();
        st3.setStudentName("Shawn Mendez");
        st3.setStudentID(3);
        ArrayList<Course> smclasses = new ArrayList<>();
        Course sm1 = new Course();
        sm1.setCourseID(202);
        sm1.setCourseTitle("Calculus 2");
        sm1.setCredits(4);
        sm1.setGrade("C");
        Course sm2 = new Course();
        sm2.setCourseID(203);
        sm2.setCourseTitle("Physics 2");
        sm2.setCredits(4);
        sm2.setGrade("A");
        Collections.addAll(smclasses, sm1, sm2);
        st3.setClasses(smclasses);

        Collections.addAll(transcript,st1,st2,st3);

        for (Student person: transcript){
            System.out.println("name:" + person.getStudentName());
            System.out.println("student ID:" + person.getStudentID());
            System.out.println("Courses: ");
            for (Course course: person.getClasses()) {
                System.out.println("ID:"+course.getCourseID());
                System.out.println("title:"+course.getCourseTitle());
                System.out.println("credit:"+course.getCredits());
                System.out.println("grade:"+course.getGrade());
            }
            System.out.println("");



        }


    }
}


