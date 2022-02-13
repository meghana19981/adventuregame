package adventureGame;

import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args){
        Escape Answer = new Escape();
        System.out.println("Welcome! This is the \"Escape the abandoned house \" game. \nWhat is your name?");
        Scanner input = new Scanner(System.in);
        Answer.name= input.next();
        System.out.println("Hello "+Answer.name);
        Answer.storyLine(); // executes the storyline

        boolean x= Answer.hallway();// executes the hallway function from class Escape
        
        // takes the player back to the hallway if they didn't get the right answer to the questions behind the doors they accessed 
        // and takes them back to the hallway 
        if (x==false) {
            while(x==false) {
                x = Answer.hallway();
            }
            }



            // if the player could answer the questions right, this tells them they won and the game ends
            System.out.println("CONGRATULATIONS " + Answer.name + "!! You have made it outside of the house.");
    }

}
