package adventureGame;
import java.util.*;

public class Escape {
    public int doorChoice;
    Scanner input = new Scanner(System.in);

    public Escape() {

    }

    public Escape(int choice) {
        this.doorChoice = choice;

    }

    public void storyLine() {


        //This is the intro to the game, the first part is story telling. Giving the setting of the game.
        System.out.println(">>You are driving down an abondoned road late at night. You just got out of a late meeting and the gps has guided you down a new road.");
        System.out.println(">>Trusting the GPS you begind to take turns and enter into roads you have never seen before. The roads are empty except for you,");
        System.out.println("only a few streetlights illuminating the road. As you listen to the GPS you turn down a road and drive, you see a large house");
        System.out.println("glowing under the moonlight. It looks intimidating and you try not to look at it for too long.Suddently you hear a weird noise");
        System.out.println("coming from your car and get worried. You have never heard it before until today. You try to ignore the noise until your car starts");
        System.out.println("jerking in an unusual manner. Suddently, the car begins to slow down and finally completely halts in the middle of the road. You try");
        System.out.println("to turn it on multiple times but it doesnt work. You reach for your phone and try to call AAA hoping they will be able to help you.");
        System.out.println(">>With worry you dial the number and wait. The automated vocie begins to speak asking for what you need.");

        //user must enter 1 or 2 to continue
        int help = 0;

        while (help < 1 || help > 3) {
            System.out.println("Automated Voice: press '1' for help.");
            help = input.nextInt();

            if (help == 1 || help == 2) {

                System.out.println("You press for help.\n The voice tells you that it will take more than 10 hours to get help.\n Before you can refute the call ends. You look at your phone and notice\n your service is completely gone.");
                System.out.println("Without a working phone or a working car you begin to get scared.\n You remember the house you just passed by.\n Without any other choice you get out of your car and head towards the house.");
                house();

            } else {

                System.out.println("Your response is not valid...");


            }

        }


    }

    public void house() {

        System.out.println("As you approach the house you notice that there are no lights turned on.\n You cant hear any noises except for the trees rustling with the wind.\n The house is beautiful, illuminating in the moonlight.\n You ignore any doubt and head to the door.");


        int knock = 0;
        while (knock != 1) {

            System.out.println("Press '1' to knock on door.");
            knock = input.nextInt();

            if (knock == 1) {
                System.out.println("You knock on the door.\n With the force of the knock, the door opens.\n It was unlocked the entire time.\n");
                System.out.println("You enter into the house. Looking around, you notice that its old and there are spider webs everywhere.\n The house looks abandoned.\n The chandlier on the ceiling is large but looks fragile.\n Before you could turn around to leave, a large gust of wind comes out of nowhere and the door slams closed.\n You're frightened and reach for the door handle.");

                int handle = 0;
                while (handle != 1) {

                    System.out.println("Press '1' to open the door.");
                    handle = input.nextInt();

                    if (handle == 1) {
                        System.out.println("The door is stuck... It wont open no matter how hard you try to pull it.\n You try to use more force, through a crack on the wall to the cieling, you hear the chandlier shake.\n You look up and notice its becoming loose.\n You leave the door and start running down the hall. The chandlier crashes but you get out of the way before it falls.\n Theres debri everywhere.");
                        hallway();
                    }
                }
            }


        }


    }

    public boolean hallway() {
        System.out.println(" Now you are in the hallway, there are three doors");
        System.out.println("please enter a number from 1-3, to choose a door ");
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

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


    // the conditions need an edit from Jordan
    public boolean theDoor1() {
        System.out.println("...");
        System.out.println("In front of you are three items: ");
        System.out.println("\n|A bat|   |A flashlight|   |A ladder|");
        System.out.println("\nChoose wisely...");
        System.out.println("\nType: \"bat\" to pick up bat");
        System.out.println("\nType: \"flashlight\" to pick up flashlight");
        System.out.println("\nType: \"ladder\" to pick up key");
        String userItem = input.next();



        //validate user's choice
        //print out scenario for each item
        boolean result = false;
        if (userItem.equals("bat") || userItem.equals ("Bat") || userItem.equals("BAT")){
            System.out.println("\nGreat! You have picked up the " + userItem);
            System.out.println("\nYou have tried hitting the windows down with \nyour bat but they won't budge.");
            result = false;
        }
        else if (userItem.equals("flashlight") || userItem.equals("Flashlight") || userItem.equals("FLASHLIGHT")){
            System.out.println("\nGreat! You have picked up the " + userItem);
            System.out.println("\nYou have tried finding a way out with \nyour flashlight but you're unsuccessful.");
            result = false;
        }
        else if (userItem.equals("ladder") || userItem.equals("Ladder") || userItem.equals("LADDER")){
            System.out.println("\nGreat! You have picked up the " + userItem);
            System.out.println("\nYou have tried unlocking the doors with \nyour key but they won't unlock.");
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
        System.out.println(" Now you have the key to door2. This  door leads you to a basement" +
                "\n where there is a locked door with a password. in order to get out of the house you need" +
                "\n to enter the correct password ");
        System.out.println("password hint: " + number1 + "+" + number2
                + " space " + number3 + "*" + number4);
        Scanner input = new Scanner(System.in);
        int Ans1 = input.nextInt();
        int Ans2 = input.nextInt();
        if (Ans1 == total && Ans2 == product) {
            return true;
        }
        else {
            System.out.println("wrong password" +
                    "\n now you are back to the hallway");
            return false;
        }
    }


    // Meghana's door
    public boolean theDoor3() {
        System.out.println("You entered into a door 3 with your key \n The room is dark, you cant see where you are.");
        System.out.println("You feel around the wall next to you and find a light switch.");
        boolean result = false;
        int light = 0;
        while (light != 1) {
            System.out.println("Press '1' to turn the light on!");
            light = input.nextInt();

            if (light == 1) {
                System.out.println("You continue to look around the garage. There are several items that you can look through!");
                System.out.println("press '1' to look in shelf");
                System.out.println("press '2' to look in box");
                System.out.println("press '3' to look in trashcan");
                System.out.println("press '4' to look in bag");

                System.out.println("What do you pick?: ");
                int pick = input.nextInt();

                if (pick == 1) {

                    System.out.println("You picked the shelf. You rumage through shelf and didnt find anything...");
                    result = false;
                }
                else if (pick == 2) {

                    System.out.println("You picked the box.\n There are many items in the box.\n You look inside and find an object...\n It's a garage door opener!\n You press the button and it opens!");
                    result = true;
                }
                else if (pick == 3) {

                    System.out.println("You picked the trashcan...\n Something smells gross.\n You reach inside and a mouse jumps out!\n Theres nothing in here...");
                    result = false;
                }
                else if (pick == 4) {

                    System.out.println("You picked the bag. You reach inside.\n There are random items inside. Looks like it was used for school.\n There are pencils and notebooks. Other then that...\n Theres nothing in here....");
                    result = false;
                }
                else {
                    System.out.println("Please enter a proper choice...");
                }


            }
            else {

                System.out.println("Please enter a proper choice...");
            }

        }
        return result;

    }

    public static void main(String[] args){
        Escape Answer = new Escape();
        Answer.storyLine();
        boolean x= false;

        if(x==false){
            while (x==false) {
                x=Answer.hallway();
            }

        }

        System.out.println("congratulations! you have made it outside of the house");



    }

}
