package edu.cscc;
// kyria mba chendjou Lab11 Nov12 purpose to use java generics
public class Main {

    public static void main(String[] args) {
        list1();
        list2();
    }

    //  list with Strings
    public static void list1() {
        LinkedList <String> llist = new LinkedList<>() ; //change
        llist.addFirst("one");
        llist.addLast("two");
        llist.addLast("three");
        llist.addFirst("zero");
        llist.addLast("xxxx");
        llist.addFirst("yyyyy");
        llist.deleateLast();
        llist.deleteFirst();
        System.out.println(llist);
        llist.deleteFirst();
        llist.deleateLast();
        llist.deleteFirst();
        llist.deleateLast();
        System.out.println(llist);
    }

    //  list with Integers
    public static void list2() {
        LinkedList <Integer> llist = new LinkedList<>(); //change
        llist.addFirst(1);
        llist.addLast(2);
        llist.addLast(3);
        llist.addFirst(0);
        llist.addLast(142);
        llist.addFirst(-97);
        llist.deleateLast();
        llist.deleteFirst();
        System.out.println(llist);
        llist.deleteFirst();
        llist.deleateLast();
        llist.deleteFirst();
        llist.deleateLast();
        System.out.println(llist);
    }
}
