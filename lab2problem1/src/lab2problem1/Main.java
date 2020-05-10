package lab2problem1;


public class Main {
	 private static String createSubject(String title,
		        int number, String description, String department
		        )
		    {
		        Title TITLE = new Title(title);
		        Number _number = new Number(number);
		        Description DESCRIPTION = new Description(description);
		        Department DEPARTMENT = new Department(department);
		        

		        return String.format("%-15s %-15s %-15s %-15s ",
		                             TITLE, _number, DESCRIPTION, DEPARTMENT);
		    }
		        public static void main(String[] args)
		    {
		        
		        String[] people = new String[5];
		        people[0] = createSubject("mathematics", 1, "algebric expressions",
		            "science");
		        people[1] = createSubject("Geography", 2, "map reading", 
		            "social science");
		        people[2] = createSubject("English", 3, "comprehension", 
		            "language");
		        people[3] = createSubject("Economics",4, "trading",
		            "commerce");
		        people[4] = createSubject("computer science", 5, "java applications", 
		            "programming");

		        
		        System.out.println(String.format("%-15s %-15s %-15s %-15s ", "Title", "Number", "Description", "Department"
		                ));
		        for(int i=0;i<5;i++)
		        {
		            System.out.println(people[i]);
		        }
		    }

}
