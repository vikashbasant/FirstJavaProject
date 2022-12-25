package in.co.decimal;

public class MultiplicationRunner {
	public static void main(String[] args) {
		MultiplicationTable table = new MultiplicationTable();

		// this will print only 5 table:
		table.printTable();

		// for genrice purpose:
		table.printTable(56);
		
		table.printTable(10, 34, 40);
	}
}
