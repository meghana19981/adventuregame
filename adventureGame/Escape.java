package adventureGame;
import java.util.*;

public class Escape {
    public int doorChoice;
    public String name;
    Scanner input = new Scanner(System.in);

    public Escape() {

    }

    public Escape(int choice, String playerName) {
        this.doorChoice = choice;
        this.name = playerName;

    }

    public void storyLine() {
            //This is the intro to the game, the first part is story telling. Giving the setting of the game.
            System.out.println("You are driving down an abandoned road late at night. You just got out of a late meeting and the gps has guided you down a new road.\n");
            System.out.println("Trusting the GPS you begin to take turns and enter into roads you have never seen before. The roads are empty except for you,\n");
            
            //so there isnt too much dialogue on the screen, user has to press 0 to continue or press any number to display the full dialogue. 
            System.out.println("(Press '0' to continue dialogue or press any number to skip.\n)");
            int next = input.nextInt();

            if (next == 0){

                System.out.println("Trusting the GPS you begin to take turns and enter into roads you have never seen before. The roads are empty except for you,\n");
                System.out.println("only a few streetlights illuminating the road. As you listen to the GPS you turn down a road and drive, you see a large house\n");

                //to continue to next dialogue
                System.out.println("(Press '0')\n");
                int next1 = input.nextInt();


                if (next == 0){

                    System.out.println("glowing under the moonlight. It looks intimidating and you try not to look at it for too long. Suddenly you hear a weird noise\n");
                    System.out.println("coming from your car and get worried. You have never heard it before until today. You try to ignore the noise until your car starts\n");
                    System.out.println("jerking in an unusual manner. The car begins to slow down and finally completely halts in the middle of the road. You try\n");

                    //to continue to next dialogue
                    System.out.println("(Press '0')");
                    int next3 = input.nextInt();
                    if (next == 0){

                        System.out.println("to turn it on multiple times but it doesnt work. You reach for your phone and try to call AAA hoping they will be able to help you.\n");
                        System.out.println(">>With worry you dial the number and wait. The automated voice begins to speak asking for what you need.\n");



                    }


                }
            }


            else{
                // if the user presses any other number the dialogue displays completely.
                System.out.println(">>Trusting the GPS you begind to take turns and enter into roads you have never seen before. The roads are empty except for you,\n");
                System.out.println("only a few streetlights illuminating the road. As you listen to the GPS you turn down a road and drive, you see a large house\n");
                System.out.println("glowing under the moonlight. It looks intimidating and you try not to look at it for too long. Suddenly you hear a weird noise\n");
                System.out.println("coming from your car and get worried. You have never heard it before until today. You try to ignore the noise until your car starts\n");
                System.out.println("jerking in an unusual manner. The car begins to slow down and finally completely halts in the middle of the road. You try\n");
                System.out.println("to turn it on multiple times but it doesnt work. You reach for your phone and try to call AAA hoping they will be able to help you.\n");
                System.out.println(">>With worry you dial the number and wait. The automated voice begins to speak asking for what you need.\n");


            }
            //user must enter 1 or 2 to continue
            int help=0;
            //This while loop allows it so the user can only press 1 for help, if they press an invalid entry it loops them back to press 1.
            while(help == 1){
                System.out.println("(Automated Voice: press '1' for help.)");
                help = input.nextInt();
                
                if(help == 1 || help == 2){

                    System.out.println("You press for help. The voice tells you that it will take more than 10 hours to get help.\n");
                    System.out.println("Before you can refute, the call ends. You look at your phone and notice your service is completely gone.\n");
                    System.out.println("Without a working phone or a working car you begin to get scared.\n");
                    System.out.println("You remember the house you just passed by. Without any other choice you get out of your car and head towards the house.\n");
                   
                    //to continue to next dialogue
                    System.out.println("(Press '0' to continue)");
                    int next1 = input.nextInt();
                    
                    //if user asks to go to next dialogue, it enters into house function.
                    if(next == 0){
                        house();
                    }
                }

                else{
                    //if user enters wrong response, it displays this and loops back.
                    System.out.println("Your response is not valid...\n");


                }

            }


        }
    public void house(){
        
        //Starts the sequence of user entering into the house.
        System.out.println("As you approach the house you notice that there are no lights turned on.\n");
        System.out.println("You cant hear any noises except for the trees rustling with the wind.\n");
        System.out.println("The house is beautiful, illuminating in the moonlight. You ignore any doubt and head to the door.\n");
        
        //loop to knock. They have to press 1 to knock. If they press anything else it loops them back till they press 1.
        int knock = 0;
        while (knock != 1){
            
            //asking user to enter 1.
            System.out.println("(Press '1' to knock on door.)");
            knock = input.nextInt();
            
            //When the user enters 1, they are able to go to the next dialogue. 
            if (knock == 1){
                System.out.println("You knock on the door. The force of the knock, the door opens.\n");
                System.out.println("It was unlocked the entire time.\n");
                System.out.println("You enter into the house. Looking around, you notice that its old.\n");
                System.out.println("and there are spider webs everywhere. The house looks abandoned.\n");
                
                //to continue to next dialogue
                System.out.println("(Press '0' to continue");
                int next4 = input.nextInt();

                if (next4 == 0){

                    System.out.println("The chandlier on the ceiling is large but looks fragile.\n");
                    System.out.println("Before you could turn around to leave, a large gust of wind comes out\n");
                    System.out.println("of nowhere and the door slams closed. You're frightened and reach for the door handle.\n");

                    //user must enter 1 to open door, they will be looped back if they say anything else till they open the door.
                    int handle = 0;
                    while (handle !=1){
                        
                        //to open door and continue to next dialogue.
                        System.out.println("(Press '1' to open the door)\n");
                        handle = input.nextInt();
                        
                        //when user enters 1, they are able to go to next dialogue. 
                        if (handle == 1){
                            System.out.println("The door is stuck...\n");
                            System.out.println("It wont open no matter how hard you try to pull it.\n");
                            System.out.println("You try to use more force, through a crack on the wall to the cieling,\n");
                            System.out.println("you hear the chandlier shake. You look up and notice its becoming loose.\n");
                            System.out.println("You leave the door and start running down the hall. The chandlier crashes but\n");
                            System.out.println("you get out of the way before it falls. There's debri everywhere.\n");
               
                            //to continue to next dialogue
                            System.out.print("(Press '0' to go into hallway)\n");
                            int next5 = input.nextInt();

                            if (next5 == 0){
                                //hallway();
                            }
                        }
                    }
                }
            }



        }
    }

