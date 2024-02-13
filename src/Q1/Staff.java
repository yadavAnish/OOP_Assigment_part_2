package Q1;
public class Staff extends Employee{

    String title;

    public Staff(String name, String address, String phone_number, String email, String office, double salary, MyDate date_hired, String title) {
        super(name, address, phone_number, email, office, salary, date_hired);
        this.title = title;
    }

    // Method to calculate earning (implemented differently for FullTime and PartTime)
    public double earning() {
        return salary;
    }
}
