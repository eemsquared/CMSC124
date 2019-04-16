package MP1;

import java.util.ArrayList;

/**
 * Created by mmcalvarez on 2/12/2019.
 */
public class StudentInfo {

    private static ArrayList<StudentDB> studentArray = new ArrayList<>();

    //database class
    public static class StudentDB {
        @Override
        public String toString() {
            return "[ Name: " + getStudentName() + ", Age: " + getStudentAge() + ", GPA: " + getStudentGPA() + ", Grade Level: " + getStudentGradeLevel() + " ]";
        }

        String studentName;
        int studentAge;
        float studentGPA;
        String studentGradeLevel;

        //constructor
        public StudentDB(String studentName, int studentAge, float studentGPA, String studentGradeLevel) {
            this.studentName = studentName;
            this.studentAge = studentAge;
            this.studentGPA = studentGPA;
            this.studentGradeLevel = studentGradeLevel;
        }

        //getters and setters
        public String getStudentName() {
            return studentName;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }

        public int getStudentAge() {
            return studentAge;
        }

        public void setStudentAge(int studentAge) {
            this.studentAge = studentAge;
        }

        public float getStudentGPA() {
            return studentGPA;
        }

        public void setStudentGPA(float studentGPA) {
            this.studentGPA = studentGPA;
        }

        public String getStudentGradeLevel() {
            return studentGradeLevel;
        }

        public void setStudentGradeLevel(String studentGradeLevel) {
            this.studentGradeLevel = studentGradeLevel;
        }
    }

    public static void main(String[] args) {
        //introduce dummy values
        StudentDB student1 = new StudentDB("Mary", 20, 1, "Senior");
        StudentDB student2 = new StudentDB("Sab", 20, 1, "Sophomore");
        StudentDB student3 = new StudentDB("Krishia", 21, (float) 1.50, "Junior");
        StudentDB student4 = new StudentDB("Chezkah", 19, (float) 1.25, "Freshman");
        studentArray.add(student1);
        studentArray.add(student2);
        studentArray.add(student3);
        studentArray.add(student4);

        //print output
        for (int i = 0; i < studentArray.size(); i++) {
            System.out.println(studentArray.get(i).toString());
        }
    }
}