package com.angelaadema.temperatures;

import java.util.ArrayList;
import java.util.Scanner;

public class Temperatures {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String weekDay;
		int average = 0;
		int sum = 0;
		
		ArrayList<String> day = new ArrayList<>();
			day.add("Monday");
			day.add("Tuesday");
			day.add("Wednesday");
			day.add("Thursday");
			day.add("Friday");
			day.add("Saturday");
			day.add("Sunday");
			
			//System.out.println(day.toString());
			
		ArrayList<Integer> avgTemp = new ArrayList<>();
			avgTemp.add(65);
			avgTemp.add(52);
			avgTemp.add(53);
			avgTemp.add(47);
			avgTemp.add(47);
			avgTemp.add(55);
			avgTemp.add(63);
			
			//System.out.println(avgTemp.toString());

		
		
	}
}
