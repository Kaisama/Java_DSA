package dsa.linkedlist.assignment1;

import java.util.LinkedList;

public class LeetCodeQues707DesignLinkedList {
	private static LinkedList<Integer> list ;
    public LeetCodeQues707DesignLinkedList() {
         list = new LinkedList<>();
    }
    
    public int get(int index) {
        if(index>=list.size()) return -1;
        return list.get(index);
    }
    
    public void addAtHead(int val) {
        list.addFirst(val);
    }
    
    public void addAtTail(int val) {
        list.addLast(val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index<list.size()) list.add(index,val);
        else if(index==list.size()) addAtTail(val);
    }
    
    public void deleteAtIndex(int index) {
        if(index<list.size()) list.remove(index);
    }
}
