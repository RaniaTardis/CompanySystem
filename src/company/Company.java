
package company;

import java.util.Scanner;
public class Company {
   static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
       TrainingCourse t=new TrainingCourse (200,"Java");
       Instructor e=new Instructor ("Ahmad",1200,t,"PHD");
       System.out.println(e);
       Instructor[] A=new Instructor[2];
       ReadArray(A);
       printArray(A);
    }
    //===================================
   public static void ReadArray(Instructor[] A) 
   {    
      for (int i=0; i<A.length;i++)
       {   System.out.println(" enter training Id and anme ");
           TrainingCourse c=new TrainingCourse(input.nextInt(), input.next());
           System.out.println(" enter Instructor name, salary, certificate ");
           A[i]=new Instructor(input.next(),input.nextDouble(), c, input.next());
       } 
   }
   //================================
   public static void printArray(Instructor[] A) 
   {
      for (int i=0; i<A.length;i++)
          System.out.println(A[i].netSalary());
   }
}
