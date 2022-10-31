import javax.swing.*;


public class GuessingGameRunner {
    public static void main(String[] args) {
        int guess = (int) (Math.random()*100 + 1);
        //generates a random number between 0 and 100

        int userAnswer = 0;
        System.out.println("The correct guess would be " + guess);
        //back-end information
        int count = 1;
        while (userAnswer != guess)
        {
            String response = JOptionPane.showInputDialog(null,
                "Enter a guess between 1 and 100", "1.2.3", 3);
            userAnswer = Integer.parseInt(response);

            JOptionPane.showMessageDialog(null, ""+ determineGuess(userAnswer, guess, count));
            count++;
        }
    }


    public static String determineGuess(int userAnswer, int guess, int count){
        if (userAnswer <0 || userAnswer >100) {
            return "Your guess is invalid";
        }
        else if (userAnswer == guess ){
            return "Correct!\nYou Guessed: " +count +"times\n" ;
        }
        else if (userAnswer > guess) {
            return "Your guess is too high!, Try again.\n ";
        }
        else if (userAnswer < guess) {
            return "Your guess is too low!, Try again.\n";
        }
        else {
            return "Your guess is incorrect!\nTry a Number: ";

        }
    }
}
