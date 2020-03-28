package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem5.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String args[]) {
        MyPriorityQueue obj = new MyPriorityQueue();
        obj.insert("Yash",60);
        obj.insert("Mohit",39);
        obj.insert("Muskan",10);
        obj.insert("Aishwarya",8);
        obj.insert("Uddeshya",20);
        System.out.println("Students according to their roll number are: ");
        obj.peep();
    }
}
