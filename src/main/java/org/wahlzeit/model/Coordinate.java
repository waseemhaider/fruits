package org.wahlzeit.model;
import java.io.Serializable;


/* Coordinate class for adding new coordinate attribute to Location class 
 */

public class Coordinate implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1176090257347090645L;
	protected double latitude;
	protected double longitude;
	
	public Coordinate(){
		
	}
	
	public Coordinate(double latitude, double longitude){
		this.setLatitude(latitude);
		this.setLongitude(longitude);
	}
	
	public double getDistance(Coordinate otherLocation){
//		this.latitude
//		this.longitude
//		otherLocation.getLatitude()
		
//		otherLocation.longitude()
		
		return 0;
	}
	
	public double getLatitudinalDistance(Coordinate otherLocation){
//		Empty. Must be added later. this.latitude
//		this.longitude
//		otherLocation.getLatitude()
//		otherLocation.longitude()
		
		return 0;
	}
	
	public double getLongitudinalDistance(Coordinate otherLocation){
		
//		this.latitude
//		this.longitude
//		otherLocation.getLatitude()
//		otherLocation.longitude()
		
		return 0;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
}
