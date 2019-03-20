package bicycles.models;


import bicycles.BicycleBase;
import bicycles.BicycleType;

public class MountainBike  extends BicycleBase {
    // this method is defined in the interface and only called in the MountainBike method
    @Override
    public void accelerate() {
        changeSpeed( 5);

    }
    // this method is defined in the interface and only called in the MountainBike method
    @Override
    public void brake() {
        changeSpeed( -3);

    }
    public BicycleType getBicycleType(){
        return BicycleType.MountainBike;
    }
}
