package Javafeatures_8;

interface Cab{
	//public void bookCab();
	//public void bookCab(String source,String destination);
	public String bookCab(String source,String destination);
}

//class Ola implements Cab{
//
//	@Override
//	public String bookCab(String source, String destination) {
//		System.out.println("Ola cab is booked from "+source+" To"+destination);
//		return ("Price is 5000.0 Rs.s");
//	}
//	
//}

public class LamdbaConcept {

	public static void main(String[] args) {
		
//		Cab car = () -> System.out.println("Cab was booked....");
//		car.bookCab();
		
//		Cab cab = (source,destination) -> System.out.println("Ola cab is booked from "+source+" To "+destination);
//		cab.bookCab("Hyderabad", "Guntur");
		
//		Cab cab = new Ola();
//		System.out.println(cab.bookCab("Hyderabad", "Guntur"));
		
		Cab cab = (source,destination) -> {
			System.out.println("Ola cab is booked from "+source+" To "+destination);
			return ("Price is 5000.00 Rs");
		}; 
		System.out.println(cab.bookCab("Hyderabad", "Guntur"));
	}

}
