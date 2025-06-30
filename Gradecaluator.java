import java.util.*;
import java.util.Scanner;
public class Gradecaluator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the no. of subjects : ");
        int subjects = scanner.nextInt();

        int totalMarks = 0;

        for(int i =0; i< subjects;i++){
            System.out.println("Enter the marks for subject " + (1+i) + " out of 100 = " );
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        double percentage = (double) totalMarks/subjects;
        char grade;
    
        if (percentage>90){
            grade = 'A';
        }
        else if(percentage>=80)   {
            grade= 'B';

        }
        else if(percentage>=70)   {
           grade = 'C';
    }
    else if(percentage>=60)   {
        grade = 'D';
    }
    else if(percentage>=50)   {
    grade = 'E'; }
    else   {
        grade = 'F'; }

        System.out.println("Total Marks : " + totalMarks);
        System.out.println("Percentage : " + percentage + " % ");
        System.out.println("Grade : " + grade);

        scanner.close();

    }
}
