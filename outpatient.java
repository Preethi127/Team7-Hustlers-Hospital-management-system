import java.util.*;
import java.util.Scanner;
 class hi
{
public static void main(String[]args)
{
outPatient ob=new outPatient();  
ob.listOfPatientsarrived();          
ob.feesAmount();
ob.AdditionalfeesAmount();
outPatient ob1=new outPatient();  
ob1.listOfPatientsarrived();          
ob1.feesAmount();
ob1.AdditionalfeesAmount();
outPatient ob2=new outPatient();  
ob2.listOfPatientsarrived();          
ob2.feesAmount();
ob2.AdditionalfeesAmount();
}
}
class outPatient
{
void listOfPatientsarrived()
{
Scanner sc=new Scanner(System.in);
System.out.println("*********PATIENT DETAILS********");
System.out.println("Enter the patient Name:");
String Name=sc.nextLine();
System.out.println("Enter the patient gender:");
String gender=sc.nextLine();
System.out.println("Enter the patient Address:");
String address=sc.nextLine();
System.out.println("Enter the patient blood group:");
String bg=sc.nextLine();
System.out.println("Enter the patient Mobile number:");
String Mobileno=sc.nextLine();
System.out.println("Enter the age:");
int age=sc.nextInt();
System.out.println("Enter the patient id:");
int id=sc.nextInt();
}
void feesAmount()
{
Scanner sc=new Scanner(System.in);  
System.out.println("Enter the Consultation(1-First time,2-Second time,....):");
int Consultation=sc.nextInt();
if(Consultation==1)
{
System.out.println("The fees amount is 1000");
}
else
{
System.out.println("The fees amount is 500");
}
}
void AdditionalfeesAmount()
{
Scanner sc=new Scanner(System.in); 
System.out.println("Enter the Additional fees amount:(1->Injection , 2->DayCare , 3->ECG , 4->X-ray)");
int additional=sc.nextInt();
if(additional==1)
{
System.out.println("The additional fees amount is 100"); 
}
else if(additional==2)
{
System.out.println("The additional fees amount is 500");
}
else if(additional==3)
{
System.out.println("The additional fees amount is 1000"); 
}
else if(additional==4)
{
System.out.println("The additional fees amount is 1500"); 
}
}
}
