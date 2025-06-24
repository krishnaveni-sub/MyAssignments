package week1.day2;

public class FibanocciSeries {

	public static void main(String[] args) {
	
int num1=0;
int num2= 1;
int num3=0;
int range=8;


for(int i=1;i<=range;i++) {

	System.out.print(num3);
	num3=num1+num2;
	num2=num1;
	num1=num3;

	}
	
	}
}

