package labTerminalB;

public class Driver {
	/*
	 * TODO 1	10 Marks
	 * Write a regular express at line 10 so that you can remove all html tags from a given string
	 * after you write regular expression the out put should be
	 * The Good, the Bad, and the Ugly
	 * after completing each TODO task commit and push to remote repository with commit message
	 * 		"TODO 'TASK NUMBER' Complete" e.g. in this case "TODO 1 COMPLETED"
	 */
	public static void main(String[] args) {
		String input = "The <b>Good</b>, the <i>Bad</i>, and the <strong>Ugly</strong>";
		String regex = "<[^>]*>";
		String output = input.replaceAll(regex, "");
		System.out.println(output);
		
		
		Movie m1 = new Movie("Spancer", 0);
		Movie m2 = new Movie("Speed", 1);
		Movie m3 = new Movie("Blood Diamond",2);
		Customer me = new Customer("Nadir");
		Customer me2 = new Customer("Allah Ditta");
		Rental r1 = new Rental(m1, 23);
		Rental r2 = new Rental(m2,4);
		Rental r3 = new Rental(m3,3);
		me.addRental(r1);
		me.addRental(r2);
		me2.addRental(r3);
		System.out.println(me.statement());
		System.out.println(me2.statement());

	}
}
