package problem1.main;


import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String args[]) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        obj.insert(25);
        obj.insert(15);
        obj.insert(22);
        obj.insert(11);
        obj.insert(23);
        obj.insert(8);
        obj.insert(40);
        obj.insert(49);
        System.out.print("Left Child nodes are: ");
        obj.printLeftNode(obj.root);
        System.out.println();
        System.out.println("No of nodes that dosn't have a left child node are: "+ obj.getCount());
    }
}