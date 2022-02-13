import java.util.Scanner;
import java.util.Random;
 
public class adventuregame{
 
   Scanner input = new Scanner(System.in);
   Random rand= new Random();


   int pick = 0;
   int continuing = 0;
   int help = 0;
   public static void main(String[] args){
   
   Scanner input = new Scanner(System.in);
   
   adventuregame abandonedhouse;
   abandonedhouse = new adventuregame();
   
   
   abandonedhouse.intro();
   
   
   
   }
   
   public void intro(){
        //This is the intro to the game, the first part is story telling. Giving the setting of the game. 
        System.out.println(">>You are driving down an abondoned road late at night. You just got out of a late meeting and the gps has guided you down a new road.\n");
        System.out.println(">>Trusting the GPS you begind to take turns and enter into roads you have never seen before. The roads are empty except for you,\n");
        
        System.out.println("(Press '0' to continue dialogue or press any number to skip.)");
        int next = input.nextInt(); 
        
        if (next == 0){
        
           System.out.println(">>Trusting the GPS you begin to take turns and enter into roads you have never seen before. The roads are empty except for you,\n");
           System.out.println("only a few streetlights illuminating the road. As you listen to the GPS you turn down a road and drive, you see a large house\n");
            
           
           System.out.println("(Press '0')");
           int next1 = input.nextInt(); 
        
           
           if (next == 0){
           
            System.out.println("glowing under the moonlight. It looks intimidating and you try not to look at it for too long.Suddently you hear a weird noise\n");
            System.out.println("coming from your car and get worried. You have never heard it before until today. You try to ignore the noise until your car starts\n");
            System.out.println("jerking in an unusual manner. Suddently, the car begins to slow down and finally completely halts in the middle of the road. You try\n");
            
            
            System.out.println("(Press '0')");
            int next3 = input.nextInt();
            if (next == 0){
            
               System.out.println("to turn it on multiple times but it doesnt work. You reach for your phone and try to call AAA hoping they will be able to help you.\n");
               System.out.println(">>With worry you dial the number and wait. The automated vocie begins to speak asking for what you need.\n");
            
               
            
            }

           
           }
        }

        
        else{
        
           System.out.println(">>Trusting the GPS you begind to take turns and enter into roads you have never seen before. The roads are empty except for you,\n");
           System.out.println("only a few streetlights illuminating the road. As you listen to the GPS you turn down a road and drive, you see a large house\n");
           System.out.println("glowing under the moonlight. It looks intimidating and you try not to look at it for too long.Suddently you hear a weird noise\n");
           System.out.println("coming from your car and get worried. You have never heard it before until today. You try to ignore the noise until your car starts\n");
           System.out.println("jerking in an unusual manner. Suddently, the car begins to slow down and finally completely halts in the middle of the road. You try\n");
           System.out.println("to turn it on multiple times but it doesnt work. You reach for your phone and try to call AAA hoping they will be able to help you.\n");
           System.out.println(">>With worry you dial the number and wait. The automated voice begins to speak asking for what you need.\n");
        
        
        }
        //user must enter 1 or 2 to continue
        while(help < 1 || help > 3){
            System.out.println("(Automated Voice: press '1' for help.)");
            help = input.nextInt(); 
            
            if(help == 1 || help == 2){
            
               System.out.println("You press for help. The voice tells you that it will take more than 10 hours to get help.\n");
               System.out.println("Before you can refute the call ends. You look at your phone and notice your service is completely gone.\n");
               System.out.println("Without a working phone or a working car you begin to get scared.\n");
               System.out.println("You remember the house you just passed by. Without any other choice you get out of your car and head towards the house.\n");
               
               System.out.println("(Press '0' to continue)");
               int next1 = input.nextInt(); 

               if(next == 0){
                  house();
               }
            }
                     
            else{
            
               System.out.println("Your response is not valid...\n");

            
            }
         
         }   
         
   
   }
   
