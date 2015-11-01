package org.wahlzeit.model;

import java.io.Serializable;

/*Creating  domain photo class FruitFoto
 */
public class FruitPhoto extends Photo implements Serializable {
	
	private static final long serialVersionUID = -4156006420561533191L;
	protected Location fruitFotoLocation;

	public FruitPhoto() {
		// TODO Auto-generated constructor stub
	}

	public FruitPhoto(PhotoId myId) {
		super(myId);
		// TODO Auto-generated constructor stub
	}

}
