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
        System.out.println("You are driving down an abondoned road late at night. You just got out of a late meeting and the gps has guided you down a new road.");
        System.out.println("Trusting the GPS you begind to take turns and enter into roads you have never seen before. The roads are empty except for you, only a few streetlights illuminating the road.");
        System.out.println("As you listen to the GPS you turn down a road and drive, you see a large house glowing under the moonlight. It looks intimidating and you try not to look at it for too long.");
        System.out.println("Suddently you hear a weird noise coming from your car and get worried. You have never heard it before until today. You try to ignore the noise until your car starts jerking in an unusual manner.");
        System.out.println("Suddently, the car begins to slow down and finally completely halts in the middle of the road. You try to turn it on multiple times but it doesnt work.");
        System.out.println("You reach for your phone and try to call AAA hoping they will be able to help you. With worry you dial the number and wait.");
        System.out.println("The automated vocie begins to speak asking for what you need.");
        
        //user must enter 1 or 2 to continue
        while(help < 1 || help > 3){
            System.out.println("Automated Voice: press '1' for help.");
            help = input.nextInt(); 
            
            if(help == 1 || help == 2){
            
            System.out.println("You press for help.\n The voice tells you that it will take more than 10 hours to get help.\n Before you can refute the call ends. You look at your phone and notice your service is completely gone.");
            System.out.println("Without a working phone or a working car you begin to get scared.\n You remember the house you just passed by.\n Without any other choice you get out of your car and head towards the house.");
            house();
            
            }
                     
            else{
            
            System.out.println("Your response is not valid...");
            
             
            
            }
         
         }   
         
   
   }
   
   public void house(){
   
      System.out.println("As you approach the house you notice that there are no lights turned on.\n You cant hear any noises except for the trees rustling with the wind.\n The house is beautiful, illuminating in the moonlight.\n You ignore any doubt and head to the door.");
      
      int knock = 0;
      while (knock != 1){
      
         System.out.println("Press '1' to knock on door.");
         knock = input.nextInt();
         
         if (knock == 1){
            System.out.println("You knock on the door.\n With the force of the knock, the door opens.\n It was unlocked the entire time.\n");
            System.out.println("You enter into the house. Looking around, you notice that its old and there are spider webs everywhere.\n The house looks abandoned.\n The chandlier on the ceiling is large but looks fragile.\n Before you could turn around to leave, a large gust of wind comes out of nowhere and the door slams closed.\n You're frightened and reach for the door handle.");
            
            int handle = 0;
            while (handle !=1){
               
               System.out.println("Press '1' to open the door.");
               handle = input.nextInt();
               
               if (handle == 1){
                  System.out.println("The door is stuck... It wont open no matter how hard you try to pull it.\n You try to use more force, through a crack on the wall to the cieling, you hear the chandlier shake.\n You look up and notice its becoming loose.\n You leave the door and start running down the hall. The chandlier crashes but you get out of the way before it falls.\n Theres debri everywhere.");
                  hallway();
               }
            }
         }
      
      
      }
   }
   
   public void hallway(){
      
      System.out.println("The chandlier crash prevents you from going back towards the door.\n As the debri clears you notice three doors in the hallway.\n You try to open them all but every door is closed...\n Its then you notice a box on a table.\n You pick up the box and shake it, something clatters against each other\n You cant see inside the box so you reach in and grasp the first thing you can feel.");
      
      int pull = 0;
      while(pull !=1){
         System.out.println("Press '1' to pull out an item!");
         pull = input.nextInt();
         
         int randomnumber = rand.nextInt(3);
         randomnumber += 1;
         
         System.out.println("The item is a key! You pull it out and there is a number on it. It says 'Door #" + randomnumber + "' You head to the door with " + randomnumber + " on it.");
         
         if(randomnumber == 1){
            //doorone();
         }
         
         else if (randomnumber == 2){
           //doortwo();
         
         }
         
         else if (randomnumber == 3){
           doorthree();
         
         }
         
         
         
      }
   
   
   }
   
   public void doorone(){
   
   }
   
   public void doortwo(){
   
   }
   
   
   public void doorthree(){
   
      System.out.println("You entered into a door 3 with your key \n The room is dark, you cant see where you are.");
      System.out.println("You feel around the wall next to you and find a light switch.");
      
      int light = 0;
      while(light != 1){
         System.out.println("Press '1' to turn the light on!");
         light = input.nextInt();
         
         if(light == 1){
                              
            while(pick != 2){
               
              System.out.println("You continue to look around the garage. There are several items that you can look through!");
              System.out.println("press '1' to look in shelf"); 
              System.out.println("press '2' to look in box"); 
              System.out.println("press '3' to look in trashcan");
              System.out.println("press '4' to look in bag");
                     
              System.out.println("What do you pick?: ");
              pick = input.nextInt();
                           
              if (pick == 1){            
                        
                 System.out.println("You picked the shelf. You rumage through shelf and didnt find anything...");
              }
                     
              else if (pick == 2){
                        
                 System.out.println("You picked the box.\n There are many items in the box.\n You look inside and find an object...\n It's a garage door opener!\n You press the button and it opens!");
                 ending();
              }
                     
               else if (pick == 3){
                     
                  System.out.println("You picked the trashcan...\n Something smells gross.\n You reach inside and a mouse jumps out!\n Theres nothing in here...");
               }
                     
               else if (pick == 4){
                     
                   System.out.println("You picked the bag. You reach inside.\n There are random items inside. Looks like it was used for school.\n There are pencils and notebooks. Other then that...\n Theres nothing in here....");
               }
                     
               else{
                  System.out.println("Please enter a proper choice...");
               }
               }
               
           }
           else{
              
              System.out.println("Please enter a proper choice...");
           }
            
            }
         
         }
         
   public void ending(){
   
      System.out.println("You found a way out of the house! It's already morning now.\n As you leave the house you get your service back.\n You dial for help and they are on their way\n You can finally go home!");

   
   }

}  
