package lab1problem2;

public class Main
{
    public static void main (String[] args)
    {   
        Doctor doctor = new Doctor ("Alex", "San Fransisco", 
        	"6648941531", 33007, 67, "2 july");
        Surgeon surgeon = new Surgeon("George", "Chicago",
        	"5698561578", 33007, 67, "2 july");
        Administrator admin = new Administrator("Nick" ,
        	"New York", "9554415155", 33009);
        doctor.print();
        System.out.println("----------");
        surgeon.print();
        System.out.println("----------");
        admin.orderEquipment();
        System.out.println("----------");
        surgeon.operate();
        System.out.println("----------");
       
    }
}