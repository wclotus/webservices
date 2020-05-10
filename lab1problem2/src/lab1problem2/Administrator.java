package lab1problem2;

public class Administrator extends Employee
{

	public Administrator(String name, String address, String phone, 
		int employee_number)
    {
        super(name, address, phone, employee_number);
    }



    public void orderEquipment()
    {
    	System.out.println("Equipment ordered!");
    }
}