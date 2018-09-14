package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] list = (T[]) new Object[0];
	public ArrayList() {
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return list[loc];
	}
	
	public void add(T val) {
		T[]temp = list;
		list=(T[]) new Object[temp.length+1];
		for (int i = 0; i < temp.length; i++) {
			list[i]=temp[i];
		}
		list[temp.length]=val;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[]temp = list;
		list=(T[]) new Object[temp.length+1];
		for (int i = 0; i < loc; i++) {
			list[i]=temp[i];
		}
		list[loc]=val;
		for (int i = loc+1; i < list.length; i++) {
			list[i]=temp[i-1];
		}
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		T[]temp = list;
		list=(T[]) new Object[temp.length];
		for (int i = 0; i < loc; i++) {
			list[i]=temp[i];
		}
		list[loc]=val;
		for (int i = loc+1; i < list.length; i++) {
			list[i]=temp[i];
		}
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[]temp = list;
		list=(T[]) new Object[temp.length-1];
		for (int i = 0; i < loc; i++) {
			list[i]=temp[i];
		}
		
		for (int i = loc; i < list.length; i++) {
			list[i]=temp[i+1];
		}
	}
	
	public boolean contains(T val) {
		boolean r=false;
		for (int i = 0; i < list.length; i++) {
			if(list[i].equals(val)) {
				r=true;
				break;
				
			}
		}
		return r;
	}

	public int size() {
		// TODO Auto-generated method stub
		return list.length;
	}
}