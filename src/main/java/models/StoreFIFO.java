package models;

import java.util.LinkedList;
import java.util.Queue;

public class StoreFIFO {
    private Queue<Customer> customerQueue;

    public StoreFIFO(){
    customerQueue= new LinkedList<>();
    }

    public void addCustomer(Customer customer){
        customerQueue.offer(customer);
        System.out.println("Customer " + customer.getCustomerId() + " added to queue.");
    }
    public Customer processNextCustomer(){
        Customer customer= customerQueue.poll();
        if (customer != null){
            System.out.println("Processing Customer " + customer.getCustomerId());
        } else {
            System.out.println("No customer in queue.");
        }
        return customer;
    }
    public boolean isEmpty(){
        return customerQueue.isEmpty();
    }
}
