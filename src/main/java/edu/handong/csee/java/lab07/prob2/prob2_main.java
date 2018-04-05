package edu.handong.csee.java.lab07.prob2;

/** 2018/04/05 hw1_4 21500483 lee min hoe
 * prob2 main
 *  : set chicken menu & print out menu
 */


import java.util.Scanner;

public class prob2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chicken menu1 = new Chicken("Cheese_mustard_chicken", 16000.00,4);//set menu1
		Chicken menu2 = new Chicken("Soysauce_chicken", 15000.00,5);//set menu2
		Chicken menu3 = new Chicken("Hot_spicy_chicken", 15000.00,4);//set menu3

		menu1.set_stars(5);//change menu1 stars data
		menu2.set_stars(4);//change menu2 stars data
		menu3.set_stars(3);//change menu3 stars data

		System.out.println(menu1.get_menu()+"'s rating is"+menu1.get_stars());//print out menu1's menu & stars data
		System.out.println(menu2.get_menu()+"'s rating is"+menu2.get_stars());//print out menu2's menu & stars data
		System.out.println(menu3.get_menu()+"'s rating is"+menu3.get_stars());//print out menu3's menu & stars data

	}

}
