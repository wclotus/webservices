package lab1problem3;

public class Main
{
    private static String createPerson(String firstName,
        String lastName, int age, String occupation, String country,
        double salary)
    {
        Name name = new Name(firstName, lastName);
        Age _age = new Age(age);
        Occupation job = new Occupation(occupation);
        Nationality nation = new Nationality(country);
        Income income = new Income(salary);

        return String.format("%-15s %-15s %-15s %-15s %-15s",
                             name, _age, job, nation,income);
    }
        public static void main(String[] args)
    {
        
        String[] people = new String[5];
        people[0] = createPerson("thuso", "phala", 25, "scientist",
            "U.S.A", 21000);
        people[1] = createPerson("bill", "gates", 48, "programmer", 
            "Germany", 250000);
        people[2] = createPerson("kasia", "Ivanko", 19, "Manager", 
            "Ukraine", 600000);
        people[3] = createPerson("Roy", "Moyo", 39, "Investor",
            "South Africa", 8000000);
        people[4] = createPerson("Sean", "Ndlovu", 20, "Doctor", 
            "Poland", 100000);

        
        System.out.println(String.format("%-15s %-15s %-15s %-15s %-15s", "Name", "Age", "Occupation", "Country",
                "Income"));
        for(int i=0;i<5;i++)
        {
            System.out.println(people[i]);
        }
    }
}
