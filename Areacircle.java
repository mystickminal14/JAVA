import java.util.Scanner;

public class Areacircle{
public static void main(String[] args){



Scanner sc= new Scanner(System.in);

System.out.println("enter a radius = ");
int radius= sc.nextInt();

final double PI=3.14;


double area= PI * radius  *radius;

System.out.println("the area of a circle="+area);
}}


