import java.util.*;  
public class StudentGradeTracker {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of students: ");
        int n = sc.nextInt();   
        int[] grades = new int[n];  
        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter grade of Student " + (i + 1) + ": ");
            grades[i] = sc.nextInt(); 
        }
        int sum = 0;      
        int highest = grades[0];  
        int lowest = grades[0];   
        for (int i = 0; i < n; i++) 
        {
            sum = sum + grades[i];   
            if (grades[i] > highest) 
            {  
                highest = grades[i];
            }
            if (grades[i] < lowest) 
            {   
                lowest = grades[i];
            }
        }
        System.out.println("summary report of all students:");
        double average = (double) sum / n;
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": " + grades[i]);
        }
        
    }
}
