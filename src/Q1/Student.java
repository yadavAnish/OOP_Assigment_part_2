package Q1;
public class Student extends Person{

    Status status;

    public Student(String name, String address, String phone_number, String email, Status status) {
        super(name, address, phone_number, email);
        this.status = status;
    }
}
