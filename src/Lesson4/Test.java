package Lesson4;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        MyLinckedList myLinckedList = new MyLinckedList();
        myLinckedList.add(1);
        myLinckedList.add(2);
        myLinckedList.add(3);
        myLinckedList.add(4);

        System.out.println(myLinckedList);
        System.out.println(myLinckedList.get(0));
        System.out.println(myLinckedList.get(1));
        System.out.println(myLinckedList.get(2));
        System.out.println(myLinckedList.get(3));

        myLinckedList.remove(1);
        System.out.println(myLinckedList);

    }

}
