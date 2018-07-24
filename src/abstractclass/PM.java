package abstractclass;


abstract class Product { 
    int i;
    public Product( int i ) {
        this.i = i;
    }

}
class PM extends Product {
	int j;
    public PM(int j,int i) {
        super(i);
        this.j=j;
    }
    public static void main(String[] args) {
		
    	PM p=new PM(2, 9);
    	System.out.println(p);
    	
	}
	@Override
	public String toString() {
		return "PM [j=" + j + ", i=" + i + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}



/*public class PM {

}*/
