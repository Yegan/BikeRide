package bicycles;

import java.util.ArrayList;
import java.util.List;

public class FunRide {


    //  private int[]array;

    private int BicycleTypeCount;
   // private int bicycleTypeCount;
    private int maxNumberOfBikes;
    private List<Bicycle> myList = new ArrayList<Bicycle>();
  //  private bikesList[Bicycle bicycle] = new ArrayList[]bicycle;
  //  private BicycleType bicycleType;
   // private Bicycle bicycle;
    //  private Bicycle bicycle;

    public FunRide(int numberOfBikes){
    this.maxNumberOfBikes = numberOfBikes;
   // this.bicycleType = bicycleType;

    }

    public void accept(Bicycle bicycle) {
        //this.numberOfBikes = numberOfBikes;
        //   this.bicycleType = bicycleType;
        //compare maxNoOfBike < myList.size()
   //     this.bicycle = bicycle;
        if (this.maxNumberOfBikes > myList.size()) {
        myList.add(bicycle);
       //     System.out.println(myList);
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
    //    System.out.println(bicycle.getBicycleType());
        for(Bicycle bicycle:myList){
         System.out.println(bicycle.getBicycleType());
            if (bicycle.getBicycleType() == bicycleType ) {
              //  System.out.println(bicycleType);
               // System.out.println(bicycle.getBicycleType());
                BicycleTypeCount++;
            }

        }

        //  BicycleType bicycleType = this.bicycleType;
       // Bicycle bicycle = this.bicycle;
//     for (int x = 0; x < this.myList.size() ; x++ ){
        //  this.myList.contains(bicycleType);
       //   System.out.println(this.myList.indexOf(bicycleType));
        // this.myList.contains(bicycle);
      //   System.out.println(this.myList.contains(bicycle));
     //    System.out.println(bicycle);
     //    System.out.println(bicycleType);
//         Bicycle bicycle  =  new Bicycle(this.myList.contains(bicycle)) ;
//         if( == bicycleType){
//                bicycleTypeCount++;
//
//           }

//     }
        return  BicycleTypeCount;
    }

}
