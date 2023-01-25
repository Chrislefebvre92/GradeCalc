
import java.util.Scanner;
 public class Main {


    public static void main(String[] args) {
        //Creating an array to store letter grade to numeric grade
        int[] grademap = {4,3,2,1,0};
        char[] alphabetgrade = {'A', 'B', 'C', 'D', 'F'};

        //Creating a Scanner object
        Scanner sc = new Scanner(System.in);

        //prompt the user for a letter grade
        System.out.print("Enter the letter grade please ");

        // Letter grade valid
        char letterGrade = sc.next().charAt(0);
        letterGrade = Character.toUpperCase(letterGrade);
        for (int i = 0; i < alphabetgrade.length; i++) {
            if (letterGrade == alphabetgrade[i]) {
                System.out.println("The numeric value of grade " + letterGrade + " is " + grademap[i]);





            }
        }
    }
}