package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandems;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest3 {

   // MountainBike BikeRideThree test
    @Test
    public void mountainBikeRideThreeTest(){
        MountainBike mountainBike = new MountainBike();
        BikeRideThree BikeRideThree = new BikeRideThree(mountainBike);

        BikeRideThree.ride();
        assertEquals(45, BikeRideThree.getCurrentSpeed());
    }

//    // RoadBike BikeRideThree test
    @Test
    public void roadBikeBikeRideThreeTest(){
        RoadBike roadBike = new RoadBike();
        BikeRideThree BikeRideThree = new BikeRideThree(roadBike);

        BikeRideThree.ride();
        assertEquals(99, BikeRideThree.getCurrentSpeed());
    }


    // Tandems BikeRideThree test
    @Test
    public void tandemsBikeRideThreeTest(){
        Tandems tandems = new Tandems();
        BikeRideThree BikeRideThree = new BikeRideThree(tandems);

        BikeRideThree.ride();
        assertEquals(108, BikeRideThree.getCurrentSpeed());
    }

}
