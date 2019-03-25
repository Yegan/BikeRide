package bicycles.bicycle_specification;

import bicycles.BicycleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleSpecificationTest {


    @Test
    public void BicycleSpecMountainBikeTest(){
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5,-3, BicycleType.MountainBike);
        assertEquals(BicycleType.MountainBike, mountainBikeSpec.getBicycleType());
    }

    @Test
    public void BicycleSpecRoadBikeTest(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11,-4,BicycleType.RoadBike);
        assertEquals(BicycleType.RoadBike, roadBikeSpec.getBicycleType());
    }

    @Test
    public void BicycleSpecTandemBikeTest(){
        BicycleSpecification tandemsBikeSpec = new BicycleSpecification(12,-7, BicycleType.Tandem);
        assertEquals(BicycleType.Tandem, tandemsBikeSpec.getBicycleType());
    }

}
