/*
 * SecretPhrase.java
 * written by I Edge
 * This application is a simple Hangman guessing game
 * 
 */

package secretphrases;

import javax.swing.*;       //GUI interface
public class SecretPhrase {

    public static void main(String[] args) {
        //declare variables
        String[] targetPhrases = {"Java is fun!".toUpperCase(), "So Cool!".toUpperCase(), "I like you!".toUpperCase(),
        		"Let's Hang out!".toUpperCase(),"The sky is blue!".toUpperCase(),"I don't know!".toUpperCase(),
        		"Curiosity killed the cat.".toUpperCase(),"You're my buddy.".toUpperCase(),"She is nice.".toUpperCase(),
        		"Jump for joy!".toUpperCase()};  //original
        String[] displayPhrases = {"**** ** ***!","** ****!","* **** ***!","***'* **** ***!","*** *** ** ****!","* ***'* ****!",
        		"********* ****** *** ***.","***'** ** *****.","*** ** ****.","**** *** ***!"};   //phrase to display
        String prompt;      //variable to hold various messages
        String play = "Play the game - guess the phrase\n";
        String enterOne = "Enter one letter\n";
        String sorry = "Sorry - not in the phrase ";
        String correct = "Correct! ";
        String userResponse;
        String targetPhrase;
        String displayPhrase;
        
        char guess;     //user guess
        char letter;    //comparison within the phrase
        boolean found;  //determine if guess was found in the phrase
        int position;   //navigate through phrase
        double t = Math.floor((Math.random() * 10));   
        int j = (int) t;
        targetPhrase = targetPhrases[j];
        displayPhrase = displayPhrases[j];
        final int LEN = targetPhrase.length();  //length of phrase
        prompt = play + enterOne;
        //loop while not solved (still * in the phrase)
        while (displayPhrase.indexOf('*') != -1) {  //unsolved string
            //get user input; force to upper case
            userResponse = JOptionPane.showInputDialog(null,
                    prompt + displayPhrase);
            guess = Character.toUpperCase(userResponse.charAt(0));
            found = false;  //set found to false
            //search every position of original phrase
            for (position = 0; position < LEN; position++) {
                letter = targetPhrase.charAt(position); //get char
                if (letter == guess) {  //compare char with guess
                    //modify display phrase to include guess
                    displayPhrase =
                            displayPhrase.substring(0, position) +
                            guess +
                            displayPhrase.substring(position + 1, LEN);
                    //flag found to be true
                    found = true;
                }
            }
            if (!found) {   //guess not found
                prompt = sorry + guess + "\n";
            }
            else {      //guess was found
                prompt = correct + enterOne;
            }
        }   //end while -- phrase solved
        JOptionPane.showMessageDialog(null,
                "Congratulations!\nThe phrase was: \n" +
                        targetPhrase);
    }
    
}
