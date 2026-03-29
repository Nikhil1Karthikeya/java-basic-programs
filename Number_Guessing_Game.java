import java.util.Scanner;
import java.util.Random;
public class Number_Guessing_Game {
public static void main (String[]args){
Scanner sc=new Scanner(System.in);
Random rand=new Random();
int num=rand.nextInt(100)+1;
int n;
int attempts=0;
while(true){
System.out.println("ENTER THE NUMBER TO BE GUESSED:");
n=sc.nextInt();
attempts++;
if(n>num){
System.out.println("TOO HIGH");
}
else if(n<num) {
System.out.println("TOO LOW");
}
else {
    System.out.println("hurrah u won!!!");
    System.out.println("ATTEMPTS:"+attempts);
    break;
}
}
sc.close();
}
}
