package classes;

public class Person {
	protected int age;
	protected char sex, midInitial;
	protected String firstName, lastName;
	protected double height, weight;
	protected Location birthPlace;
	protected Location residence;
	
	public Person() {
		super();
	}

	public Person(int age, char sex, String firstName, String lastName, double height, double weight, Location birthPlace,
			Location residence) {
		super();
		this.age = age;
		this.sex = sex;
		this.firstName = firstName;
		this.lastName = lastName;
		this.height = height;
		this.weight = weight;
		this.birthPlace = birthPlace;
		this.residence = residence;
		midInitial = '\0';
	}
	public Person(int age, char sex, String firstName, String lastName, double height, double weight, Location birthPlace,
			Location residence, char midInitial) {
		super();
		this.age = age;
		this.sex = sex;
		this.firstName = firstName;
		this.lastName = lastName;
		this.height = height;
		this.weight = weight;
		this.birthPlace = birthPlace;
		this.residence = residence;
		this.midInitial = midInitial;
	}

	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public char getMidInitial() {
		return midInitial;
	}

	public void setMidInitial(char midInitial) {
		this.midInitial = midInitial;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Location getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(Location birthPlace) {
		this.birthPlace = birthPlace;
	}

	public Location getResidence() {
		return residence;
	}

	public void setResidence(Location residence) {
		this.residence = residence;
	}

	public String toString() {
		return 
				"\nFull Name: " + this.firstName + " " + this.midInitial + ". " + this.lastName +
				"\nAge: " + this.age +
				"\nSex: " + this.sex +
				"\nCurrent Location:\n\n" + this.residence +
				"\nBirth Place: \n\n" + this.birthPlace +
				"\nHeight (cm.): " + this.height +
				"\nWeight (kg.): " + this.weight;
				
	}
	
	
}
