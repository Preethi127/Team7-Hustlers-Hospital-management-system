
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
        
        for (int i = 1; i <= floors; i++)
        {
         
          System.out.print("How many rooms are on floor " + i + " : ");
          
     
          if (userInput.hasNextInt())
          {
            rooms = userInput.nextInt();
           
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
          
          
          System.out.print("How many of these rooms are occupied: ");
          
         
          if (userInput.hasNextInt())
          {
            occupied = userInput.nextInt();
            
          
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
          
          totalOccupied += occupied;
        }
        
        System.out.println("\nTotal number of rooms: " + totalRooms);
        System.out.println("Total number of occupied rooms: " + totalOccupied);
        System.out.println("Total number of unoccupied rooms: " + (totalRooms - totalOccupied));
        System.out.println("The hotel's occupancy rate is: " + (((double)totalOccupied / (double)totalRooms) * 100) + "%\n");

        
     }
     }