    public boolean hallway() {
        //hallway dialogue.
        System.out.println(" Now you are in the hallway, there are three doors\n");
       
        //user must pick a door they want to go through.
        System.out.println("please enter a number from 1-3, to choose a door\n");
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        //the door number is given randomly.
        int door1 = rand.nextInt(3) + 1;

        int door2 = 0;
        int door3 =0;

        while (door2 == door1 || door2 == 0) {
            door2 = rand.nextInt(3) + 1;
        }

        while (door3 == door1 || door3 == door2 || door3 == 0) {
            door3 = rand.nextInt(3) + 1;
        }
        boolean v = false;
        int choice = input.nextInt();
        if (choice == door1) {
            //System.out.println(theDoor1());// this is just to show the output
            v = theDoor1();
        }
        if (choice == door2) {
            //System.out.println(theDoor2());//this is just to show the output
            v = theDoor2();
        }
        if (choice == door3) {
            //System.out.println(theDoor3());//this is just to show the output
            v = theDoor3();
        }
        return v;
    }


    // Jordan's Door
    public boolean theDoor1() {
    
        //print statements for the items the user can pick
        System.out.println("...");
        System.out.println("In front of you are three items: \n");
        System.out.println("\n|A bat|   |A flashlight|   |A ladder|\n");
        System.out.println("\nChoose wisely...\n");
        System.out.println("\nType: \"bat\" to pick up the bat\n");
        System.out.println("\nType: \"flashlight\" to pick up the flashlight\n");
        System.out.println("\nType: \"ladder\" to pick up the ladder\n");
        String userItem = input.next();



        //validate user's choice
        //print out scenario for each item
        boolean result = false;
        
        //prints out bat scenario
        if (userItem.equals("bat") || userItem.equals ("Bat") || userItem.equals("BAT")){
            System.out.println("\nYou have picked up the " + userItem);
            System.out.println("\nUnfortunately, you have tried hitting the windows down with \nyour bat but they won't break.\n");
            result = false;
        }
        
        //prints out flashlight scenario
        else if (userItem.equals("flashlight") || userItem.equals("Flashlight") || userItem.equals("FLASHLIGHT")){
            System.out.println("\nYou have picked up the " + userItem);
            System.out.println("\nUnfortunately, you have tried finding a way out with \nyour flashlight but you're unsuccessful.\n");
            result = false;
        }
        
        //prints out ladder scenario
        else if (userItem.equals("ladder") || userItem.equals("Ladder") || userItem.equals("LADDER")){
            System.out.println("\nGreat! You have picked up the " + userItem);
            System.out.println("\nYou were able to climb up to a window with \nyour ladder and jump out!\n");
            result = true;
        }
        else {
            System.out.println("This is not a valid answer\n");
            theDoor1();
        }

        return result;
        }



