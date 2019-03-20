package bicycles;

import java.util.ArrayList;
import java.util.List;

public class FunRide {



    private int BicycleTypeCount;
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
        System.out.println(myList.size());
        return myList.size();
    }



    public int getCountForType(BicycleType bicycleType){
       System.out.println(this.myList);
        for(Bicycle bicycle:myList){
         System.out.println(bicycle.getBicycleType());
            if (bicycle.getBicycleType() == bicycleType ) {
                BicycleTypeCount++;
            }

        }

        return  BicycleTypeCount;
    }

}
