package trialForProject;

import java.util.*;

public class RandomizeOutputs {
    public static void main(String[] args){
      boolean x= false;
      if(x==false){
          while (x==false) {
              x = doorChoice();
          }

      }

      System.out.println("congratulations! you have made it outside of the house");



    }

    static boolean doorChoice(){
        System.out.println("please enter a number from 1-3 ");
        Scanner input= new Scanner(System.in);
        Random rand= new Random();
        int door1= rand.nextInt(3)+1;

        int door2=0;
        int door3=0;
        while( door2==door1|| door2==0){
            door2=rand.nextInt(3)+1;
        }

        while(door3==door1 || door3==door2 || door3==0){
            door3=rand.nextInt(3)+1;
        }
        boolean v = false;
        int choice = input.nextInt();
        if(choice==door1){
            //System.out.println(theDoor1());// this is just to show the output
            v= theDoor1();
        }
        if(choice==door2){
            //System.out.println(theDoor2());//this is just to show the output
            v = theDoor2();
        }
        if(choice==door3){
            //System.out.println(theDoor3());//this is just to show the output
            v = theDoor3();
        }
        return v;
    }
    static boolean theDoor2() {
        int number1= (int)(Math.random()*5)+5;
        int number2= (int)(Math.random()*5)+5;
        int number3= (int)(Math.random()*5)+5;
        int number4= (int)(Math.random()*5)+5;
        int total1= number1 + number2;
        int toatl2= number3 * number4;
        System.out.println(" Now you have the key to door2. This  door leads you to a basement" +
                "/ where there is a locked door with a password. in order to get out of the house you need" +
                "/ to enter the correct password ");
        System.out.println("password hint: "+ number1 + "+" + number2
                + " space " +number3 +"*" + number4);
        Scanner input= new Scanner(System.in);
        int Ans1 = input.nextInt();
        int Ans2 = input.nextInt();
        if (Ans1==total1 && Ans2==toatl2){
            return true;
        }
        else{
            System.out.println("wrong password" +
                    "\n now you are back to the hallway");
            return false;
        }
    }
    static boolean theDoor1(){
        System.out.println("Now you have the key to door2. This  door leads you to  upper room through the stairs \n" +
                "choose an item to help you escape through the window ( please enter the word without any space)");
        System.out.println(" 1. bat \n 2. rope \n 3. flashlight \n 4. ladder" );
        Scanner input= new Scanner(System.in);
        String item = input.next();
        //boolean y= false;
        if(item.equals("rope")  ){
           return true;
        }
        else if(item.equals("ladder")){
            return true;
        }
        else{
            System.out.println("you have not chosen the right item to help you escape " +
                    "\n now you are back to the hallway");
            return false;
        }
        //return y;
    }
    static boolean theDoor3() {
        System.out.println("Now you have the key to door2. This  door leads you to  the garage \n" +
                "choose an item to help you open the garage door");
        System.out.println(" 1. bat \n 2. rope \n 3. remote \n 4. ladder");// I am so sorry I don't know what is used to open a garage
        Scanner input = new Scanner(System.in);
        int item = input.nextInt();
        //boolean y = false;
        if (item == 2  ) {
           return true;
        }
        else if(item == 4){
            return true;
        }
        else {
            System.out.println("you have not chosen the right item to help you open the garage door" +
                    "\n now you are back to the hallway");
            return false;
        }

    }
}