     // Meseret's door
    public boolean theDoor2() {
        int number1 = (int) (Math.random() * 5) + 5;
        int number2 = (int) (Math.random() * 5) + 5;
        int number3 = (int) (Math.random() * 5) + 5;
        int number4 = (int) (Math.random() * 5) + 5;
        int total = number1 + number2;
        int product = number3 * number4;
        System.out.println(" Now you have the key to door2. This  door leads you to a basement\n" +
        System.out.println("where there is a locked door with a password. in order to get out of the house you need\n");
        System.out.println("to enter the correct password: \n");
        System.out.println("password hint: " + number1 + "+" + number2
                + " space " + number3 + "*" + number4);
        Scanner input = new Scanner(System.in);
        int Ans1 = input.nextInt();
        int Ans2 = input.nextInt();
        if (Ans1 == total && Ans2 == product) {
            return true;
        }
        else {
            System.out.println("wrong password\n");
            System.out.println("\n now you are back to the hallway\n");
            return false;
        }
    }


    // Meghana's door
    public boolean theDoor3() {
        System.out.println("You entered into a door 3 with your key \n The room is dark, you cant see where you are.\n");
        System.out.println("You feel around the wall next to you and find a light switch.\n");
        boolean result = false;
        int light = 0;
        
        //makes user turn on the light, if they press any other number, they are told to press 1 again. It loops them back.
        while (light != 1) {
            System.out.println("Press '1' to turn the light on!\n");
            light = input.nextInt();
            
            //when they turn the light on, they are able to see around them. They will find objects they can look through.
            if (light == 1) {
                
                //Gives users the ability to check where they want to look in the garage. One location has a way to escape.
                System.out.println("You continue to look around the garage. There are several items that you can look through!\n");
                System.out.println("press '1' to look in shelf\n");
                System.out.println("press '2' to look in box\n");
                System.out.println("press '3' to look in trashcan\n");
                System.out.println("press '4' to look in bag\n");
                
                //user has to pick from 1-4 
                System.out.println("What do you pick?: \n");
                int pick = input.nextInt();
                
                //if user picks 1, they look through the shelf. The shelf has nothing so they are sent back to the hallway to play again.
                if (pick == 1) {

                    System.out.println("You picked the shelf. You rumage through shelf and didnt find anything...\n");
                    result = false;
                }
                //if user picks 2, there is a box. The box has the garage door opener and they are able to escape.
                else if (pick == 2) {

                    System.out.println("You picked the box. There are many items in the box.\n"); 
                    System.out.println("You look inside and find an object that might be useful...\n");
                    System.out.println("It's a garage door opener! You press the button and it opens!\n");                    
                    result = true;
                }
                
                //If user picks 3, they look through the trashcan. Theres nothing in it that is helpful. Sent back to hallway.
                else if (pick == 3) {

                    System.out.println("You picked the trashcan...\n");
                    System.out.println("Something smells gross.\n");
                    System.out.println("You reach inside and a mouse jumps out!\n");
                    System.out.println("Theres nothing in here...\n");                    
                    result = false;
                }
                
                //user picks up bag and theres nothing inside of it. Sent back to hallway.
                else if (pick == 4) {

                   System.out.println("You picked the bag. You reach inside.\n");
                   System.out.println("There are random items inside. Looks like it was used for school.\n");
                   System.out.println("There are pencils and notebooks. Other then that...\n");
                   System.out.println("Theres nothing in here....\n");                    
                   result = false;
                }
                
                //they need to pick a proper number.
                else {
                    System.out.println("Please enter a proper choice...");
                }


            }
            //they need to pick a proper number.
            else {

                System.out.println("Please enter a proper choice...");
            }

        }
        return result;

    }


}
