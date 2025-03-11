import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");


    
    int age = 20;
    double gpa = 3.90;
    String name = "Jimmy";
    
    System.out.println("Hello " + name);
    // Jimmy is 20 and has a GPA of 3.90
    String studentInfo = String.format("%s is %d and has a GPA of %.2f", name, age, gpa); 
    System.out.println(studentInfo);

    
    Scanner scanner = new Scanner(System.in);
    System.out.print("Age: ");
    age = scanner.nextInt();
    System.out.println(age);

    
    if(age < 18)
    {
      System.out.println("You are not old enough to vote.");
    }
    else
    {
      System.out.println("You are old enough to vote.");
    }

    
    if(age <= 12 || age >= 65)
    {
      System.out.println("You get a discount!");
    }
    else
    {
      System.out.println("Regular price ticket");
    }


    
    int[] grades = {89, 59, 59, 78, 97};
    for(int i=0; i<grades.length; i++)
      System.out.println(grades[i]);







    
    
  }


}
// %s is string %d is integer %f is float/double
/* double is twice a float in terms of data stored
  */
// and = &&
// or = ||