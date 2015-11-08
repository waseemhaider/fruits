package org.wahlzeit.model;

import java.util.logging.Logger;

import org.wahlzeit.services.LogBuilder;

public class FruitPhotoFactory extends PhotoFactory {
	
	
	protected FruitPhotoFactory() {
		// do nothing
	}
	
	/**
	 * Creates a new photo 
	 * @methodtype factory
	 */
	@Override
	public Photo createPhoto() {
		return new FruitPhoto();
	}

	/**
	 * Creates a new photo with the specified id
	 * @methodtype factory
	 */
	@Override
	public Photo createPhoto(PhotoId id) {
		return new FruitPhoto(id);
	}
	
}
