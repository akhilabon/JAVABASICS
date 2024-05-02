
public class Max_number_min_number_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {50,80,120,100,30};
		int max = a[0];
	//	
		for( int i=1;i<a.length;i++) {
			
			if(a[i]>max)
			{
				max=a[i];	
			}
		}
		System.out.println("Maximum number "+ max);
		
		
		int min= a[0];
		for(int i=1;i<a.length;i++) {
			
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Minimum number "+ min);
	}

}
