import java.util.Date;

public class MainSecond {
    public static void main(String[] args) {
        HotelFacade hotelFacade = new HotelFacade();
        hotelFacade.BookRoom(new Date(), new Date(), 3, 101);

        Department department = new Department();
        department.name = "DBU";

        Employee john = new Employee("John", 5000);
        Employee jane = new Employee("Jane", 6000);
        Employee jack = new Employee("Jack", 5500);
        department.Add(john);
        department.Add(jane);
        department.Add(jack);

        Department department1 = new Department();
        department1.name = "Development";
        Employee doe = new Employee("Doe", 7000);
        Employee docl = new Employee("Docl", 6500);
        department1.Add(doe);
        department1.Add(docl);

        Department department2 = new Department();
        department2.name = "Research";
        department2.Add(department);
        department2.Add(department1);

        System.out.println("Total Salary in Research Department: " + department2.GetSalary());
        System.out.println("Total Employee Count in Research Department: " + department2.GetCount());
    }
}
