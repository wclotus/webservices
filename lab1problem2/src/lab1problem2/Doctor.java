package lab1problem2;

public class Doctor extends Employee
{
  
    public Doctor(String name, String address, String phone, 
        int employee_number, int permit_number, String permit_expiry_date)
    {
        super(name, address, phone, employee_number);
    }


    public void prescribeDrug()
    {
        System.out.println("Take these drugs on time and visit again when needed");
    }

 
}