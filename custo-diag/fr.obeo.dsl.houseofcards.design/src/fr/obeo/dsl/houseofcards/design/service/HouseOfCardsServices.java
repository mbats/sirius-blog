package fr.obeo.dsl.houseofcards.design.service;

import fr.obeo.dsl.houseofcards.design.Activator;
import houseofcards.Person;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

public class HouseOfCardsServices {
	public String getImage(Person person) {
		Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);
		String imageName = person.getName().replaceAll(" ", "_") + ".jpg";
		Path imagePath = new Path("/images/" + imageName);
		URL imageURL = FileLocator.find(bundle, imagePath, null);

		if (imageURL != null) {
			return "/fr.obeo.dsl.houseofcards.design/" + imagePath.toString();
		}
		return "/fr.obeo.dsl.houseofcards.design/images/default.png";
	}
}