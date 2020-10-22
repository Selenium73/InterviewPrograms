package RestAssured;

public class Employee {

	// Variables or data members of POJO class
	static String firstName;
	static String lastName;
	static int age;
	static String gender;
	static float Salary;
	static boolean married;

	 
	
	// Getters and setters methods
	public static String getFirstName() {
		return firstName;
	}

	public static void setFirstName(String firstName) {
		Employee.firstName = firstName;
	}

	public static String getLastName() {
		return lastName;
	}

	public static void setLastName(String lastName) {
		Employee.lastName = lastName;
	}

	public static int getAge() {
		return age;
	}

	public static void setAge(int age) {
		Employee.age = age;
	}

	public static String getGender() {
		return gender;
	}

	public static void setGender(String gender) {
		Employee.gender = gender;
	}

	public static float getSalary() {
		return Salary;
	}

	public static void setSalary(float salary) {
		Salary = salary;
	}

	public static boolean isMarried() {
		return married;
	}

	public static void setMarried(boolean married) {
		Employee.married = married;
	}

}
