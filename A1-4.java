public class Customer {
    private String name;
    private String contact;
    private String deliveryAddress;
    private boolean active;
    
    // constructors, getters and setters
}

public class Order {
    private Date createDate;
    private String status;
    private List<OrderDetail> orderDetails;
    private Customer customer;
    private List<Payment> payments;
    
    // constructors, getters and setters
}

public class OrderDetail {
    private int quantity;
    private Product product;
    
    // constructors, getters and setters
    public double calculateSubTotal() {
        return quantity * product.getPriceForQuantity();
    }
    
    public double calculateWeight() {
        return quantity * product.getWeight();
    }
}

public class Payment {
    private double amount;
    private Order order;
    
    // constructors, getters and setters
}

public class CreditCard extends Payment {
    private String number;
    private String type;
    private Date expireDate;
    
    // constructors, getters and setters
}

public class Product {
    private String title;
    private double weight;
    private String description;
    
    // constructors, getters and setters
    public double getPriceForQuantity() {
        // calculation for price based on quantity
    }
    
    public double getWeight() {
        return weight;
    }
}
