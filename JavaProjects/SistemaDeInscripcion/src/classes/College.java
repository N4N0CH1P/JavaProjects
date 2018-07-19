package classes;

public class College {
	private String name;
	private Location area;
	private int collegeID, minGrade, studentNum;
	
	public College() {
		name = null;
		area = new Location();
		collegeID = 0;
		minGrade = 0;
		studentNum = 0;
	}
	
	public College(String name, Location area, int collegeID, int minGrade, int studentNum) {
		this.name = name;
		this.area = area;
		this.collegeID = collegeID;
		this.minGrade = minGrade;
		this.studentNum = studentNum;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setArea(Location area) {
		this.area = area;
	}
	
	public void setCollegeID(int collegeID) {
		this.collegeID = collegeID;
	}
	
	public void setMinGrade(int minGrade) {
		this.minGrade = minGrade;
	}
	
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	public String getName() {
		return name;
	}
	
	public Location getArea() {
		return area;
	}
	
	public int getCollegeID() {
		return collegeID;
	}
	
	public int getMinGrade() {
		return minGrade;
	}
	
	public int getStudentNum() {
		return studentNum;
	}
}
