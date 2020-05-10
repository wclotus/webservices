package lab1problem2;

public class Employee {
	   public String name, address, phone;
	   public int employee_number;


	   public Employee (String name, String address, String phone,
	      int employee_number) 
	   {
	      this.name = name;
	      this.address = address;
	      this.phone = phone;
	      this.employee_number = employee_number;
	   }


	   public void print () {
	      System.out.println("Employee Data:");
	      System.out.println( name);
	      System.out.println(address);
	      System.out.println(phone);
	      System.out.println("Emp.no: "+employee_number);
	   }
	}
