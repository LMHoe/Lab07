package edu.handong.csee.java.lab07.prob1;

/** 2018/04/05 hw1_4 21500483 lee min hoe
 * class YearToCentury
 *  : get int year & calculate century
 */


public class YearToCentury {

	int year; //int variable

	public YearToCentury() {
		year=0;
	}//set initial value of year

	public YearToCentury(int year) {
		this.year = year;
	}//set value of year

	public int calculatecentury() {
		if(year%100==0) {
			year = year/100;
		}
		else {
			year = (year/100)+1;
		}

		return year;
	}//calculate century

}
