/* Rustin Winger
 * CS 211
 * Assignment 3
 * 10/12/2018
 */
package rstn;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

//people class for travlers
public class People {

	//declaring hashsets for all countries visited and one for all unique travleers
	private HashSet<String> Mexico;
	private HashSet<String> Cuba;
	private HashSet<String> Jamaica;
	private HashSet<String> All;

	//constructor
	public People(String file) throws FileNotFoundException {
		Mexico = new HashSet<String>();
		Cuba = new HashSet<String>();
		Jamaica = new HashSet<String>();
		All = new HashSet<String>();
		
		Scanner input = new Scanner(new File(file));
		read(input);
	}
	
	//file scanner to add text file info to hashsets based on country
	public void read(Scanner input) {
		
		while(input.hasNext()) {
			String student = input.next();
			String country = input.next();
			if (country.contains("Mexico")) {
				Mexico.add(student);
				All.add(student);
			}
			if (country.contains("Cuba")) {
				Cuba.add(student);
				All.add(student);
			}
			if (country.contains("Jamaica")) {
				Jamaica.add(student);
				All.add(student);
			}
		}
	}
	
	//method to show travelers who have visited mexico
	public void visitedMexico() {
		for (String s : Mexico) {
			System.out.println(s);
		}
	}
	
	//method to show travelers who have visited cuba
	public void visitedCuba() {
		for (String s : Cuba) {
			System.out.println(s);
		}
	}
	
	//method to show travelers who have visited jamaica
	public void visitedJamaica() {
		for (String s : Jamaica) {
			System.out.println(s);
		}
	}

	//method to show all unique travelers
	public void uniquePeople() {
		Iterator <String> m = All.iterator();
		while(m.hasNext()) {
			System.out.println(m.next());
		}
	}

	//method to show travelers who have visited all three countries
	public void allThree() {
		Mexico.retainAll(Jamaica);
		Mexico.retainAll(Cuba);
		
		Iterator <String> m = Mexico.iterator();
		while(m.hasNext()) {
			System.out.println(m.next());
		}
	}

	//method to show travelers who have visited mexico and cuba but not jamaica
	public void visitMC() {
		All.retainAll(Cuba);
		All.removeAll(Jamaica);
		
		Iterator <String> m = All.iterator();
		while(m.hasNext()) {
			System.out.println(m.next());
		}	
	}

	//method to show travelers who have visited cuba only
	public void cubaOnly() {
		All.retainAll(Mexico);
		All.retainAll(Jamaica);
		
		Iterator <String> m = All.iterator();
		while(m.hasNext()) {
			System.out.println(m.next());
		}
	}		
}
