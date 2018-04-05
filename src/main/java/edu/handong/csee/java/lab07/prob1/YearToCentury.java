package edu.handong.csee.java.lab07.prob1;

public class YearToCentury {
	
	int year;
	
	public YearToCentury() {
		year=0;
	}
	
	public YearToCentury(int year) {
		this.year = year;
	}
	
	public int calculatecentury() {
		if(year%100==0) {
			year = year/100;
		}
		else {
			year = (year/100)+1;
		}
		
		return year;
	}

}
