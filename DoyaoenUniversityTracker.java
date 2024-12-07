//FEEL FREE TO COPY MY CODE ND TEST IT OUT ON THE ONLINE JAVA COMPILER LINK THAT IS IN MY WEBSITE! :D
//import scanner object
import java.util.Scanner;

public class DoyaoenUniversityTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //NUMBER OF STUDENTS
        int numStudents =0; //initializes that the number of students is 0

        //user input nad case handling of the number of students
        while (true) {
            System.out.print("Enter number of students: ");
            numStudents = sc.nextInt();
            sc.nextLine(); //this so that it doesn't skip a line

            if (numStudents >= 1 && numStudents <= 10) {
                break;
            }
            else {
                System.out.println("Invalid input. Number of students must be from 1 to 10 only. Please try again.");
                continue;
            }
        }

        //1D ARRAY FOR STUDENTS' NAMES
        //Syntax declaration and initialization
        String name[] = new String [numStudents]; //whatever number the user will input will be initialized (if user put 5, 5 will be initialized)

        //loops and printing
        System.out.println("(Last Name, First Name Middle Initial.)");

        for(int i = 0; i < name.length; i++) {
            System.out.print("Enter name of Student " + (i+1) + ": ");
            name[i] = sc.nextLine(); //stores the name input into variable name[i]
        }

        //NUMBER OF SUBJECTS
        int numSubjects = 0; //initializes number of subjects as 0

        //user input and case handling of number of subjects
        while (true) {
            System.out.print("\nEnter the number of subjects for all students: ");
            numSubjects = sc.nextInt();
            sc.nextLine();

            if (numSubjects >= 1 && numSubjects <= 10) {
                break;
            }
            else {
                System.out.print("Invalid input. Number of subjects must be from 1 to 10 only. Please try again.");
                numSubjects--;
            }
        }

        //2D ARRAY FOR STUDENTS' GRADES
        //Syntax declaration and initialization
        double grades[][] = new double[numStudents][numSubjects];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter grades for " + name[i] + ": ");
            for (int j = 0; j < numSubjects; j++) {

                while (true) {
                    System.out.print("Subject " + (j+1) + " grade: ");
                    grades[i][j] = sc.nextDouble();

                    if (grades[i][j] >= 70 && grades[i][j] <= 99) {
                        break;
                    }
                    else {
                        System.out.println("Invalid input. Grades must only be from 70 to 99. Please try again.");

                        continue;
                        
                    }
                }


            }
        }

        //STUDENT AVERAGE
        System.out.print("\nAverage grade for each student");
        for (int i = 0; i < numStudents; i++) {
            double sum = 0; //initializes that sum starts with 0
            for (int j = 0; j < numSubjects; j++) {
                sum += grades[i][j]; //sum+= adds up all the value of variable grades[i][j] and stores it in variable sum which was initialized as 0
            }

            //calculate for student average
            double average = sum / numSubjects;

            //displays students' name along with their average
            System.out.printf("\nAverage grade of %s: %.4f", name[i], average);

        }

        //close scanner
        sc.close();
    }
}
