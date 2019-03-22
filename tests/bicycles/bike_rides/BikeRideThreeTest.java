package bicycles.bike_rides;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandems;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideThreeTest {

    @Test
    public void mountainBikeRideThreeTest(){
        MountainBike mountainBike = new MountainBike();
        BikeRideThree bikeRideThree = new BikeRideThree(mountainBike);
        bikeRideThree.ride();
        assertEquals(45, bikeRideThree.getCurrentSpeed());
    }

    @Test
    public void roadBikeBikeRideThreeTest(){
        RoadBike roadBike = new RoadBike();
        BikeRideThree bikeRideThree = new BikeRideThree(roadBike);
        bikeRideThree.ride();
        assertEquals(99, bikeRideThree.getCurrentSpeed());
    }


    @Test
    public void tandemsBikeRideThreeTest(){
        Tandems tandems = new Tandems();
        BikeRideThree bikeRideThree = new BikeRideThree(tandems);
        bikeRideThree.ride();
        assertEquals(108, bikeRideThree.getCurrentSpeed());
    }

}
