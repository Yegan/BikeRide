package bicycles.bicycle_specification;

import bicycles.BicycleBase;
import bicycles.BicycleType;

public class BicycleFromSpec extends BicycleBase {

    private final bicycles.bicycle_specification.BicycleSpecification BicycleSpecification;

    public BicycleFromSpec(BicycleSpecification BicycleSpecification){
        this.BicycleSpecification = BicycleSpecification;
    }

    @Override
    public void accelerate() {
        this.BicycleSpecification.getAccelerationSpeed();
    }

    @Override
    public void brake() {
        this.BicycleSpecification.getBrakeSpeed();
    }

    @Override
    public BicycleType getBicycleType(){
        return this.BicycleSpecification.getBicycleType();
    }
}
