package Q1;
public class PartTime extends Staff{

    int hours_worked;
    double hourly_rate;

    public PartTime(String name, String address, String phone_number, String email, String office, double hourly_rate, MyDate date_hired, String title, int hours_worked) {
        super(name, address, phone_number, email, office, 0, date_hired, title); // salary initially set to 0
        this.hourly_rate = hourly_rate;
        this.hours_worked = hours_worked;
    }

    // Method to calculate earning (depends on hourly rate and hours worked)
    @Override
    public double earning() {
        return hourly_rate * hours_worked;
    }
}
