package Lesson2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MyIntegerArrayList myIntegerArrayList = new MyIntegerArrayList();

        myIntegerArrayList.add(0);
        myIntegerArrayList.add(1);
        myIntegerArrayList.add(2);
        myIntegerArrayList.add(3);
        myIntegerArrayList.add(4);
        myIntegerArrayList.add(5);
        myIntegerArrayList.add(6);
        myIntegerArrayList.add(7);
        myIntegerArrayList.add(8);
        myIntegerArrayList.add(9);
        myIntegerArrayList.add(10);

        myIntegerArrayList.set(3,0);
        myIntegerArrayList.remove(9);
        myIntegerArrayList.show();


        MyLinkedList<String> myLinkedListString = new MyLinkedList<>();
        myLinkedListString.addElementAtLast("test");
        myLinkedListString.addElementAtFirst("ertertetrert");

        System.out.println(myLinkedListString.size());
        System.out.println(myLinkedListString.getElementByIndex(0));





     }
}
