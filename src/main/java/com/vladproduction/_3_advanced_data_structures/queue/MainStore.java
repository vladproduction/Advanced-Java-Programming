package com.vladproduction._3_advanced_data_structures.queue;

import java.util.LinkedList;
import java.util.List;

public class MainStore {
    public static void main(String[] args) {

        LinkedList<Customer> queue = new LinkedList<>();
        queue.add(new Customer("Sally"));
        queue.add(new Customer("Ben"));
        queue.add(new Customer("Emma"));
        queue.add(new Customer("Fred"));
        System.out.println(queue); //[Sally, Ben, Emma, Fred]

        //queue is active by this method
        serveCustomer(queue);

        //print queue again
        System.out.println(queue);
        //output:
        /*  Sally has been served
            [Ben, Emma, Fred]*/

    }

    /**
     *
     * */
    static void serveCustomer(LinkedList<Customer> customers){
        Customer customer = customers.poll();//Retrieves and removes the head (first element) of this list.
        assert customer != null;
        customer.serve();
    }

}
