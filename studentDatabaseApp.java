import java.util.*;

public class studentDatabaseApp {
    public static void main(String[] args) {

//      Ask how many of new students
        System.out.println("Enter number of new students to enroll: ");
        Scanner in = new Scanner (System.in);
        int numOfStudents = in.nextInt();
        student[] students = new student[numOfStudents];

//        Create a number of a new students
        for(int n = 0; n<numOfStudents; n++){
            students[n] = new student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].toString());
        }

    }
}
