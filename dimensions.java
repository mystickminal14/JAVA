/*Write a program that displays the dimensions of a letter-size (8.5 × 11
inches) sheet of paper in millimeters. There are 25.4 millimeters per
inch. Use constants and comments in your program.*/

public class dimensions{
public static void main(String [] args){
 
//putting constant
final double MILLIMETER_PER_INCH=25.4;
 double letterSize =8.5 *11;

double dim=letterSize * MILLIMETER_PER_INCH;
System.out.println("the dimensions are :"+dim);
}}






