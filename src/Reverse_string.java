
public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a= "Akhila";
		String t= " ";
		for(int i=a.length()-1;i>=0;i--) {
			t=t+a.charAt(i);
		}
		System.out.println(t);
		if(a==t) {
			System.out.println("It is palindrome");
		}
		else
		System.out.println("It is not palindrome");
		
	}

}
