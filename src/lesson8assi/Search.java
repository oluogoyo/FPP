package lesson8assi;

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