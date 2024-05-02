import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add("Akhila");
		al.add(3);
		al.add(15.3);
		al.add("True");
		System.out.println(al);
		
		//adding by index
		al.add(3, "False");
		System.out.println(al);
		
		//Remove by index
		al.remove(3);
		System.out.println(al);
		
		//remove by object
		al.remove(15.3);
		System.out.println(al);
		
		//size of arraylist
		System.out.println(al.size());
		
		//empty 
		System.out.println(al.isEmpty());
		
		//contains
		System.out.println(al.contains("Vinodh"));
		
		//get
		System.out.println(al.get(2));
		
		//for
		
		for(int i=0;i<al.size();i++) {
			System.out.println ("by for loop"+al);
		}
			
		//Add
		al.add(3, "Vihaan");
		System.out.println(al);
		
		//Set
		al.set(2, "loves");
		System.out.println(al);
		
		//Iterator
		
		Iterator it = al.iterator();
		while(it.hasNext()) {
		 
		{
			System.out.println("By iterator"+it.next());
		}
		
		
		}
		
	

	}

}
