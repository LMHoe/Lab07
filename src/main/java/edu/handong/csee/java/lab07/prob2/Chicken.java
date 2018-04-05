package edu.handong.csee.java.lab07.prob2;

/** 2018/04/05 hw1_4 21500483 lee min hoe
 * class Chicken
 *  : put chicken's name, price, stars data
 *    into class variables and return menu 
 */


public class Chicken {

	private String menu;//string variable
	private double price;//double variable
	private int stars;//int variable

	public Chicken() {
		this.menu ="";
		this.price = 0.0;
		this.stars = 0;
	}//initialize values

	public Chicken(String manu, double price, int stars) {
		this.menu = manu;
		this.price = price;
		this.stars = stars;
	}//set menu, price, stars

	public String get_menu() {
		return this.menu;
	}//export menu

	public double get_price() {
		return this.price;
	}//export price

	public int get_stars() {
		return this.stars;
	}//export stars

	public void set_menu(String menu) {
		this.menu = menu;
	}//set menu data

	public void set_price(double price) {
		this.price = price;
	}//set price data

	public void set_stars(int stars) {
		this.stars = stars;
	}//set stars data
}
