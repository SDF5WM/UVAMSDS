/**
 * 
 */
package Module3All;

import java.util.Scanner;

/**
 * @author 18045
 *
 */
import java.util.Scanner;
public class Module3e {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nam = new Scanner(System.in);
		System.out.println("A word or name: ");
		String name = nam.nextLine();
		String name_r2 = (name.substring(2) + name.substring(0,2));
		String name_l2 = (name.substring(name.length()-2) + (name.substring(0,(name.length()-2))));
		
		System.out.println("\"" + name + "\"" + " Shifted to the left 2 units is: " + name_r2);	
		System.out.println("\"" + name + "\"" + " Shifted to the right 2 units is: " + name_l2);	
	}
}
