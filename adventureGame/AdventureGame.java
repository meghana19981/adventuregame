package adventureGame;

import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args){
        Escape Answer = new Escape();
        System.out.println("Wlcome this is \"Escape the abondend house game\" \n what is your name?");
        Scanner input = new Scanner(System.in);
        Answer.name= input.next();
        System.out.println("Hello "+Answer.name);
        Answer.storyLine();

        boolean x= Answer.hallway();

        if (x==false) {
                x=Answer.hallway();
            }


        //System.out.println(x);
        System.out.println("congratulations! you have made it outside of the house");



    }

}
