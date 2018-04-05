package edu.handong.csee.java.lab07.prob1;

import java.util.Scanner;

public class prob1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int y=0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("input year : ");
		y= keyboard.nextInt();
		
		YearToCentury year = new YearToCentury(y);
		System.out.println(y+" is "+year.calculatecentury()+"th century");

	}

}
