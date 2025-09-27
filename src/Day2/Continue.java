package Day2;

public class Continue {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		for (int i=a;i<=b;i++) {
			if(i%2!=0)
			continue;
			System.out.println(i);
		}

	}

}
