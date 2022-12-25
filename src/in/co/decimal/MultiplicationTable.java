package in.co.decimal;

public class MultiplicationTable {
	
	
	// Here we can do refactoring the code:

	// this is nothing but function overloading:
	public static void printTable() {
		printTable(5);
	}
	
	
	public static void printTable(int tableNo) {
		printTable(tableNo, 1, 10);
	}

	public static void printTable(int tableNo, int from, int to) {
		for (int i = from; i <= to; i++) {
			// printf is nothing but formatter:
			System.out.printf("%d * %d = %d", tableNo, i, tableNo*i).println();
		}
	}
	
}
