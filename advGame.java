import java.util.Scanner;
import java.util.Random;
 
public class advGame{
 
   Scanner myScanner = new Scanner(System.in);
   Scanner enterScanner = new Scanner(System.in);
   int userInput;
   int exitNum;
   String userItem;
   String userName;
   
   
   
   public static void main(String[] args){
 
       System.out.println("...");
      
       
       advGame advGame;
		 advGame = new advGame();

		advGame.intro();
		
   
   } 
   public void intro(){
       System.out.println("...");
       System.out.println("In front of you are three items: ");
       System.out.println("\n|A bat|   |A flashlight|   |A key|");
       System.out.println("\nChoose wisely..."); 
       System.out.println("\nType: \"bat\" to pick up bat");
       System.out.println("\nType: \"flashlight\" to pick up flashlight");
       System.out.println("\nType: \"key\" to pick up key");
       userItem = myScanner.nextLine(); 
       

       
       //validate user's choice
       //print out scenario for each item
       if (userItem.equals("bat") || userItem.equals ("Bat") || userItem.equals("BAT")){
       System.out.println("\nGreat! You have picked up the " + userItem);
       System.out.println("\nYou have tried hitting the doors down with \nyour bat but they won't budge.");
       house(); 
       }
       else if (userItem.equals("flashlight") || userItem.equals("Flashlight") || userItem.equals("FLASHLIGHT")){
       System.out.println("\nGreat! You have picked up the " + userItem);
       System.out.println("\nYou have tried finding a way out with \nyour flashlight but you're unsuccessful.");
       house(); 
       }
       else if (userItem.equals("key") || userItem.equals("Key") || userItem.equals("KEY")){
       System.out.println("\nGreat! You have picked up the " + userItem);
       System.out.println("\nYou have tried unlocking the doors with \nyour key but they won't unlock.");
       house(); 
       }
       else {
       System.out.println("This is not a valid answer\n");
       intro();
       }
              
       
   }
 
   public void house(){
       //user enters the house, chandlier falls and must run down the hall.
       //user has to go through a trial of picking the right door
       //two doors are locked and one is unlocked, its randomized user must pick the right one
       System.out.println("\nFor a chance to escape: Choose a door number...");
       System.out.println("If your number matches the random number generated, you get to leave.");
       System.out.println("\n1: Door One \n2: Door Two \n3: Door Three");
       System.out.println("----------------------------------------------------------");
       
       userInput = myScanner.nextInt();
       //assigns a random number 1-3 to unlockedDoor
       exitNum =  (int)(Math.random() * 3 + 1);
       
       if (userInput == exitNum) {
       doorThree();
       }
       else if (userInput != exitNum && userInput == 1) {
       System.out.println("You have chosen 1.");
       doorOne();  
       }
       else if (userInput != exitNum && userInput == 2) {
       System.out.println("You have chosen 2.");
       doorTwo();
       }
       else if (userInput != exitNum && userInput == 3) {
       System.out.println("You have chosen 3.");
       doorTwo();
       }
       else {
       System.out.println("That is not a valid answer");
       house();
       } 
   }
 
   public void doorOne(){
       
       System.out.println("You have entered the basement!");
       System.out.println("It is dark! There is no way out!");
       
       lose();  
   }
 
   public void doorTwo(){
       //upstairs
      System.out.println("Oh NO!");
      lose();
   }
 
   public void doorThree(){
       //garage
       //user is able to
       System.out.println("You got it!");
       win();
   }
 
   public void win(){
       //user is able to leave the house, the sun is up and 
       //they are able to get to their car and contact someone and leave 
     System.out.println("Congrats! You were able to leave!");
     System.out.println("It's a bright and sunny morning, get in your car and get outta here!");
   
   }
 
   public void lose(){
       //user is trapped inside the house
       System.out.println("You are trapped!");
       System.out.println("You Lose!");
 
   }
 
    
  }
 
 
  