   public void house(){
   
      System.out.println("As you approach the house you notice that there are no lights turned on.\n");
      System.out.println("You cant hear any noises except for the trees rustling with the wind.\n");
      System.out.println("The house is beautiful, illuminating in the moonlight. You ignore any doubt and head to the door.\n");
      
      int knock = 0;
      while (knock != 1){
      
         System.out.println("(Press '1' to knock on door.)");
         knock = input.nextInt();
         
         if (knock == 1){
            System.out.println("You knock on the door. With the force of the knock, the door opens.\n");
            System.out.println("It was unlocked the entire time.\n");
            System.out.println("You enter into the house. Looking around, you notice that its old.\n");
            System.out.println("and there are spider webs everywhere. The house looks abandoned.\n");
            
            System.out.println("(Press '0' to continue");
            int next4 = input.nextInt(); 
            
            if (next4 == 0){
            
               System.out.println("The chandlier on the ceiling is large but looks fragile.\n");
               System.out.println("Before you could turn around to leave, a large gust of wind comes out\n");
               System.out.println("of nowhere and the door slams closed. You're frightened and reach for the door handle.\n");
            
            
               int handle = 0;
               while (handle !=1){
               
                  System.out.println("(Press '1' to open the door)\n");
                  handle = input.nextInt();
               
                  if (handle == 1){
                     System.out.println("The door is stuck...\n");
                     System.out.println("It wont open no matter how hard you try to pull it.\n");
                     System.out.println("You try to use more force, through a crack on the wall to the cieling,\n");
                     System.out.println("you hear the chandlier shake. You look up and notice its becoming loose.\n");
                     System.out.println("You leave the door and start running down the hall. The chandlier crashes but\n");
                     System.out.println("you get out of the way before it falls. Theres debri everywhere.\n");
                     
                     System.out.print("(Press '0' to go into hallway)\n");
                     int next5 = input.nextInt();
                     
                     if (next5 == 0){
                        hallway();
                     }
                  }
               }
               }
         }

      
      
      }
   }
   
   public void hallway(){
      
      System.out.println("The chandlier crash prevents you from going back towards the front door.\n");
      System.out.println("As the debri clears you notice three doors in the hallway. You try to open them all but\n");
      System.out.println("every door is locked... Its then you notice a box on a table. You pick up the box and shake it,\n");
      System.out.println("something clatters against each other You cant see inside the box so you reach in and grasp\n"); 
      System.out.println("the first thing you can feel.\n");
      
      int pull = 0;
      while(pull !=1){
         System.out.println("(Press '1' to pull out an item)\n");
         pull = input.nextInt();
         
         int randomnumber = rand.nextInt(3);
         randomnumber += 1;
         
         System.out.println("The item is a key! You pull it out and there is a number on it.\n");
         System.out.println("It says 'Door #" + randomnumber + "' You head to the door with " + randomnumber + " on it.\n");
         
         if(randomnumber == 1){
            doorone();
         }
         
         else if (randomnumber == 2){
            doortwo();
         
         }
         
         else if (randomnumber == 3){
            doorthree();
         
         }
         
         
         
      }
   
   
   }
   
   public void doorone(){
   
      System.out.println("Door one leads you upstairs.");
      System.out.println("In front of you are three items: ");
      System.out.println("\n|A bat|   |A flashlight|   |A key|");
      System.out.println("\nChoose wisely..."); 
      System.out.println("\nType: \"bat\" to pick up bat");
      System.out.println("\nType: \"flashlight\" to pick up flashlight");
      System.out.println("\nType: \"key\" to pick up key");
      String userItem = input.nextLine(); 
                    
      if (userItem.equals("bat") || userItem.equals ("Bat") || userItem.equals("BAT")){
         System.out.println("\nGreat! You have picked up the " + userItem);
         System.out.println("\nYou have tried hitting the doors down with \nyour bat but they won't budge.");
         hallway(); 
      }
      else if (userItem.equals("flashlight") || userItem.equals("Flashlight") || userItem.equals("FLASHLIGHT")){
         System.out.println("\nGreat! You have picked up the " + userItem);
         System.out.println("\nYou have tried finding a way out with \nyour flashlight but you're unsuccessful.");
         hallway(); 
      }
      else if (userItem.equals("key") || userItem.equals("Key") || userItem.equals("KEY")){
         System.out.println("\nGreat! You have picked up the " + userItem);
         System.out.println("\nYou have tried unlocking the doors with \nyour key but they won't unlock.");
         hallway(); 
      }
      else {
         System.out.println("This is not a valid answer\n");
         doorone();
      }
   }
   
