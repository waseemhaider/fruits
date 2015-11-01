package org.wahlzeit.model;

import java.io.Serializable;
/* A class to model FruitFoto Location
 */
public class Location implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6971967339760506918L;
	protected Coordinate shotAtXY;
	protected String  shotAtPlace;
	
	
	public Location(Coordinate shotAtXY, String shotAtPlace) {
		
		this.shotAtXY = shotAtXY;
		this.shotAtPlace = shotAtPlace;
	}
	public Coordinate getShotAtXY() {
		return shotAtXY;
	}
	public void setShotAtXY(Coordinate shotAtXY) {
		this.shotAtXY = shotAtXY;
	}
	public String getShotAtPlace() {
		return shotAtPlace;
	}
	public void setShotAtPlace(String shotAtPlace) {
		this.shotAtPlace = shotAtPlace;
	}

}
