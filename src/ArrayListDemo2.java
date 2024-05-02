import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al=new ArrayList();
		al.add("Akhila");
		al.add("Vinodh");
		al.add("Vihaan");
		System.out.println(al);
		
		ArrayList al_dup= new ArrayList();
		al_dup.add(8);
		al_dup.add(14);
		al_dup.add(765);
		System.out.println(al_dup);
		
		al_dup.addAll(al);
		System.out.println(al_dup);
		
	}

}
