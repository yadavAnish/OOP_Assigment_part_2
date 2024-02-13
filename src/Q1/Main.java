package Q1;
public class Main {
    public static void main(String[] args) {


        Student student = new Student("John Doe", "123 Main St", "555-1234", "john@example.com", Status.FRESHMAN);
        System.out.println(student);

        Faculty faculty = new Faculty("Jane Smith", "456 Elm St", "555-5678", "jane@example.com", "Office 101", 60000, new MyDate(2023, 9, 1), "9am-5pm", "Professor");
        System.out.println(faculty);

        Staff staff = new Staff("Bob Johnson", "789 Oak St", "555-9012", "bob@example.com", "Office 201", 40000, new MyDate(2022, 6, 15), "Secretary");
        System.out.println(staff);

        FullTime fullTime = new FullTime("Alice Lee", "246 Pine St", "555-3456", "alice@example.com", "Office 301", 50000, new MyDate(2022, 3, 10), "Manager");
        System.out.println(fullTime);

        PartTime partTime = new PartTime("Charlie Brown", "135 Maple St", "555-6789", "charlie@example.com", "Office 401", 20, new MyDate(2022, 8, 20), "Assistant", 20);
        System.out.println(partTime);

        System.out.println("Earnings for Part-Time Staff: " + partTime.earning());
    }
}