import java.util.Scanner;  // Import the Scanner class

class Main 
{
  //set up the scanner
  public static void main(String[] args) 
  {
    Scanner s = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter number to count down or up from");
    
  //set up variables 
  int number = s.nextInt(); // Read user input 
  int countdown;
  int countup;

  //Check to see if number is positive, if so, count up
  for(countdown = number; countdown >= 0; countdown --) 
  {
  System.out.println(countdown);  
  }
  
  //Check to see if number is negative. if so, count down
  for(countup = number; countup <= 0; countup ++)
    {
    System.out.println(countup); 
    }
    System.out.println("Blast Off!"); //once conditions met (count reaches 0) then print blast off!
  }
}