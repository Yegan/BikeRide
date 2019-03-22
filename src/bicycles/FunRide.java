package bicycles;

import java.util.ArrayList;
import java.util.List;

public class FunRide {

    private int bicycleTypeCount;
    private int maxNumberOfBikes;
    private List<Bicycle> myList = new ArrayList<Bicycle>();

    public FunRide(int numberOfBikes){
    this.maxNumberOfBikes = numberOfBikes;

    }

    public void accept(Bicycle bicycle) {
        if (this.maxNumberOfBikes > myList.size()) {
        myList.add(bicycle);
        }
        else{
            System.out.println( "The fun race is full");
        }
    }

    public int getEnteredCount(){
        return myList.size();
    }



    public int getCountForType(BicycleType bicycleType){
        for(Bicycle bicycle:myList){
            if (bicycle.getBicycleType() == bicycleType ) {
                bicycleTypeCount++;
            }

        }
        return  bicycleTypeCount;
    }

}
