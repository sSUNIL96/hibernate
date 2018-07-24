package abstractclass;




class su implements s,u{
	
	public void ab(){
		System.out.println("interfce ab");
		
	}
	
	
	public void pq(){
		System.out.println("interfce pq");
	}
	
}




public class Test15 {

	public static void main(String[] args) {
		
		su s=new su();
		
		s.ab();
		s.pq();
	}
}
