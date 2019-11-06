public class Course {
    private int courseID;
    private String courseTitle;
    private int credits;
    private String grade;

    public Course(){}

    public Course (int courseID,String courseTitle,int credits,String grade){
        this.courseID = courseID;
        this.courseTitle = courseTitle;
        this.credits = credits;
        this.grade = grade;

    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
