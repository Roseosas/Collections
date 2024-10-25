package models;

public class Customer {
    private String customerId;
    private int numOfItems;

    public Customer(String customerId, int numOfItems){
        this.customerId= customerId;
        this.numOfItems=numOfItems;
    }

    public String getCustomerId() {
        return customerId;
    }

    public int getNumOfItems() {
        return numOfItems;
    }
}
