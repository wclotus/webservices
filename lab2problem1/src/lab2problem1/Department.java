package lab2problem1;

public class Department {
	 private String department;

	    public Department(String department)
	    {
	        this.department = department;
	    }

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}
		
		 public String toString()
		    {
		        return this.department;
		    }


}
