import java.lang.*;
import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      
      // Assuming this is apart of a menu screen with the other classes and is picked by the user
      System.out.println("Welcome to the Annuities menu.");
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      System.out.println("1. Already have an account");
      System.out.println("2. Want to set up an account");
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      System.out.print("Please type the number of the option best relating to you: ");
      int startUp = scan.nextInt();
      
      //LOOOOOPPPPPP
      if (startUp != 1 && startUp != 2) {
          System.out.println("Invalid response. Please try again:");
      }
      
      
      if (startUp == 2) 
      {
          System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
          System.out.print("How many years would you like to invest/hold your annuity? (Max of 30): ");
          int years = scan.nextInt();
          System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
          
          if (years > 30) {
              //LOOOOOOPPPPPPP
              System.out.println("Years cannot exceed 30. Please try again: ");
          } else {
          
          System.out.println("Here are our insurance investment options:");
          System.out.println("1. Insurance Uno:");
          System.out.println(" - Rate (Interest rate) - 4%");
          System.out.println(" - Years (Time for payout) - 1 year");
          
          System.out.println();
          
          System.out.println("2. Insurance Dos:");
          System.out.println(" - Rate (Interest rate) - 5.15%");
          System.out.println(" - Years (Time for payout) - 1 year");

          System.out.println();
          
          System.out.println("3. Insurance Three:");
          System.out.println(" - Rate (Interest rate) - 3.8%");
          System.out.println(" - Years (Time for payout) - 2 years");

          System.out.println();
          
          System.out.print("Please enter the number of the insurance option you would like to pick: ");
          int insuranceChoice = scan.nextInt();
          
          if (insuranceChoice != 1 && insuranceChoice != 2 && insuranceChoice != 3) {
              //LOOOOOOOOOOPPPPPPPPPPP
              System.out.println("Invalid response. Please try again: ");
          } else {
          
          System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
          System.out.print("How much money would you like to invest yearly? (Whole numbers only): ");
          int investment = scan.nextInt();
          
          if (investment%1 == 0 || investment%2 == 1) {
              double insuranceUno = investment * Math.pow((1 + .04), 1);
              double insuranceDos = investment * Math.pow((1 + .0515), 1);
              double insuranceThree = investment * Math.pow((1 + .038), 1);
              
              if (investment == 1) {
                  System.out.println("Final investment value: " + insuranceUno);
                  
              } else if (investment == 2) {
                  System.out.println("Final investment value: " + insuranceDos);
                  
              } else if (investment == 3) {
                  System.out.println("Final investment value: " + insuranceThree);
                  
              } else {
                  System.out.println("Invalid response. Would you like to try again?");
                  //LOOOOOOOOOOOOP
              }
              
              System.out.println("1. Finalize your investment");
              System.out.println("2. Restart");
              System.out.print("Please select your option: ");
              //LOOOOOPPPPPPPPPPP
              int finalSelection = scan.nextInt();
              
              if (finalSelection == 1) {
                  System.out.println("Account set up finalized.");
                  
              } else if (finalSelection == 2) {
                  System.out.println("LOOPPPPPPPPPPPPP");
                  
              } else {
                  System.out.println("Invalid response. Please try again: ");
          }
      } else {
          System.out.println("Invaliad response. Please try again: ");
      }
          }
}
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      
      
    }
}
}