package abstractclass;

public class javasimple {

	public static void main(String[] args) {

		char ch = 'a';
		ch++;
		System.out.println(ch);

		System.out.println(sum(new int[] { 10, 20, 30, 40 }));
	}

	public static int sum(int x[]) {

		int total = 0;
		for (int b : x) {
			total = total + b;
		}
		return total;

	}
}
