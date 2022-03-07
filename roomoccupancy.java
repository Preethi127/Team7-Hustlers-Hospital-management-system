
import java.util.Scanner;
 
 public class roomoccupancy
 {
     public static void main(String[] args)
     {
        @SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
        int floors = 0, rooms = 0, totalRooms = 0, occupied = 0, totalOccupied = 0;
        System.out.print("How many floors does the hospital have: ");
        if (userInput.hasNextInt())
        {
          floors = userInput.nextInt();
           // make sure the number is greater than or equal to 1
          if (floors < 1)
          {
            System.out.println("\nThere must be at least 1 floor!\n");
            System.exit(1);
          }
        }
        else
        {
          System.out.println("I said enter a number!! What the heck??");
          System.exit(1);
        }
        
        // run a loop to get the room info for each floor
        for (int i = 1; i <= floors; i++)
        {
          // ask the user for the number of rooms on this floor
          System.out.print("How many rooms are on floor " + i + " : ");
          
          // make sure the user entered a number and it wasn't less than ten
          if (userInput.hasNextInt())
          {
            rooms = userInput.nextInt();
            
            // make sure the number is greater than or equal to 10
            if (rooms < 5)
            {
              System.out.println("There must be at least 5 rooms per floor.");
              System.exit(1);
            }
          }
          else
          {
            System.out.println("You must enter a number.");
            System.exit(1);
          }
          
          // if we didn't error out on the user's input then run loop calculations
          totalRooms += rooms;
          
          // ask the user for the number of occupied rooms
          System.out.print("How many of these rooms are occupied: ");
          
          // make sure the user entered a number less than the number of rooms on this floor
          if (userInput.hasNextInt())
          {
            occupied = userInput.nextInt();
            
            // make sure the number is not greater than the number of rooms on this floor
            if (occupied > rooms)
            {
              System.out.println("There cannot be more occupied rooms than the total number of rooms on this floor!");
              System.exit(1);
            }
          }
          else
          {
            System.out.println("You must enter a number.");
            System.exit(1);
          }
          
          // if we didn't error out on the user's input then finish loop calculations
          totalOccupied += occupied;
        }
        // finally we can print out the summary of our hospital's occupancy
        System.out.println("\nTotal number of rooms: " + totalRooms);
        System.out.println("Total number of occupied rooms: " + totalOccupied);
        System.out.println("Total number of unoccupied rooms: " + (totalRooms - totalOccupied));
        System.out.println("The hotel's occupancy rate is: " + (((double)totalOccupied / (double)totalRooms) * 100) + "%\n");

        
     }
     }


