package java1702.javase.collection;

/**
 * Created by 高伟冬 on 2017/4/11.
 * javaSE_2
 * 10:37
 * 星期二
 */
public class MyLinkedList {

    private Node first;
    private Node last;

    public MyLinkedList() {
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("a");
        myLinkedList.add("b");
        myLinkedList.add("c");
        System.out.println(myLinkedList.first());
        System.out.println(myLinkedList.last());
        System.out.println(myLinkedList.get(1));
    }


    public String get(int index) {
        // TODO: 4/11/17
        return null;
    }

    public boolean add(String element) {
        if (first == null) {
            Node node = new Node(element, null, null);
            first = node;
            last = node;
        } else {
            Node node = new Node(element, last, null);
            last.next = node;
            last = node;
        }
        return true;
    }

    public String first() {
        return first.element;
    }

    public String last() {
        return last.element;
    }

    private class Node {
        String element;
        Node prev;
        Node next;

        public Node(String element, Node prev, Node next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }
}

//一脸懵笔！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！