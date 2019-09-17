package lesson8assi;

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

	public void resize() {

	}
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
		Person.arraycopy(personArr,0,temp,0,index);
		Person.arraycopy(personArr,index+1,temp,index,personArr.length-(index+1));
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
