package edu.handong.csee.java.lab07.prob3;

/** 2018/04/05 hw1_4 21500483 lee min hoe
 * class Attendance
 *  : set name, year, student_id, missed data
 *    into class variables & provide data to users
 *    using get_[]() function
 */


import java.util.*;//import every util

public class Attendance {

	private String name = "";//string variable
	private int year =0;//int variable
	private String student_id ="";//string variable
	private int missed = 0;//int variable

	public Attendance() {
		this.name = "Null";
		this.year = 0;
		this.student_id = "Null";
		this.missed = 0;
	}//initialize data

	public Attendance(String name, int year, String student_id, int missed) {
		this.name = name;
		this.year = year;
		this.student_id = student_id;
		this.missed = missed;
	}//set values

	public String get_name() {
		return name;
	}//export name
	public int get_year() {
		return year;
	}//export year
	public String get_student_id() {
		return student_id;
	}//export student id
	public int get_missed() {
		return missed;
	}//export missed

	public void set_name(String name) {
		this.name = name;
	}//set name data
	public void set_year(int year) {
		this.year = year;
	}//set year data
	public void set_student_id(String student_id) {
		this.student_id = student_id;
	}//set student id data
	public void set_missed(int missed) {
		this.missed = missed;
	}//set missed data

}
