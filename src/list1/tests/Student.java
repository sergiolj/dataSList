package list1.tests;

import java.time.Year;

public class Student {
    private String name;
    private final String studentID;
    private static int studentCounter = 0;


    public Student(String name) {
        try{
            this.name = name;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            studentCounter++;
            studentID = Year.now() + String.valueOf(studentCounter);
        }
    }

    public static int getStudentCounter() {
        return studentCounter;
    }

    public static void setStudentCounter(int studentCounter) {
        Student.studentCounter = studentCounter;
    }

    @Override
    public String toString() {
        return "Student [name=" + this.name + ", studentID=" + this.studentID + "]";
    }
}
