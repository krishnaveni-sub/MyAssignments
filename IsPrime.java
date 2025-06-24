package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		
		int n = 13;
	    int temp = 0; 
		for (int i=2;i<=n-1;i++) {
			if(n%i == 0) {
				temp+=1;		
			}
		}
		if (temp==0)	{
			System.out.println( n+ " is a Prime number");
		}else {
			System.out.println( n + " is not a Prime number");
		}
			
	}

}
