import java.util.Scanner;
public class Length{
public static void main(String [] args){

Scanner sc= new Scanner(System.in);
System.out.println("enter name of the country:");
String country= sc.nextLine();

System.out.println("enter country capital:");
String capital= sc.nextLine();
String temp="nepal";


//to check the length
System.out.println("Length of the country:"+ country.length());
System.out.println("Length of the capitall:"+ capital.length());

//to show specific char
System.out.println(capital.charAt(4));

//to join the string
System.out.println("Address is"+ capital.concat(country));

//to chech whether string is equAL OR NOT
System.out.println(" is string equal" +capital.equals(temp));


//TO GET THE SUB STRING
System.out.println(country.substring(1,3));

//FOR LOWERCASE
System.out.println(country.toLowerCase());

//FOR UPPERCASE
System.out.println(country.toUpperCase());
}}


