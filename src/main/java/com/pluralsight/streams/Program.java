package com.pluralsight.streams;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		//this also includes the StreamsPart2 code from Exercise2

		Scanner getInput = new Scanner(System.in);


		List<Person> peers = new ArrayList<>();

		peers.add(new Person("Muhammad", "Mustafa", 19));
		peers.add(new Person("Margaret", "Palma", 29));
		peers.add(new Person("Hunbal", "Durrani", 26));
		peers.add(new Person("Richard", "John", 22));
		peers.add(new Person("Odalis", "Estrada", 26));
		peers.add(new Person("Kendell", "Holmes", 24));
		peers.add(new Person("Tanner", "Hodges", 22));
		peers.add(new Person("Nisa", "King", 22));
		peers.add(new Person("Morgan", "Edmonds", 21));
		peers.add(new Person("Hignacio", "Virgen", 21));

		System.out.println("Type a name to search: ");
		String search = getInput.nextLine();

		List<Person> result = peers.stream()
				.filter(p -> p.getFullName().toLowerCase().contains(search))
				.collect(Collectors.toCollection(ArrayList::new));

	}




}
