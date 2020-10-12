/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barry
 */
public class Queue {
    private final int Size = 20;
    private int[] queArray;
    private int front;
    private int rear;
    
    public Queue() {
        queArray = new int[Size];
        front = 0;
        rear = -1;
    }
    
    public void insert(int j) {
        if(rear == Size -1) {
            rear = -1;
        }
        queArray[++rear] = j;
    }
    public int remove() {
        int temp = queArray[front++];
        if(front == Size) {
            front = 0;
        }
        return temp;
    }
    public boolean isEmpty() {
        return ( rear+1 ==front || (front + Size == rear));
    }
    
}
