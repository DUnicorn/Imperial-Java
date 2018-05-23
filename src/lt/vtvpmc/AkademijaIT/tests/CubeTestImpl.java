package lt.vtvpmc.AkademijaIT.tests;




import lt.vtvpmc.AkademijaIT.MetricCubeImpl;
import lt.vtvpmc.java.imperial.AbstractCubeTest;
import lt.vtvpmc.java.imperial.ImperialCube;
import lt.vtvpmc.java.imperial.MetricCube;

public class CubeTestImpl extends AbstractCubeTest{
	
	@Override
	protected MetricCube adapt(ImperialCube imperialCube) {
       
		return new MetricCubeImpl(imperialCube);
	}
	
	
}
