/**
 * 
 */
package Module3All;

/**
 * @author 18045
 *
 */
import java.util.Scanner;
public class Module3d {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String city_name(); 
		Scanner city_nam = new Scanner(System.in);
		System.out.println("Enter a city name: ");
		
		String city_name = city_nam.nextLine();
		
		System.out.println("The character length of " + city_name + " is: " + city_name.length());	
		System.out.println(city_name.toUpperCase());
		System.out.println(city_name.toLowerCase());
		System.out.println("The first character in " + city_name + " is: " + city_name.charAt(0));
		
	}
}
