package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeSpecTest {

    @Test
    public void BikeSpecTestMountainBike(){
        BicycleType mountainBike = BicycleType.MountainBike;
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5,-3, BicycleType.MountainBike);
        Bicycle bicycle = new BicycleFromSpec(mountainBikeSpec);
      //  BikeRideOne bikeRideOne = new BikeRideOne(bicycle);

       // bikeRideOne.ride();
        assertEquals(5,mountainBikeSpec.getAccelerationSpeed());
        assertEquals(-3, mountainBikeSpec.getBrakeSpeed());
        assertEquals(BicycleType.MountainBike, mountainBikeSpec.getBicycleType());
    }


    @Test
    public void BikeSpecTestRoadBike(){
      BicycleType roadBike = BicycleType.RoadBike;
      BicycleSpecification roadBikeSpec = new BicycleSpecification(11,-4,BicycleType.RoadBike);
      Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
    //  BikeRideOne bikeRideOne = new BikeRideOne(bicycle);


   //   bikeRideOne.ride();
      assertEquals(11,roadBikeSpec.getAccelerationSpeed());
      assertEquals(-4, roadBikeSpec.getBrakeSpeed());
        assertEquals(BicycleType.RoadBike, roadBikeSpec.getBicycleType());
    }


    @Test
    public void BikeSpecTestTandemBike(){
     BicycleType tandems = BicycleType.Tandem;
     BicycleSpecification tandemsBikeSpec = new BicycleSpecification(12,-7, BicycleType.Tandem);
     Bicycle bicycle  = new BicycleFromSpec(tandemsBikeSpec);
  //   BikeRideOne bikeRideOne = new BikeRideOne(bicycle);

    // bikeRideOne.ride();
     assertEquals(12, tandemsBikeSpec.getAccelerationSpeed());
     assertEquals(-7, tandemsBikeSpec.getBrakeSpeed());
     assertEquals(BicycleType.Tandem, tandemsBikeSpec.getBicycleType());
 //    assertEquals(30, bikeRideOne.getCurrentSpeed());
    }



}
