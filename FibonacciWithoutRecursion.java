//class name always start with a capital letter
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = 0, n2 = 1,n3,i, count= 10;	//initializing
		
		System.out.print(n1+" "+n2);	//0 and 1 gets printed on the screen with space in between in them
		
		for (i=2;i<count;++i)	//i started from 2 as 0 & 1 are already initialized as 0 & 1
		{
			n3 = n2+n1;
			
			System.out.print(" "+n3);	//3rd no. gets printed
			
			n1 = n2;	//new n1 will now take n2's value
			
			n2 = n3;	//new n2 will now take n3's value
		}
	
	}

}
