/* Rustin Winger
 * CS 211
 * Assignment 3
 * 10/12/2018
 */
package rstn;

import java.io.FileNotFoundException;

class Assignment3 {

	//main method
	public static void main(String[] args) throws FileNotFoundException {
		
		//constructs student and people classes using designated text files
		Student s = new Student("students.txt");
		People p = new People("people.txt");
		
		//student method displays
		System.out.println("CS211 Students:");
		s.taken211();
		System.out.println();
		System.out.println("CS210 Students:");
		s.taken210();
		System.out.println();
		System.out.println("All CS Students:");
		s.either211or210();
		System.out.println();
		System.out.println("Students in Both Classes:");
		s.bothClasses();
		System.out.println();
		System.out.println("Students only in CS211:");
		s.only211();
		System.out.println();
		System.out.println("Students only in CS210:");
		s.only210();
		System.out.println();
		
		System.out.println("-------------------------------------");
		System.out.println();
		
		//people traveler method display
		System.out.println("Visited Mexico:");
		p.visitedMexico();
		System.out.println();
		System.out.println("Visited Cuba:");
		p.visitedCuba();
		System.out.println();
		System.out.println("Visited Jamaica:");
		p.visitedJamaica();
		System.out.println();
		System.out.println("All Unique Travlers:");
		p.uniquePeople();
		System.out.println();
		System.out.println("Visited All Three:");
		p.allThree();
		System.out.println();
		System.out.println("Visited Mexico and Cuba but not Jamaica:");
		p.visitMC();
		System.out.println();
		System.out.println("Visited Cuba Only:");
		p.cubaOnly();
		
	}
}
