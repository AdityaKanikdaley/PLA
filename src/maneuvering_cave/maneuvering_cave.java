package maneuvering_cave;

// Q:)
// a robot wants to move through a cave on MxN matrix from (0,0) to (M-1,N-1).
// it can move only right or down. Calculate the total number of ways the robot can reach the destination.

public class maneuvering_cave {
    public static void main(String[] args) {
        int dimensionX = 5;
        int dimensionY = 5;
        System.out.println(maneuver(0, 0, dimensionX, dimensionY));
    }

     static int maneuver(int currX, int currY, int dimensionX, int dimensionY) {

        if(currX == dimensionX -1 && currY == dimensionY -1)
            return 1; // at destination

        if(currX >= dimensionX || currY >= dimensionY)
            return 0; // out of boundary

        return maneuver(currX, currY+1, dimensionX, dimensionY) +
               maneuver(currX+1, currY, dimensionX, dimensionY);
    }
}
