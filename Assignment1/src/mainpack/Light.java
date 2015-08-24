package mainpack;


import java.util.logging.Logger;

public class Light {
	//To calculate the speed of light
	public static void main(String s, Object... args) {
		
	    int lightSpeed;
		long days;
		long seconds;

		// approximate speed of light in miles per second
		lightSpeed = 186000;

		days = 1000; // specify number of days here

		seconds = days * 24 * 60 * 60; // convert to seconds
		long distance;
		distance = lightSpeed * seconds; // compute distance
		 Logger log = Logger.getLogger(Light.class.getName());
		 
		log.fine("In " + days);
		log.fine(" days light will travel about ");
		log.fine(distance + " miles.");
	}


}