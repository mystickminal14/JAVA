import java.util.Scanner;
public class Simpleinterest{
public static void main(String[] args){

Scanner sc= new Scanner(System.in);
System.out.println("enter principal=");
int prin= sc.nextInt();

System.out.println("enter rate=");
int rate= sc.nextInt();

System.out.println("enter time=");
double time= sc.nextFloat();

Double si= (prin* rate* time)/100;

System.out.println("the simple interest ="+si);
}}