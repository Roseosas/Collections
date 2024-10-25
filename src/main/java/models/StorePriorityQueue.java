package models;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StorePriorityQueue {
    private PriorityQueue<Customer> customerQueue;

    public StorePriorityQueue(){
        customerQueue= new PriorityQueue<>(new Comparator<Customer>() {
            @Override
            public int compare(Customer c1, Customer c2) {
                return Integer.compare(c2.getNumOfItems(), c1.getNumOfItems());
            }
        });
    }

    public  void addCustomer(Customer customer){
        customerQueue.offer(customer);
        System.out.println("Customer "+ customer.getCustomerId()+ " added to priority queue." );
    }
    public Customer processNextCustomer(){
        Customer customer= customerQueue.poll();
        if (customer != null){
            System.out.println("Processing Customer "+ customer.getCustomerId()+ " with "+ customer.getNumOfItems()+ " items");
        }else {
            System.out.println("No Customer in queue.");
        }
        return customer;
    }
    public boolean isEmpty(){
        return customerQueue.isEmpty();
    }

}
