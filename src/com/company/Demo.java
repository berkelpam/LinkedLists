package com.company;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by pauljava on 08/08/2017.
 */
public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit=new LinkedList<String>();

        placesToVisit.add("Sidney");
        placesToVisit.add("Meldourne");
        placesToVisit.add("Perth");
        placesToVisit.add("Darmwin");

        printList(placesToVisit);

        placesToVisit.add(1,"Alice Springs");

        printList(placesToVisit);
        placesToVisit.remove(3);
        printList(placesToVisit);


    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i=linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("======================");
    }

    private static boolean addInOrder (LinkedList<String> linkedList,String newCity){
        ListIterator<String> StringListIterator = linkedList.listIterator();

        while(StringListIterator.hasNext()){
            int comparison = StringListIterator.next().compareTo(newCity);

            if (comparison==0){
                //do not add
                System.out.println("City is already added as destionation");
                return false;
            }
            else if (comparison>0){
                //new city should before this one
                StringListIterator.previous();
                StringListIterator.add(newCity);
                return true;
            }
            else if(comparison<0){
                // move on to the next city
            }

            }
        StringListIterator.add(newCity);
        }

    }

    }

