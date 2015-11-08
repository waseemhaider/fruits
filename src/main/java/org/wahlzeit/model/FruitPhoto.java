package org.wahlzeit.model;

import com.googlecode.objectify.annotation.Entity;

@Entity
public class FruitPhoto extends Photo {
	
	private String name;
	private Location origin;
	
	/**
	 * @methodtype constructor
	 */
	public FruitPhoto() {
		super();
	}

	/**
	 * @methodtype constructor
	 */
	public FruitPhoto(PhotoId myId) {
		super(myId);
	}

	/**
	 * @methodtype get
	 * @return origin
	 */
	public Location getOrigin() {
		return origin;
	}

	/**
	 * @methodtype set
	 * @param origin to set
	 * @throws IllegalArgumentException
	 */
	public void setOrigin(Location origin) throws IllegalArgumentException {
		if (origin == null) {
			throw new IllegalArgumentException("Origin must be a place or country with approximate coordinates");
		}
		this.origin= origin;
	}

	/**
	 * @methodtype get
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @methodtype set
	 * @param name to set
	 * @throws IllegalArgumentException
	 */
	public void setName(String name) throws IllegalArgumentException {
		if (name== null) {
			throw new IllegalArgumentException("name cannot be null");
		}
		this.name = name;
	}


}

