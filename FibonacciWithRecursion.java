public class FibonacciWithRecursion {
		// TODO Auto-generated method stub
		static int n1 = 0, n2 = 1,n3 = 0;	//initializing values
			
		//creating a separate function for generating fibonacci series
		static void printFibonacciWithRecursion(int count)
		{	
			if(count > 0)	// imposing condition
			{
			n3 = n1+n2;		
			
			System.out.print(" "+n3);
	
			n1 = n2;
			
			n2 = n3;
			
			printFibonacciWithRecursion(count-1);
		}
}
public static void main(String[] args) {

int count = 10;

System.out.print(n1+" "+n2);

printFibonacciWithRecursion(count-2);	//calling the function
}
}