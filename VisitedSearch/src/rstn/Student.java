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

//Student class
public class Student {
	
	//declaring hashsets for each class and one for all students
	private HashSet<String> CS210;
	private HashSet<String> CS211;
	private HashSet<String> All;

	//constructor
	public Student(String file) throws FileNotFoundException {
		CS210 = new HashSet<String>();
		CS211 = new HashSet<String>();
		All = new HashSet<String>();
		
		Scanner input = new Scanner(new File(file));
		read(input);
	}
	
	//file scanner to add text file info to hashsets based on student and class
	public void read(Scanner input) {
		
		while(input.hasNext()) {
			String student = input.next();
			String section = input.next();
			if (section.contains("CS210")) {
				CS210.add(student);
				All.add(student);
			}
			else {
				CS211.add(student);
				All.add(student);
			}
		}
	}
	
	//method to show students who have taken CS211
	public void taken211() {
		for (String s : CS211) {
			System.out.println(s);
		}
	}
	
	//method to show students who have taken CS210
	public void taken210() {
		for (String s : CS210) {
			System.out.println(s);
		}
	}

	//method to show students who have taken either class (total unique students)
	public void either211or210() {
		Iterator <String> m = All.iterator();
		while(m.hasNext()) {
			System.out.println(m.next());
		}
	}

	//method to show students who have taken both classes
	public void bothClasses() {
		CS210.retainAll(CS211);
		
		Iterator <String> m = CS210.iterator();
		while(m.hasNext()) {
			System.out.println(m.next());
		}
	}

	//method to show students who have taken CS211 but not CS210
	public void only211() {
		CS211.removeAll(CS210);
		
		Iterator <String> m = CS211.iterator();
		while(m.hasNext()) {
			System.out.println(m.next());
		}	
	}

	//method to show students who have taken CS210 but not CS211
	public void only210() {
		All.removeAll(CS211);
		
		Iterator <String> m = All.iterator();
		while(m.hasNext()) {
			System.out.println(m.next());
		}
	}	
}
