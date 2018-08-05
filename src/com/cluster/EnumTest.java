package com.cluster;

public class EnumTest {

	Day day;

	public EnumTest(Day day) {
		this.day = day;
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	public static void main(String[] args) {

		EnumTest enumTest = new EnumTest(Day.MONDAY);
		enumTest.tellItLikeItIs();

	}

	public void tellItLikeItIs() {
		switch (day) {
		case SUNDAY:
			System.out.println("SUNDAY'S ARE GREAT");
			break;

		case MONDAY:
			System.out.println("MONDAY'S ARE WORST");
			break;
		}
	}
}
