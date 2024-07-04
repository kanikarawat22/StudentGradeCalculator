import java.util.*;
public class StudentGradeCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks in Hindi out of 100:");
        int hindi = sc.nextInt();
        System.out.print("Enter the marks in English out of 100 :");
        int english = sc.nextInt();
        System.out.print("Enter the marks in Maths out of 100 :");
        int maths = sc.nextInt();
        System.out.print("Enter the marks in Science out of 100 :");
        int science = sc.nextInt();
        System.out.print("Enter the marks in Social Science out of 100 :");
        int socialScience= sc.nextInt();

        int totalMarks = hindi+ english+ maths + science + socialScience;
        System.out.println("\nResult : ");;
        System.out.println("Total Marks : " + " " +totalMarks);
        
        double averagePercentage = totalMarks/5;
        System.out.println("Average Percentage : "  +"  " + averagePercentage);
        
        String grade;
        if(averagePercentage >= 90)
        {
            grade = "A";
        }
        else if(averagePercentage >= 80)
        {
            grade = "B";
        }
        else if(averagePercentage>70)
        {
            grade = "C";
        }
        else if(averagePercentage>60)
        {
            grade = "D";
        }
        else
        {
            grade = "E";
        }
        System.out.println("Grade : " + grade);



    }



}