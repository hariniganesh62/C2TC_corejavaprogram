package Day3;

public class Student{
	    private String studentname;
	    private int regno;
	    private String city;

	    // Default constructor
	    public Student() {
	        System.out.println("Student object created");
	    }

	    // Setters
	    public void setstudentname(String studentname) {
	        this.studentname = studentname;
	    }

	    public void setregno(int regno) {
	        this.regno = regno;
	    }

	    public void setcity(String city) {
	        this.city = city;
	    }

	    // Optional: Getters
	    public String getstudentname() {
	        return studentname;
	    }

	    public int getregno() {
	        return regno;
	    }

	    public String getcity() {
	        return city;
	    }
	}



