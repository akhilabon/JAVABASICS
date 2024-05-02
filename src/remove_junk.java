
public class remove_junk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S = "Akhila &*@!$%^%$*&*&^&^$#(* 237462387462Vinodh";
		
		//S.replaceAll("[^a-zA-Z0-9]", "");
		String result = S.replaceAll("[^a-zA-Z0-9]", "");
		System.out.print(result);
		
	}

}
