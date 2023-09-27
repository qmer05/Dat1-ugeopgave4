import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	private static int rnd_number;

	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		System.out.println( "Can you guess what it is?...");
        makeAGuess();
 	}

    private static void makeAGuess(){

        // Create a Scanner object 
        Scanner scanner = new Scanner(System.in);  	 

    	// Read user input
            //String input = scanner.nextLine();
            //int i = Integer.parseInt(input);

        //use hasNextDouble to check if input is numeric, 
        if (scanner.hasNextDouble()){
            String input = scanner.nextLine();
            int i = Integer.parseInt(input);
        // if so...
        //   Compare it with the random number
            if (i == rnd_number){
                //   Let the user know the result of the comparison
                System.out.println("Congratulations you guessed the number! The number was: " + rnd_number + ".");
                } else {
                //   Help the user by revealing wether the guess was lower or higher than the target number
                if (i > rnd_number){
                    System.out.println("You have guessed too high. Try a lower number.");
                } else {
                    System.out.println("You have guessed too low. Try a higher number.");
                }
                //   Let the user try again by calling this method recursively
                makeAGuess();
                }
        } else {
                    // if input was not numeric show an error message and call this method recursively
            System.out.println("Invalid number. Please insert a number.");
            makeAGuess();
        }
    }
}