import java.util.Scanner;

public class PrimeORNoT {
	
	 static int isPrime(int n){
		 System.out.println(n);
         //since 0 and 1 is not prime return false.
         if(n==1||n==0)return 0;
 
         //Run a loop from 2 to n-1
         for(int i=2; i<n; i++){
           // if the number is divisible by i, then n is not a prime number.
               if(n%i==0)return 0;
         }
         //otherwise, n is prime number.
         return 1;
   }
	 
	 public void printTable(int num){
		 for (int i = 0; i <=10; i++) {
			System.out.println(num+"*"+i + "=" +(num*i));
		}	 
		 
	 }
	 
	 
	public static void main(String[] args) {
	PrimeORNoT pr =new PrimeORNoT();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number ");
	int num =sc.nextInt();
	 System.out.println(pr.isPrime(num)); 
	 int number = pr.isPrime(num);
	if(number==1){
		System.out.println("the value is prime number");
		pr.printTable(num);
		
	}else {
		System.out.println("the value is not prime number");
		int value = num/10;
		System.out.println(value);
	} 
	
	}



}
