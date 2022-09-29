import java.util.Scanner;
import java.lang.Math.*;

class Main{
public static void guessNum(){
  Scanner sc = new Scanner(System.in);
  int num = (int)(Math.floor(Math.random() * 100 + 1)) ;
  System.out.println("Guess a number between 1 and 100:\nYou have 5 tries! Good luck :)");

  int k=5;
  for (int i=0; i<k; i++){
    System.out.println("Guess a number:");
    int guess= sc.nextInt();
    if(guess==num){
      System.out.println("Correct guess!");
      return;
    }
    else if(num<guess & i!=k-1){
      System.out.println("The number is less than " + guess);
    }
     else if(num>guess & i!=k-1){
      System.out.println("The number is greater than " + guess);
  }
  }
  System.out.println("You ran out of tries! The number is " + num);
}
  public static void main(String[] args) {
    guessNum();
  }
}