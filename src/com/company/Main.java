package com.company;

import static javax.swing.UIManager.get;

public class Main {
        public static void main(String args[]) {

                BinaryTree<Integer> tree = new BinaryTree<>();
                tree.insert(5);
                tree.insert(3);
                tree.insert(2);
                tree.insert(4);
                tree.insert(9);
                tree.insert(7);
                tree.insert(6);
                tree.insert(8);
                tree.insert(12);
                tree.insert(10);
                tree.insert(13);

                System.out.println(tree);
                int n = tree.getSize();
                //System.out.println(tree.height());
                System.out.println(tree.findDepthRec(tree.root));


        }


}
       /* List<Integer> list = new List<>();

        list.push(5);
        list.push(8);
        list.push(83);
        list.remove(1);

        System.out.println(list);
        System.out.println(list.getFirst().getInfo());
        System.out.println(list.getLast());

        Stack<Integer> order = new Stack();

       // List<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(5);
        list.add(5);
        for(int i = 0; i < list.size(); i++){
            System.out.println(get(i));
        }
       order.push(5);
        order.push(15);
        order.push(8);//2
       order.push(0);
        order.push(7);
        order.remove(1);
        order.insertElementAt(0,1);
        System.out.println(order.get(3));
        System.out.println(order.pop());
        System.out.println(order.size());
       System.out.println(order);
        System.out.println();
       // System.out.println(order.isEmpty());

       // List<Integer> list = new List<>();
       //list.push(-1,7);
        list.push(4,7);

        list.push(5);
        list.push(5);
        list.push(5);
       // list.push(10,-1);
        list.push(1,4);
        System.out.println(list);*/


