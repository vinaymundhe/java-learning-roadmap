package beginner.miniprojects;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Write a backend code for Lift system.
There are two lifts in the society with 22 floors.
Should fetch the nearest lift for users at any floor.
*/
public class LiftSystem {
    public static void main(String[] args) {

        boolean liftBeingUsed = false;
        int liftA = 0;
        int liftB = 0;

        do {
            Scanner floorScanner = new Scanner(System.in);
            System.out.println("Enter floor No: ");
            try {
                int userFloor = floorScanner.nextInt();

                int distA = Math.abs(liftA - userFloor);
                int distB = Math.abs(liftB - userFloor);

                if (distA < distB) {
                    liftA = userFloor;
                    System.out.println("Lift A arriving at the floor " + liftA);
                } else if (distB < distA) {
                    liftB = userFloor;
                    System.out.println("Lift B arriving at the floor " + liftB);
                } else {
                    liftA = userFloor;
                    System.out.println("lift A arriving at the floor " + liftA);
                }

                System.out.println("Want to use the lift? (Y/N)?");
                String usingLift = floorScanner.next();

                if (usingLift.equalsIgnoreCase("Y")) {
                    liftBeingUsed = true;
                } else {
                    liftBeingUsed = false;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("--Please enter valid Floor Number--");
            }
        } while (liftBeingUsed);
    }
}
