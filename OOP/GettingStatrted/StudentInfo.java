package demo;
class Student1{
	int rollnum;
	String name;
	void insertRecord(int r,String n) {
		rollnum =r;
		name = n;
		
		
	}
	void displayInformation() {System.out.println(rollnum + " " + name);}
}

public class StudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s3 = new Student1();
		Student1 s4 = new Student1();
		s3.insertRecord(10020, "Sara");
		s4.insertRecord(973, "Marry");
		s3.displayInformation();
		s4.displayInformation();
		

	}

}
