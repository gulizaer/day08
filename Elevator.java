public class Elevator {
    public static void main(String[] args) {

  /*
       1. Create a class called Elevator. A variable named floorNumber is given,
           write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cydeo, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"

			anything else: print "Invalid floor - 6"
 */
        int floorNum = 2;


    /*
    if (floorNum >=1 && floorNum <= 3) {

        if (floorNum == 1){
            System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");}

        else if(floorNum == 2) {
            System.out.println("Floor 2 selected. Companies: Cydeo, NASA, Intelsat");}

        else {
            System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");}


    }
    else {System.out.println("Invalid floor");}
    */

        String result = "Invalid floor";

        if (floorNum >= 1 && floorNum <= 3) {
            result = "Floor " + floorNum + "is selected. Companies: ";

            if (floorNum == 1) {
                result += "Lobby, Verizon, Starbucks";
            } else if (floorNum == 2) {
                result += "Cydeo, NASA, Intelsat";
            } else {
                result += "Lyft, Bofa, Stake house";
            }


        }
        System.out.println(result);
    }
    }
