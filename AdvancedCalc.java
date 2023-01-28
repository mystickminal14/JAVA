import java.util.Scanner;

public class AdvancedCalc{
public static void main(String [] args){

Scanner ab= new Scanner(System.in);
//to create scanner object

System.out.println("enter first  number");
int num1= ab.nextInt();

System.out.println("enter second  number");
int num2= ab.nextInt();

System.out.println("enter third  number");
double num3= ab.nextDouble();

double sum= num1 + num2 + num3;
double sub= num1 - num2 - num3;
double product= num1 * num2 * num3;
double div = (num1+num3)/num2;
int rem= num1 % num2;

System.out.println(" the sum="+sum);

System.out.println(" the diff="+sub);

System.out.println(" the product="+product);

System.out.println(" the div="+div);

System.out.println(" the remainder="+rem);
}}

