package abstractclass;



abstract class Abc{
	
	int i=19;
	 String na;
	abstract  void m1();


   void m2(){
		System.out.println("abstract concret m2");
		
	}
   
 
 /*  
   public Abc(String na) {
	super();
	this.na = na;
}*/



static{
	   
   }
}

class pqr extends  Abc{
String na;
	




	public pqr(String na) {
	super();
	this.na = na;
}





	void m1(){
		
		System.out.println(super.i);
		
		
	}


}

class xzy extends Abc{
/*	public xzy(String na) {
		super(na);
		// TODO Auto-generated constructor stub
	}*/

	void m1(){
		System.out.println("xzy mehode m1");
	}
}

public class A {

	public static void main(String[] args) {
		pqr a=new pqr("ss");
		a.m1();
		a.m2();
	}
}


