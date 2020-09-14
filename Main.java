import java.util.Scanner;
/**
 * The program tells the user if they can get their drivers license
 * @Author Thomas Quigley 
 */
public class Main {

 
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // get the users age
    System.out.println("Please enter your age:");
    int age = input.nextInt();

    // initilaze the ages for driving and voting
    final int LICENSE_AGE = 16;
    final int VOTING_AGE = 18;

    // check if they are old enough to vote or drive
    if (age >= VOTING_AGE){
      System.out.println("You are old enough to drive and vote!");
    } else if (age >= LICENSE_AGE) {
      System.out.println("You can get your driver's license!");
    } else {
      System.out.println("Sorry, you are not old enough to drive or vote.");
    }

    
  }
}
