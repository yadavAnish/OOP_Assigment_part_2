package Q1;
public class Employee extends Person {

    String office;
    double salary;
    MyDate date_hired;

    public Employee(String name, String address, String phone_number, String email, String office, double salary, MyDate date_hired) {
        super(name, address, phone_number, email);
        this.office = office;
        this.salary = salary;
        this.date_hired = date_hired;
    }
}
