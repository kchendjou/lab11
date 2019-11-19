package edu.cscc;
// kyria mba chendjou Lab11 Nov12 purpose:
public class Node<T> {
    private T content;
    private Node next;

    public Node(T content, Node next) {
        this.content = content;
        this.next = next;
    }
//getter
    public T getContent() {
        return content;
    }
//setter
    public void setContent(T content) {
        this.content = content;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
