import models.Customer;
import models.StoreFIFO;
import models.StorePriorityQueue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StoreQueueTest {
    @Test
    public void testFIFOQueue(){
        StoreFIFO fifoQueue= new StoreFIFO();
        Customer customer1 = new Customer("C001", 5);
        Customer customer2= new Customer("C002",10);

        fifoQueue.addCustomer(customer1);
        fifoQueue.addCustomer(customer2);

        assertEquals(customer1, fifoQueue.processNextCustomer());
        assertEquals(customer2, fifoQueue.processNextCustomer());
        assertTrue(fifoQueue.isEmpty());
    }
    @Test
    public void testPriorityQueue(){
        StorePriorityQueue priorityQueue= new StorePriorityQueue();
        Customer customer1 = new Customer("C001", 5);
        Customer customer2 = new Customer("C002", 10);
        Customer customer3 = new Customer("C003", 2);

        priorityQueue.addCustomer(customer1);
        priorityQueue.addCustomer(customer2);
        priorityQueue.addCustomer(customer3);

        assertEquals(customer2,priorityQueue.processNextCustomer());
        assertEquals(customer1, priorityQueue.processNextCustomer());
        assertEquals(customer3, priorityQueue.processNextCustomer());
        assertTrue(priorityQueue.isEmpty());

    }
}
