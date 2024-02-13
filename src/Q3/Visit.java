package Q3;

public class Visit {
    private Customer customer;
    private double productsAmount;
    private double servicesAmount;

    public Visit(Customer customer, double productsAmount, double servicesAmount) {
        this.customer = customer;
        this.productsAmount = productsAmount;
        this.servicesAmount = servicesAmount;
    }

    public double getTotalBill() {
        double serviceDiscount = Discount.getServiceDiscount(customer.getMembership());
        double productDiscount = Discount.getProductDiscount();

        double serviceBill = servicesAmount * (1 - serviceDiscount);
        double productBill = productsAmount * (1 - productDiscount);

        return serviceBill + productBill;
    }

    }
