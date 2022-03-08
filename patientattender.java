import java.util.*;

class patientAttender
{
    String pa_id, pa_name;
    int roomnumber;
    void new_patientAttender()
    {
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        pa_id = input.nextLine();
        System.out.print("name:-");
        pa_name = input.nextLine();
        System.out.print("roomnumber:-");
        roomnumber= input.nextInt();
        
     
    }
    void patientAttender_info()
    {
        System.out.println(pa_id + "\t" + pa_name + " \t" + roomnumber);
    }
}

public class Main
{
    public static void main(String args[])
    {
       
        int count2=3;
       
    
        patientAttender[] pa = new patientAttender[100];
    
       
        int i;
        for (i = 0; i < 100; i++)
            pa[i] = new patientAttender();
             pa[0].pa_id = "12";
        pa[0].pa_name = "Pankaj";
        pa[0].roomnumber=21;
        pa[1].pa_id = "13";
        pa[1].pa_name = "Sumit";
        pa[1].roomnumber = 90;
        pa[2].pa_id = "14";
        pa[2].pa_name = "Alok";
        pa[2].roomnumber = 11;
        
         
         @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        int choice, j, c1, status = 1, s1 = 1, s2 = 1, s4=1;
         while (status == 1)
        {
        	 System.out.println("\n                                    MAIN MENU");
             System.out.println("-----------------------------------------------------------------------------------");
             System.out.println("1.Patient attender details");
             System.out.println("-----------------------------------------------------------------------------------");
            choice = input.nextInt();
       
            switch (choice)
            {
            
            case 1:
               {
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("                     *PATIENT ATTENDER DETAILS*");
                System.out.println("--------------------------------------------------------------------------------");
                s2 = 1;
                while (s2 == 1)
                {
                    System.out.println("1.Add New Entry\n2.Existing  List");
                    c1 = input.nextInt();
                    switch (c1)
                    {
                        case 1:
                            {
                                pa[count2].new_patientAttender();count2++;
                                break;
                            }
                        case 2:
                            {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("id \t Name \t  roomnumber");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count2; j++) {
                                    pa[j].patientAttender_info();
                                }
                                break;
                            }
                    }
                    System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                    s2 = input.nextInt();
                }
                break;
            }
            
              default:
                    {
                        System.out.println(" You Have Enter Wrong Choice!!!");
                    }
            }
            System.out.println("\nReturn to MAIN MENU Press 1");
            status = input.nextInt();
        }
    }
}