import java.util.*;

import java.util.Scanner;

public class doctorlist
{
    String doc_id, doc_name, specialist, appoint, doc_qual;
    int doc_room;
    void new_doctor()
    {
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        doc_id = input.nextLine();
        System.out.print("name:-");
        doc_name = input.nextLine();
        System.out.print("specilization:-");
        specialist = input.nextLine();
        System.out.print("work time:-");
        appoint = input.nextLine();
        System.out.print("qualification:-");
        doc_qual = input.nextLine();
        System.out.print("room no.:-");
        doc_room = input.nextInt();
    }
    void doctor_info()
    {
        System.out.println(doc_id + "\t" + doc_name + "  \t" + specialist + "     \t" + appoint + "    \t" + doc_qual + "       \t" + doc_room);
    }
}

public class HospitalManagementSystem
{
    public static void main(String args[])
    {
       
        int count1 = 3;
       
        doctorlist[] d = new doctorlist[25];
       
        int i;
        for (i = 0; i < 25; i++)
            d[i] = new doctorlist();
            
         d[0].doc_id = "21";
        d[0].doc_name = "Dr.Ahi";
        d[0].specialist = "ENT";
        d[0].appoint = "5-11AM";
        d[0].doc_qual = "MBBS,MD";
        d[0].doc_room =   17;
        d[1].doc_id = "32";
        d[1].doc_name = "Dr.Anjana";
        d[1].specialist = "Physician";
        d[1].appoint = "10AM-3PM";
        d[1].doc_qual = "MBBS,MD";
        d[1].doc_room =  45;
        d[2].doc_id = "17";
        d[2].doc_name = "Dr.Rekha";
        d[2].specialist = "Surgeon";
        d[2].appoint = "8AM-2AM";
        d[2].doc_qual = "BDM";
        d[2].doc_room =   8;
        
         @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        int choice, j, c1, status = 1, s1 = 1;
         while (status == 1)
        {
            System.out.println("\n                                    MAIN MENU");
             System.out.println("-----------------------------------------------------------------------------------");
             System.out.println("1.Doctors ");
             System.out.println("-----------------------------------------------------------------------------------");
            choice = input.nextInt();
       
            switch (choice)
            {
                case 1:
                    {
                       System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                      *DOCTOR SECTION*");
                        System.out.println("--------------------------------------------------------------------------------");
                        s1 = 1;
                        while (s1 == 1)
                        {
                            System.out.println("1.Add New Entry\n2.Existing Doctors List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        d[count1].new_doctor();
                                        count1++;
                                        break;
                                    }
                                case 2:
                                    {
                            
                                        System.out.println("id \t Name\t      Specialist \t Timing\t    Qualification\tRoom No.");
                                        
                                        for (j = 0; j < count1; j++)
                                        {
                                            d[j].doctor_info();
                                        }
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s1 = input.nextInt();
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
