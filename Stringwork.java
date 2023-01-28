import java.util.Scanner;

public class Stringwork{
public static void main(String [] args){

Scanner sc= new Scanner(System.in);
System.out.println("enter a person name :");
String name= sc.nextLine();
System.out.println("enter a dog name :");
String dname= sc.nextLine();
String ren="M inal";
System.out.println("the length of the word="+ name.length());

System.out.println(" one specific charcter="+ name.charAt(2));

System.out.println("full name="+ name.concat(dname));


System.out.println("the sub string="+ name.substring(0,2));

System.out.println("the uppercase="+name.toUpperCase());
System.out.println("the lowercase="+name.toLowerCase());

System.out.println("is it equal?"+ name.equals(ren));
}}






