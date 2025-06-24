package week1.day2;

public class PalindromeCheck {

	public  void palindrome(int input)
	{	int output=0;
	//Reverse number logic
	for(int i=input;i>0;i/=10) {
		int reminder= i%10;
		output=(output*10)+reminder;	
	}
//compare the number and its reverse
	if(input==output) {
		System.out.println(input + " is a Palindrome");
		
	}else {
		System.out.println(input + " is not a Palindrome");
		
	}
	
	}
	public static void main(String[] args) {
		PalindromeCheck p=new PalindromeCheck();
		p.palindrome(12321);
		p.palindrome(4321);
	
	}
}
