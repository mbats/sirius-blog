package fr.obeo.dsl.houseofcards.design.service;

import houseofcards.Person;

public class HouseOfCardsServices {
	public String getImage(Person person) {
		String imageName = person.getName().replaceAll(" ", "_");
		if (imageName != null && imageName.length() > 0) {
			return "/fr.obeo.dsl.houseofcards.design/images/" + imageName+".jpg";
		}
		return "/fr.obeo.dsl.houseofcards.design/images/default.png";
	}
}