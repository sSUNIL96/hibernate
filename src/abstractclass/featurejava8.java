package abstractclass;

import java.util.ArrayList;
import java.util.Scanner;

public class featurejava8 {
	
	
	public static void main(String[] args)
	{
		
		Beer b=Beer.BK;
		
		System.out.println("hello");
		
		
		
		
		

		/*Scanner scanner = new Scanner( System.in );  
		  System.out.print("Enter ur age ");  
		    
		  int value = scanner.nextInt();  
		  assert value>=18:" Not valid";  
		  
		  System.out.println("value is "+value); 
		  
		  Beer[] b=Beer.values();
		  
		  
		  System.out.println(b);
		  
		  
		  
		  */
		 /* 
		  switch(b){
		  
		  case BK:{
			  System.out.println("in the bk");
			  break;
			  
		  			}
		  case SK:{
			  
		  }
		  
		  }
		  
		  
		  
		  
		  System.out.println(b);
		 */  
	}
}

 enum Beer{
	
	 BK,SK;
	 Beer() {
		System.out.println("enum constructour");
	}
	 
}
 