import java.lang.reflect.Constructor;
import java.util.*;

public class student {
        private String firstName, lastName, courses, studentID;
        private int tuitionBalance = 0, gradeYear;
        private static int costOfCourse = 600, id = 1000;

//      Constructor: prompt user to enter students name and year
        public student(){
            Scanner in = new Scanner(System.in);
            System.out.print("Enter Student's first name: ");
            this.firstName = in.nextLine();

            System.out.print("Enter Student's last name: ");
            this.lastName = in.nextLine();

            System.out.print("1 - Fresher\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
            this.gradeYear = in.nextInt();

            setStudentID();
        }

//      Generate an ID
        private void setStudentID(){
            // Grade Level + ID
            id++;
            this.studentID = gradeYear + "" + id;
        }

//      Enroll in Course
        public void enroll(){
            // Get inside loop, user hits 0
            do {
                System.out.print("Enter course to enroll (Q to quit): ");
                Scanner in = new Scanner(System.in);
                String course = in.nextLine();
                if (!course.equals("Q")) {
                    courses = courses + "\n " + course;
                    tuitionBalance = tuitionBalance + costOfCourse;
                }
                else {
                    break;
                }
            } while(1 != 0);
        }

//    View balance
    public void viewBalance(){
        System.out.println("Your balance is: $" + tuitionBalance);
    }

//    Pay Tuition
    public void payTuition(){
            viewBalance();
            System.out.print("Enter your payment: $");
            Scanner in = new Scanner(System.in);
            int payment = in.nextInt();
            tuitionBalance = tuitionBalance - payment;
            System.out.println("Thank you for your payment of $" + payment);
            viewBalance();
    }

//    Show Status
    public String toString(){
            return "Name: " + firstName + " " + lastName +
                    "\nGrade Level: " + gradeYear +
                    "\nStudent ID: " + studentID +
                    "\nCourses Enrolled: "+ courses +
                    "\nBalance: $"+ tuitionBalance;
    }
}
