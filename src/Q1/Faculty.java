package Q1;
public class Faculty extends Employee{

    String office_hours;
    String rank;

    public Faculty(String name, String address, String phone_number, String email, String office, double salary, MyDate date_hired, String office_hours, String rank) {
        super(name, address, phone_number, email, office, salary, date_hired);
        this.office_hours = office_hours;
        this.rank = rank;
    }
}
