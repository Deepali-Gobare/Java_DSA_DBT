public class String1 {
	public static void main(String args[]) {
	
	//StringBuffer sb = new StringBuffer();	
	 String s1="Test";
	 String s2="Test";
	 System.out.println(s1==s2);
	 System.out.println(s1.equals(s2));
		
		StringBuffer sb1 = new StringBuffer("Hello");
		StringBuffer sb2 = new StringBuffer("Hello");
		StringBuffer sb3 = new StringBuffer("World");
		
		System.out.println(sb1==sb2);

		// Using toString() to compare contents
		if (sb1.toString().equals(sb2.toString())) {
		    System.out.println("sb1 and sb2 are equal.");
		} else {
		    System.out.println("sb1 and sb2 are not equal.");
		}

		// This will print "sb1 and sb2 are equal."
		
		
		StringBuilder sb4 = new StringBuilder("Hello");
		StringBuilder sb5 = new StringBuilder("Hello");
		StringBuilder sb6 = new StringBuilder("World");
		
		System.out.println(sb4==sb5);
		
		if (sb4.equals(sb5)) {
		    System.out.println("sb1 and sb2 are equal.");
		} else {
		    System.out.println("sb1 and sb2 are not equal.");
		}
		

	 
		
	}

}
