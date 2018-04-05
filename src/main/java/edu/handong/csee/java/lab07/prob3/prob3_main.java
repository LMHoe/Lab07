package edu.handong.csee.java.lab07.prob3;

/** 2018/04/05 hw1_4 21500483 lee min hoe
 * prob3 main
 *  : set students' information
 *    set students' absences using randomnumber
 *    print out whether students' are failed of not
 */


import java.util.Random;//import util.Random

public class prob3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Attendance s_1 = new Attendance();//create new attendance
		Attendance s_2 = new Attendance();//create new attendance
		Attendance s_3 = new Attendance("Lee", 3, "21600756",0);//create new attendance with data
		Attendance s_4 = new Attendance("Kim", 1, "21800458",0);//create new attendance with data

		s_1.set_name("Park");//set s_1 name
		s_1.set_year(4);//set s_1 year
		s_1.set_student_id("21500091");//set s_1 student id
		s_1.set_missed(0);//set s_1 missed

		s_2.set_name("Choi");//set s_2 name
		s_2.set_year(1);//set s_2 year
		s_2.set_student_id("21800444");//set s_2 student id
		s_2.set_missed(0);//set s_2 missed

		Random randomGenerator = new Random(); //create random

		s_1.set_missed(randomGenerator.nextInt(10));//set s_1 missed data by random number
		s_2.set_missed(randomGenerator.nextInt(10));//set s_2 missed data by random number
		s_3.set_missed(randomGenerator.nextInt(10));//set s_3 missed data by random number
		s_4.set_missed(randomGenerator.nextInt(10));//set s_4 missed data by random number

		if(s_1.get_missed()>6) {
			System.out.println("I'm sorry "+s_1.get_name()+". you fail this course");
			System.out.println(s_1.get_name()+" - number of absence: "+s_1.get_missed());	
		}//print if s_1 missed is over 6, s_1 failed course
		else {
			System.out.println("We'll see about the grade, "+s_1.get_name());
		}//print if s_1 missed is under 6

		if(s_2.get_missed()>6) {
			System.out.println("I'm sorry "+s_2.get_name()+". you fail this course");
			System.out.println(s_2.get_name()+" - number of absence: "+s_2.get_missed());	
		}//print if s_2 missed is over 6, s_1 failed course
		else {
			System.out.println("We'll see about the grade, "+s_2.get_name());
		}//print if s_2 missed is under 6

		if(s_3.get_missed()>6) {
			System.out.println("I'm sorry "+s_3.get_name()+". you fail this course");
			System.out.println(s_3.get_name()+" - number of absence: "+s_3.get_missed());	
		}//print if s_3 missed is over 6, s_1 failed course
		else {
			System.out.println("We'll see about the grade, "+s_3.get_name());
		}//print if s_3 missed is under 6

		if(s_4.get_missed()>6) {
			System.out.println("I'm sorry "+s_4.get_name()+". you fail this course");
			System.out.println(s_4.get_name()+" - number of absence: "+s_4.get_missed());	
		}//print if s_4 missed is over 6, s_1 failed course
		else {
			System.out.println("We'll see about the grade, "+s_4.get_name());
		}//print if s_4 missed is under 6

	}

}
