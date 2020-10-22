package RestAssured;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeSerializationAndDeSerialization {

	Employee e1;

	@Test
	public void m1() {

		// Create an object of POJO class
		e1 = new Employee();

		// Setting a values
		e1.setFirstName("Praveen");
		e1.setLastName("Sunkara");
		e1.setAge(28);
		e1.setGender("Male");
		e1.setSalary(49420);
		e1.setMarried(false);

		// Converting a java class Object to a JSON payload as string
		ObjectMapper objectMapper = new ObjectMapper();

		

	}

}
