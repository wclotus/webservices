package lab1problem2;

public class Janitor extends Employee
{


    public Janitor(String name, String address, String phone, 
    	int employee_number)
    {
        super(name, address, phone, employee_number);
    }


    public void clean()
    {
        System.out.println("cleaning...");
    }
}
