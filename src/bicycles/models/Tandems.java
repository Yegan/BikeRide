package bicycles.models;

import bicycles.BicycleBase;
import bicycles.BicycleType;

public class Tandems extends  BicycleBase {

    @Override
    public void accelerate() {
        changeSpeed(12);
    }

    @Override
    public void brake() {
        changeSpeed(-7);
    }

    public BicycleType getBicycleType(){
        return BicycleType.Tandem;
    }
}
