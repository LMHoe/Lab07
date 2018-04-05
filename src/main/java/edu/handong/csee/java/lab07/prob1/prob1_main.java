package edu.handong.csee.java.lab07.prob1;

/** 2018/04/05 hw1_4 21500483 lee min hoe
 * prob1 main
 *  : calculate century that user typed
 */

import java.util.Scanner;

public class prob1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int y=0; //int variable y;

		Scanner keyboard = new Scanner(System.in); //to get input

		System.out.println("input year : "); //ask user to input year
		y= keyboard.nextInt();//get int in y

		YearToCentury year = new YearToCentury(y);// calculate century
		System.out.println(y+" is "+year.calculatecentury()+"th century");//print out century information

	}

}
