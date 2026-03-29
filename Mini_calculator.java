import java.util.Scanner;
public class Mini_calculator {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int choice;
do{
System.out.println("1.OPTION(1 FOR ADDITION).");
System.out.println("2.OPTION(2 FOR SUBTRACTION).");
System.out.println("3.OTION(3 FOR MULTIPLICATION.)");
System.out.println("4.OPTION(4 FOR DIVISON.)");
System.out.println("5.EXIT");

System.out.println("ENTER YOUR CHOICE:");
choice=sc.nextInt();
if(choice>=1&&choice<=4){
System.out.println("ENTER FIRST NUMBER:");
double num1=sc.nextDouble();
System.out.println("ENTER SECOND NUMBER");
double num2=sc.nextDouble();
switch(choice){
case 1:
System.out.println("ADDITION OF TWO NUMBERS IS:"+(num1+num2));
break;
case 2:
System.out.println("SUBTRACTION OF TWO NUMBERS IS:"+(num1-num2));
break;
case 3:
System.out.println("MULTIPLICATION OF TWO NUMBERS IS:"+(num1*num2));
break;
case 4:
if(num2==0){
System.out.println("CAN'T DIVIDE BY ZERO");
}
else{
System.out.println("DIVISON OF TWO NUMBERS IS:"+(num1/num2));
}
break;
}
}
else if(choice==5){
System.out.println("EXIT-----");
}
else {
    System.out.println("INVALID CHOICE");
}
} while(choice!=5);
sc.close();
}
}
