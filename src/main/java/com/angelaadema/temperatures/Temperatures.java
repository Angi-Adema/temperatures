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
			
		ArrayList<Integer> dailyTemp = new ArrayList<>();
			dailyTemp.add(65);
			dailyTemp.add(52);
			dailyTemp.add(53);
			dailyTemp.add(47);
			dailyTemp.add(47);
			dailyTemp.add(55);
			dailyTemp.add(63);
			

			System.out.println("Please enter a day of the week for temp on one day or enter 'week' for full week temps with average: ");
			weekDay = scnr.nextLine();	
			
			if (weekDay.equalsIgnoreCase("week")) {
				
				for (int i = 0; i < day.size(); i++) {
					System.out.println(day.get(i) + ": " + dailyTemp.get(i));
					sum += dailyTemp.get(i);
				}
				
				average = sum / dailyTemp.size();
				System.out.println("The week's average temp is: " + average);
				
			} else {
				int index = day.indexOf(weekDay);
				
				if (index != -1) {
					System.out.println("Your selected day is: " + weekDay + " and the temperature is expected to be: " + dailyTemp.get(index));
				} else {
					System.out.println("Please enter a valid day.");
				}
			}
	}
}
