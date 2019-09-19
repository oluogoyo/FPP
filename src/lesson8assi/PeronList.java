package src.lesson8assi;

import lesson8assi.Person;

public class PeronList {
	private final int INITIAL_LENGTH = 4;
	private Person[] personArr;
	private int size;

	public PeronList() {
		personArr = new Person[INITIAL_LENGTH];
		size = 0;

	}

	// add method
	public void add(Person person) {
		if (size == personArr.length)
			resize();
		personArr[size++]= person;
	}

//	public void resize() {
//
//	}
	//get method
	public Person get(int i) {
		if(i< 0 || i> size)
			return null;
		return personArr[i];
		
	}
	//find method
	
	public boolean find(String lastName) {
		
	for(Person p:personArr) {
		if (p.getLast().equals(lastName)) return true;
			
	}
	return false;
		
		
		
		
		//Question solution:1
		
		class Search {
	String[] anArray;

	//anArray is a sorted array
	Search(String[] anArray){
		this.anArray = anArray;
	}
	//search a sorted array
	boolean search(String val) {
		boolean b = recurse(0,anArray.length-1, val);
		return b;
	}


	boolean recurse(int a, int b, String val) {
		int mid = (a+b)/2;
		if(anArray[mid].equalsIgnoreCase(val)) 
			return true;
		if(a > b) return false;
		
		if(val.equalsIgnoreCase(anArray[mid]);
				
				return recurse
						
				(mid+1, b, val);
		return recurse(a,mid-1,val);
	}
}
		   
		   public class MinSort {
	String[] arr;
	MinSort(String[] arr){
		this.arr = arr;
	}
	public void sort(){
		if(arr == null || arr.length <=1) return;
		int len = arr.length;
		String temp = 0;
		for(int i = 0; i < len; ++i){
			int nextMinPos = minpos(i,len-1);
			swap(i,nextMinPos); 
		}
		
	}
	void swap(int i, int j){
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	//find minimum of arr between the indices bottom and top
	public int minpos(int bottom, int top){		
		int m = arr[bottom];
		int index = bottom;
		for(int i = bottom+1; i <= top; ++i){
			if(arr[i]<m){ 
				m = arr[i];
				index = i;
			}
		}
		//return location of min, not the min itself
		return index;
	}
	public static void main(String[] args){
		int[] test = {21,13,1,-22, 51, 5, 18};
		SelSort ss = new SelSort(test);
		ss.sort();
		System.out.println(Arrays.toString(ss.arr));
		
	}
}
		   
		   package lesson8assi;

public class MyStringList {
	private final int INITIAL_LENGTH = 4;
	private String[] strArray; 
	private int size;
	
	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}
	
	public void add(String s){
		if(size == strArray.length) resize();
		strArray[size++] = s;
	}
	
	public String get(int i){
		if(i < 0 || i >= size){
			return null;
		}
		return strArray[i];
	}
	
	public boolean find(String s){
		for(String test : strArray){
			if(test.equals(s)) return true;
		}
		return false;
	}
	
	public void insert(String s, int pos){
		if(pos > size) return;
		if(pos >= strArray.length||size+1 > strArray.length) {
			resize();
		}
		String[] temp = new String[strArray.length+1];
		System.arraycopy(strArray,0,temp,0,pos);
		temp[pos] = s;
		
		System.arraycopy(strArray,pos,temp,pos+1, strArray.length - pos);
		strArray = temp;
		++size;
		
	}
	
	public boolean remove(String s){
		if(size == 0) return false;
		int index = -1;
		for(int i = 0; i < size; ++i ){
			if(strArray[i].equals(s)){
				index = i;
				break;
			}
		}
		if(index==-1) return false;
		String[] temp = new String[strArray.length];
		System.arraycopy(strArray,0,temp,0,index);
		System.arraycopy(strArray,index+1,temp,index,strArray.length-(index+1));
		strArray = temp;
		--size;
		return true;
	}
	
	
	private void resize(){
		System.out.println("resizing");
		int len = strArray.length;
		int newlen = 2*len;
		String[] temp = new String[newlen];
		System.arraycopy(strArray,0,temp,0,len);
		strArray = temp;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < size-1; ++i){
			sb.append(strArray[i]+", ");
		}
		sb.append(strArray[size-1]+"]");
		return sb.toString();
	}
	public int size() {
		return size;
	}

	public static void main(String[] args){
		MyStringList l = new MyStringList();
		l.add("big");
		l.add("small");
		l.add("tall");
		l.add("short");
		l.add("round");
		l.add("squre");
		l.add("enormous");
		l.add("tiny");
		l.add("enormous");
		l.add("lilliputian");
		l.add("numberless");
		l.add("none");
		l.add("vast");
		l.add("miniscule");
		System.out.println("The list of size "+l.size()+" is "+l);
		l.remove("Mark");
		l.remove("Bob");
		System.out.println("The list of size "+l.size()+" is "+l);
		l.insert("Richard",3);
		System.out.println("The list of size "+l.size()+" after inserting Richard into pos 3 is "+l);
		l.insert("Tonya",0);
		System.out.println("The list of size "+l.size()+" after inserting Tonya into pos 0 is "+l);		
	}

}

		
	}
	// insert method
	public void insert(Person person, int pos){
		if(pos > size) return;
		if(pos >= personArr.length||size+1 > personArr.length) {
			resize();
		}
		Person[] temp = new Person[personArr.length+1];
		System.arraycopy(personArr,0,temp,0,pos);
		temp[pos] = person;
		
		System.arraycopy(personArr,pos,temp,pos+1, personArr.length - pos);
		personArr = temp;
		++size;
		
	}
	//remove Method
	
	public boolean remove(Person person){
		if(size == 0) return false;
		int index = -1;
		for(int i = 0; i < size; ++i ){
			if(personArr[i].equals(person)){
				index = i;
				break;
			}
		}
		if(index==-1) return false;
		Person[] temp = new Person[personArr.length];
		System.arraycopy(personArr,0,temp,0,index);
		System.arraycopy(personArr,index+1,temp,index,personArr.length-(index+1));
		personArr = temp;
		--size;
		return true;
	}
	
	//resize method
	private void resize(){
		System.out.println("resizing");
		int len = personArr.length;
		int newlen = 2*len;
		Person[] temp = new Person[newlen];
		System.arraycopy(personArr,0,temp,0,len);
		personArr = temp;
	}
	public String toString(){
		StringBuilder person = new StringBuilder("[");
		for(int i = 0; i < size-1; ++i){
			person.append(personArr[i]+", ");
		}
		person.append(personArr[size-1]+"]");
		return person.toString();
	}
	public int size() {
		return size;
	}

	public static void main(String[] args){
		MyStringList l = new MyStringList();
		l.add("Bob");
		l.add("Steve");
		l.add("Susan");
		l.add("Mark");
		l.add("Dave");
		System.out.println("The list of size "+l.size()+" is "+l);
		l.remove("Mark");
		l.remove("Bob");
		System.out.println("The list of size "+l.size()+" is "+l);
		l.insert("Richard",3);
		System.out.println("The list of size "+l.size()+" after inserting Richard into pos 3 is "+l);
		l.insert("Tonya",0);
		System.out.println("The list of size "+l.size()+" after inserting Tonya into pos 0 is "+l);		
	}

	
	
}
