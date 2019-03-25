package bicycles.bicycle_specification;

import bicycles.Bicycle;
import bicycles.BicycleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeSpecTest {

    @Test
    public void BikeSpecTestMountainBike(){
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5,-3, BicycleType.MountainBike);
        Bicycle bicycle = new BicycleFromSpec(mountainBikeSpec);
        assertEquals(5,mountainBikeSpec.getAccelerationSpeed());
        assertEquals(-3, mountainBikeSpec.getBrakeSpeed());
    }


    @Test
    public void BikeSpecTestRoadBike(){
      BicycleSpecification roadBikeSpec = new BicycleSpecification(11,-4,BicycleType.RoadBike);
      Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
      assertEquals(11,roadBikeSpec.getAccelerationSpeed());
      assertEquals(-4, roadBikeSpec.getBrakeSpeed());
    }


    @Test
    public void BikeSpecTestTandemBike(){
     BicycleSpecification tandemsBikeSpec = new BicycleSpecification(12,-7, BicycleType.Tandem);
     Bicycle bicycle  = new BicycleFromSpec(tandemsBikeSpec);
     assertEquals(12, tandemsBikeSpec.getAccelerationSpeed());
     assertEquals(-7, tandemsBikeSpec.getBrakeSpeed());
    }



}
