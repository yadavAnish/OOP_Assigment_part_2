package Q3;

public class Main {
        public static void main(String[] args) {
            // Creating customers
            Customer premiumCustomer = new Customer("Alice", "Premium");
            Customer goldCustomer = new Customer("Bob", "Gold");
            Customer silverCustomer = new Customer("Charlie", "Silver");
            Customer nonMember = new Customer("David", "None");

            // Creating visits with product and service amounts
            Visit visit1 = new Visit(premiumCustomer, 200, 300);
            Visit visit2 = new Visit(goldCustomer, 150, 250);
            Visit visit3 = new Visit(silverCustomer, 100, 200);
            Visit visit4 = new Visit(nonMember, 100, 200);

            // Displaying total bill for each visit
            System.out.println("Total bill for " + premiumCustomer.getName() + ": $" + visit1.getTotalBill());
            System.out.println("Total bill for " + goldCustomer.getName() + ": $" + visit2.getTotalBill());
            System.out.println("Total bill for " + silverCustomer.getName() + ": $" + visit3.getTotalBill());
            System.out.println("Total bill for " + nonMember.getName() + ": $" + visit4.getTotalBill());
        }
}
