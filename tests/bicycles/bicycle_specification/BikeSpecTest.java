package bicycles.bicycle_specification;

import bicycles.Bicycle;
import bicycles.BicycleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeSpecTest {

    @Test
    public void BikeSpecTestMountainBike(){
        BicycleType mountainBike = BicycleType.MountainBike;
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5,-3, BicycleType.MountainBike);
        Bicycle bicycle = new BicycleFromSpec(mountainBikeSpec);
        assertEquals(5,mountainBikeSpec.getAccelerationSpeed());
        assertEquals(-3, mountainBikeSpec.getBrakeSpeed());
        assertEquals(BicycleType.MountainBike, mountainBikeSpec.getBicycleType());
    }


    @Test
    public void BikeSpecTestRoadBike(){
      BicycleType roadBike = BicycleType.RoadBike;
      BicycleSpecification roadBikeSpec = new BicycleSpecification(11,-4,BicycleType.RoadBike);
      Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
      assertEquals(11,roadBikeSpec.getAccelerationSpeed());
      assertEquals(-4, roadBikeSpec.getBrakeSpeed());
      assertEquals(BicycleType.RoadBike, roadBikeSpec.getBicycleType());
    }


    @Test
    public void BikeSpecTestTandemBike(){
     BicycleType tandems = BicycleType.Tandem;
     BicycleSpecification tandemsBikeSpec = new BicycleSpecification(12,-7, BicycleType.Tandem);
     Bicycle bicycle  = new BicycleFromSpec(tandemsBikeSpec);
     assertEquals(12, tandemsBikeSpec.getAccelerationSpeed());
     assertEquals(-7, tandemsBikeSpec.getBrakeSpeed());
     assertEquals(BicycleType.Tandem, tandemsBikeSpec.getBicycleType());
    }



}
