package classes;
import java.util.HashMap;

public abstract class Student extends Person {
	private int studentID;
	private String schoolName;
	private HashMap<String, Double> classes;
	
	public Student() {
		super();
		studentID = 0;
		schoolName = "";
		classes = new HashMap<String,Double>();
		
	}

	public Student(int age, char sex, String firstName, String lastName, double height, double weight,
			Location birthPlace, Location residence, int studentID, String schoolName,
			HashMap<String, Double> classes) {
		super(age, sex, firstName, lastName, height, weight, birthPlace, residence);
		this.studentID = studentID;
		this.schoolName = schoolName;
		this.classes = classes;
	}

	public Student(int age, char sex, String firstName, String lastName, double height, double weight,
			Location birthPlace, Location residence, char midInitial, int studentID, String schoolName,
			HashMap<String, Double> classes) {
		super(age, sex, firstName, lastName, height, weight, birthPlace, residence, midInitial);
		this.studentID = studentID;
		this.schoolName = schoolName;
		this.classes = classes;
	}
	
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	

	public int getStudentID() {
		return studentID;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public HashMap<String, Double> getClasses() {
		return classes;
	}
	
	public void signUpClass(String className) {
		classes.put(className, null);
	}
	
}
