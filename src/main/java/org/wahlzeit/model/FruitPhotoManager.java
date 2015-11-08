package org.wahlzeit.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Logger;

import org.wahlzeit.services.LogBuilder;

import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.Work;

public class FruitPhotoManager extends PhotoManager {

	private static final Logger log = Logger.getLogger(FruitPhotoManager.class.getName());

	/**
	 * @methodtype command
	 *
	 * Load all persisted Fruit photos. Executed when Wahlzeit is restarted.
	 */
	@Override
	public void loadPhotos() {
		Collection<FruitPhoto> existingPhotos = ObjectifyService.run(new Work<Collection<FruitPhoto>>() {
			@Override
			public Collection<FruitPhoto> run() {
				Collection<FruitPhoto> existingPhotos = new ArrayList<FruitPhoto>();
				readObjects(existingPhotos, FruitPhoto.class);
				return existingPhotos;
			}
		});

		for (Photo photo : existingPhotos) {
			if (!doHasPhoto(photo.getId())) {
				log.config(LogBuilder.createSystemMessage().
						addParameter("Load Photo with ID", photo.getIdAsString()).toString());
				loadScaledImages(photo);
				doAddPhoto(photo);
			} else {
				log.config(LogBuilder.createSystemMessage().
						addParameter("Already loaded Photo", photo.getIdAsString()).toString());
			}
		}

		log.info(LogBuilder.createSystemMessage().addMessage("All photos loaded.").toString());
	}
	
}
