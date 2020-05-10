package lab1problem2;

public class Receptionist extends Administrator
{

    public Receptionist(String name, String address, String phone, 
    	int employee_number)
    {
        super(name, address, phone, employee_number);
    }


    public void answerPhone()
    {
        System.out.println("Hello How can I be of assisstance to you :) ");
    }
}
