package Day3;
import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		String studentname;
		int regno;
		String city;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student name:");
		studentname =sc.nextLine();
		System.out.println("Enter city name:");
		city=sc.nextLine();
		System.out.println("Enter register nunber:");
		regno=sc.nextInt();
		Student s1=new Student();
		s1.setstudentname(studentname);
		s1.setregno(regno);
		s1.setcity(city);
		System.out.println("NAME:"+studentname);
		System.out.println("LOCATION:"+city);
		System.out.println("REG No.:"+regno);
		
	}

}
