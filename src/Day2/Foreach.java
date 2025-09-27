package Day2;

public class Foreach {

	public static void main(String[] args) {
	int[] a= {10,20,30,40,50,60,70};
	char ch[]= {'a','b','c','d','e','f'};
	String[] s= {"Java","full","stack","Developer"};
	for(int i:a) {
		System.out.println(i);
	}
	for(char c:ch) {
		System.out.println(c);
	}
	for(String str:s) {
		System.out.println(str);
	}
	

	}

}
