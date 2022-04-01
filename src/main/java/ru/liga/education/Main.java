package ru.liga.education;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> series = new ArrayList<>();
		series.add(1);
		series.add(2);
		series.add(3);
		series.add(4);
		List<Integer> number = new ArrayList<>();
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(5);
		number.add(6);
		Member firstTry = new Member("Sharshatov", "Maksim", "Aleksandrovich", "blue", "brown",
				series, number);

		AutomatedSystem.register(firstTry);

		Member secondTry = new Member("Sharshatov", "Maksim", "Aleksandrovich", "grey", "black",
				series, number);

		AutomatedSystem.register(secondTry);

		Member thirdTry = new Member("Sharshatov", "Alexey", "Aleksandrovich", "blue", "red",
				series, number);

		AutomatedSystem.register(thirdTry);

		Member fourthTry = new Member("Popov", "Maksim", "Aleksandrovich", "green", "brown",
				series, number);

		AutomatedSystem.register(fourthTry);

		List<Integer> newSeries = new ArrayList<>(4);
		newSeries.add(0);
		newSeries.add(0);
		newSeries.add(0);
		newSeries.add(1);
		List<Integer> newNumber = new ArrayList<>(6);
		newNumber.add(6);
		newNumber.add(5);
		newNumber.add(4);
		newNumber.add(3);
		newNumber.add(2);
		newNumber.add(1);
		Member fifthTry = new Member("Sharshatov", "Maksim", "Aleksandrovich", "blue", "brown",
				newSeries, newNumber);

		AutomatedSystem.register(fifthTry);


		AutomatedSystem.showUniqueMembers(AutomatedSystem.weedOutDeceivers());
	}

}
