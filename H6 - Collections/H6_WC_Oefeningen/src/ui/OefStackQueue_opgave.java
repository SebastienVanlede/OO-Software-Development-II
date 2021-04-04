package ui;

import java.util.*;
/*
Maak gebruik van Scanner om enkele regeltjes tekst in te lezen
Plaats de woordjes op een stack en een queue.
Druk dan de woordjes in 2 kolommen (20 breed) af,
eerste kolom uit stack, tweede uit queue
VB:
invoer --> een twee drie vier vijf zes zeven acht negen tien

uitvoer -->
               Stack               Queue       

                tien                 een                
               negen                twee                
                acht                drie                 
               zeven                vier               
                 zes                vijf                
                vijf                 zes                
                vier               zeven                
                drie                acht                
                twee               negen                 
                 een                tien               


*/

public class OefStackQueue_opgave {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		// definieer stack en queue
		Deque<String> stack, queue;
		stack = new ArrayDeque<>();
		queue = new ArrayDeque<>();

		// lees woord per woord en plaats in de 2 containers
		System.out.print("Geef een woord of druk ENTER om meteen te stoppen: ");
		String woord;
		woord = in.nextLine();

		while (!woord.isBlank()) {
			stack.offerFirst(woord);
			queue.offerLast(woord);
			
			System.out.print("Geef een woord of druk ENTER om meteen te stoppen: ");
			woord = in.nextLine().trim();

		}

		// druk hoofding
		if (!stack.isEmpty()) {
			System.out.printf("%n%n%20s%20s%n", "Stack", "Queue");
		}

		// zolang containers niet leeg, druk een regel met betreffende woorden
		while (!stack.isEmpty()) {
			System.out.printf("%20s%20s%n", stack.pollFirst(), queue.pollFirst());
		}

	}
}