package models;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StoreFIFO fifoQueue = new StoreFIFO();
        StorePriorityQueue priorityQueue = new StorePriorityQueue();

        Customer customer1 = new Customer("C001", 3);
        Customer customer2 = new Customer("C002", 7);
        Customer customer3 = new Customer("C003", 5);
        Customer customer4 = new Customer("C004", 10);

        System.out.println("Adding customers to FIFO queue:");
        fifoQueue.addCustomer(customer1);
        fifoQueue.addCustomer(customer2);
        fifoQueue.addCustomer(customer3);
        fifoQueue.addCustomer(customer4);

        System.out.println("\nProcessing customers in FIFO queue:");
        while (!fifoQueue.isEmpty()) {
            fifoQueue.processNextCustomer();
        }

        System.out.println("\nAdding customers to Priority queue:");
        priorityQueue.addCustomer(customer1);
        priorityQueue.addCustomer(customer2);
        priorityQueue.addCustomer(customer3);
        priorityQueue.addCustomer(customer4);

        System.out.println("\nProcessing customers in Priority queue:");
        while (!priorityQueue.isEmpty()) {
            priorityQueue.processNextCustomer();
        }
    }

}
