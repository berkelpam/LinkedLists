package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    Customer customer = new Customer("tim",54.23d);
    Customer anotherCustomer;
    anotherCustomer=customer;
    anotherCustomer.setBalance(12.2d);
        System.out.println("Balance for customer:"+customer.getName()+" and balance of: " +customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(2);
        intList.add(3);

        for (int i = 0; i <intList.size(); i++) {
            System.out.println(i+":"+intList.get(i));
            
        }

        intList.add(1,9);

        for (int i = 0; i <intList.size(); i++) {
            System.out.println(i+":"+intList.get(i));

        }



    }


}