   public void doortwo(){
   
        int number1= (int)(Math.random()*5)+5;
        int number2= (int)(Math.random()*5)+5;
        int number3= (int)(Math.random()*5)+5;
        int number4= (int)(Math.random()*5)+5;
        int total1= number1 + number2;
        int toatl2= number3 * number4;
       
       
        System.out.println(" Now you have the key to Door 2. This  door leads you to a basement\n"); 
        System.out.println("where there is a locked door with a password. in order to get out of the house you need\n");
        System.out.println("to enter the correct password \n");
        System.out.println("password hint: "+ number1 + "+" + number2 + " space " +number3 +"*" + number4);
        
        Scanner input= new Scanner(System.in);
        
        int Ans1 = input.nextInt();
        int Ans2 = input.nextInt();
        if (Ans1==total1 && Ans2==toatl2){
           System.out.println("You got the right answer!\n");
           ending(); 
        }
        else{
            System.out.println("wrong password... Now you are back to the hallway\n");
            hallway();
        }
   
      
  
  
  
  
  
   }
   
   
   public void doorthree(){
   
      System.out.println("You entered into a door 3 with your key. The room is dark, you cant see where you are.\n");
      System.out.println("You feel around the wall next to you and find a light switch.\n");
      
      int light = 0;
      while(light != 1){
         System.out.println("(Press '1' to turn the light on)\n");
         light = input.nextInt();
         
         if(light == 1){
                              
            while(pick != 2){
               
              System.out.println("You continue to look around the garage. There are several items that you can look through!\n");
              System.out.println("press '1' to look in shelf\n"); 
              System.out.println("press '2' to look in box\n"); 
              System.out.println("press '3' to look in trashcan\n");
              System.out.println("press '4' to look in bag\n");
                     
              System.out.println("What do you pick?: ");
              pick = input.nextInt();
                           
              if (pick == 1){            
                        
                 System.out.println("You picked the shelf. You rumage through shelf and didnt find anything...\n");
                 hallway();
              }
                     
              else if (pick == 2){
                        
                 System.out.println("You picked the box. There are many items in the box.\n"); 
                 System.out.println("You look inside and find an object that might be useful...\n");
                 System.out.println("It's a garage door opener!\n You press the button and it opens!\n");
                 ending();
              }
                     
               else if (pick == 3){
                     
                  System.out.println("You picked the trashcan...\n");
                  System.out.println("Something smells gross.\n");
                  System.out.println("You reach inside and a mouse jumps out!\n");
                  System.out.println("Theres nothing in here...\n");
                  hallway();
               
               }
                     
               else if (pick == 4){
                     
                   System.out.println("You picked the bag. You reach inside.\n");
                   System.out.println("There are random items inside. Looks like it was used for school.\n");
                   System.out.println("There are pencils and notebooks. Other then that...\n");
                   System.out.println("Theres nothing in here....\n");
                   hallway();
               }
                     
               else{
                  System.out.println("Please enter a proper choice...\n");
                  hallway();
               }
               }
               
           }
           else{
              
              System.out.println("Please enter a proper choice...\n");
              
              
           }
            
            }
         
         }
         
   public void ending(){
   
      System.out.println("You found a way out of the house! It's already morning now.\n");
      System.out.println("As you leave the house you get your service back.\n");
      System.out.println("You dial for help and they are on their way You can finally go home!\n");

   
   }

}  
