package dsa.recursion.array.assignment3;

import java.util.ArrayList;
// Write a recursive function that takes a list of numbers as an input and return product of all numbers in list
public class ArrayReturnList {
	
	public static ArrayList<Integer> squares(ArrayList<Integer> list, int index, int size) {
		// base case
		if(index >= size) {
			return list;
		}
		squares(list, index+1, size);
		// logic
		int element = list.get(index);
		list.set(index, element*element);
		
		return list;
	}
	
	public static void square(ArrayList<Integer> list, int index, int size) {
		// base case
		if(index >= size) {
			System.out.println(list);;
			return ;
		}
		
		// logic
		int element = list.get(index);
		list.set(index, element*element);
		
		// small problem
		square(list, index+1, size);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		int index =0;
		int size = list.size();
		// stack building
		square(list, index, size);
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		int index1 =0;
		int size1 = list1.size();
		
		// stack falling
		System.out.println(squares(list1, index1, size1));
	}

}
