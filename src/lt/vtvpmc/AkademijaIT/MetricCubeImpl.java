package lt.vtvpmc.AkademijaIT;

import org.apache.log4j.Logger;
import lt.vtvpmc.java.imperial.ImperialCube;
import lt.vtvpmc.java.imperial.MetricCube;

public class MetricCubeImpl implements MetricCube {
	
	final static Logger logger = Logger.getLogger( MetricCubeImpl.class);

    protected ImperialCube imperialCube;
    
   
	public MetricCubeImpl(ImperialCube imperialCube) {
		super();
		this.imperialCube = imperialCube;
	}

	
	/**
	 * Retrieve cube color. Change letter if retrieve gray to grey
	 */
	@Override
	public String getColor() {
		
		if (imperialCube.getColor().contains("gray")) {
			logger.info("Replacing letters");
			return imperialCube.getColor().replaceFirst("a", "e");
			
		}
		logger.info("Getting color");
		return imperialCube.getColor();
	}

	/**
	 * Convert side inches to centimeters
	 */
	@Override
	public double getSideInCentimeters() {
		double sideInIches = imperialCube.getSideInInches();
		logger.info("Calculating side from inches to centimeters");
		return sideInIches * 2.54;
	}
	/**
	 * Convert cube volume from inches to centimeters
	 */

	@Override
	public double getVolumeInCentimeters() {
		double sideVolumeInInches = imperialCube.getVolumeInInches();
		logger.info("Calculating volume from inches to centimeters");
		return sideVolumeInInches*Math.pow(2.54, 3);
	}

}
