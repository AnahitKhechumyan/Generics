package com.company.collections.collectionsUtil;

public  class Node<T> {
    private T info;
    private Node<T> prev;
    private Node<T> next;

    public Node(T info, Node<T> prev, Node<T> next) {
        this.info = info;
        this.prev = prev;
        this.next = next;
    }
    public T getInfo() {
        return info;
    }
    public void setInfo(T info) {
        this.info = info;
    }
    public Node<T> getPrev() {
        return prev;
    }
    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }
    public Node<T> getNext() {
        return next;
    }
    public void setNext(Node<T> next) {
        this.next = next;
    }
    @Override
    public String toString() {
        return "Node<T>{" +
                "info=" + info +
                '}';
    }
}