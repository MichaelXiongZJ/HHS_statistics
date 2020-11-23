
public class Statistics {

	public static void main(String[] args) {
		// Create a DataSet object
		
		DataSet a = new DataSet();
		// Call the readData method to get data from the file
		a.readData("Statistics/data/numbers.txt");
		// Optionally, print the DataSet object to validate that data was read correctly
		System.out.println("DataSet: ");
		System.out.println(a.toString());
		// Compute statistics and print the results
		System.out.println("Average: ");
		System.out.println(a.findAverage());
		
		System.out.println("Modes: ");
		System.out.println(a.findModes());
		
		System.out.println("StandardDeviation: ");
		System.out.println(a.findStandardDeviation());


	}

}
