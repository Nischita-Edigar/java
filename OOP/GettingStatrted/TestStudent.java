package demo;
class StudentDetails{
	int id;
	String name;
}

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails s1 = new StudentDetails();
		s1.id=101;
		s1.name="Jhon";
		System.out.println("The name of the student is "+" "+s1.name +"with student id" +" "+s1.id);

	}

}

