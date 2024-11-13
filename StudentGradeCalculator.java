import java.util.*;
class StudentGradeCalculator{
 static String calculateGrade(double avg){
  if (avg >= 90) {
   return "A+";
  }
  else if (avg >= 80) {
   return "A";
  }
  else if (avg >= 70) {
   return "B";
  } 
  else if (avg >= 60) {
   return "C";
  } 
  else if (avg >= 50) {
   return "D";
  }
  else {
   return "F";
  }
 }
 public static void main(String[] args){
     try (Scanner s = new Scanner(System.in)) {
         System.out.print("Enter the number of subjects:");
         int n = s.nextInt();
         double[] marks = new double[n];
         for (int i = 0; i < n; i++) {
             System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
             marks[i] = s.nextDouble();
         }
         double total = 0;
         for(int i = 0;i < n;i++){
             total += marks[i];
         }
         double avg = total / n;
         String grade = calculateGrade(avg);
         System.out.printf("\nTotal Marks: %.2f/%d\n", total, n * 100);
         System.out.printf("Average Percentage: %.2f%%\n", avg);
         System.out.println("Grade: " + grade);
     }
 }    
}
