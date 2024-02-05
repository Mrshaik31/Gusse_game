package miniproject;
import java.util.Scanner;

 public class guess_game{
    public static void main(String[]args){

        int myNumber=(int)(Math.random()*100);
        int userNumber=0;
       do{
            System.out.println("Guess the number between 10 to 100:");
           Scanner sc=new Scanner(System.in);
             userNumber=sc.nextInt();

            if(userNumber==myNumber){
                System.out.println("WOOHOO...CORRECT NUMBER!!!");
            }
            else if(userNumber>myNumber){
                System.out.println(" your number is too large");
            }
            else System.out.println("your number is too small");
        }while(userNumber>=0);
        System.out.print("My number was:");
        System.out.println(myNumber);
    }
}