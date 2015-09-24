package com.project.common.beans;

public class Activity {

	public static void main(String[] args) {
		StudentData data = new StudentData();
		
		displayGreeting();
		data.display();
	}
	private static void displayGreeting(){
		System.out.println("Hello Student");
		System.out.println("HI");
	}

}
