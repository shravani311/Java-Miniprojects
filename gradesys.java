// 1. Student Grade Manager

// Concepts used

// Arrays / ArrayList

// Loops

// Conditional statements

// Features

// Add student marks

// Calculate average

// Find highest and lowest marks

// Display grade (A/B/C)

// Example Output

// Enter number of students: 5
// Enter marks:

// Average: 72
// Highest: 95
// Lowest: 45


import java.util.*;
class gradesys{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of students :- ");
        int n=sc.nextInt();
        int[] marks=new int[n];
        int sum=0;
        int max=0;
        int min=Integer.MAX_VALUE;
        System.out.println("Enter marks :- ");
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
            sum+=marks[i];
            if(min>marks[i]){
                min=marks[i];
            }
            if(max<marks[i]){
                max=marks[i];
            }
        }
        int avg=sum/n;
        System.out.println("Average marks :- "+avg);
        System.out.println("Maximum marks :- "+max);
        System.out.println("Minimum marks :- "+min);
        for(int i=0;i<n;i++){
            if(marks[i]>=80){System.out.println(i+". Grade of "+marks[i]+" A+");}
            else if(marks[i]>=60){System.out.println(i+". Grade of "+marks[i]+" B+");}
            else if(marks[i]>40){System.out.println(i+". Grade of "+marks[i]+" C+");}
            else{System.out.println(i+". Fail for"+marks[i]);}
        }
    }
}