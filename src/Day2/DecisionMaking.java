package Day2;

public class DecisionMaking {

	public static void main(String[] args) {
		int a=5,b=10;
		int c=5;
		if(a!=c) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		if(!(a==c)||(a!=b)) {
			System.out.println("yes the condition is true");
		}
		else {
			System.out.println("Nope");
		}

	}

}
