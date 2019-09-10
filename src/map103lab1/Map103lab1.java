/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map103lab1;

import java.util.Scanner;

/**
 *
 * @author 19039518
 */
public class Map103lab1 {
public static void main( String args[] ) {
// Create a Scanner to obtain information from the command prompt
Scanner input = new Scanner( System.in );
// Create variables to hold information

System.out.println("Enter temperature in Fahrenheit");
   int temperature = input.nextInt();
 
    temperature = ((temperature - 32)*5)/9;
 
    System.out.println("temperature in Celsius = " + temperature);
  }
}
