package abstractclass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class testee {

	
	public static void main(String[] args) {
		
		
		ArrayList a=new ArrayList<>();
		
		a.add("A");
		a.add("F");
		a.add("C");
		a.add("B");
		a.add("T");
		
		
		System.out.println(a);
		
	//a.clear();
	System.out.println(a.size());
		
		a.add(2, "MM");
		System.out.println(a);
		
		List b=new LinkedList<>();
		
		b.add("pp");
		b.add("ss");
		a.addAll(b);
		
		
		System.out.println(a);
		
		
		System.out.println("****************");
		
		Stack s=new Stack<>();
		s.push("qqq");
		s.push("kkk");
		s.push("iii");
		s.push("sss");
		
		
		
		System.out.println(s);
		
		System.out.println(s.pop());
		
		System.out.println(s.peek());
		
		System.out.println(s.empty());
		System.out.println(s.search("uuu"));
		
	}
}
