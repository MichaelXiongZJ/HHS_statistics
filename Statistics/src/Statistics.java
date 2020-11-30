
public class Statistics {

	public static void main(String[] args) {
		// Create a DataSet object
		
		DataSet data = new DataSet();
		// Call the readData method to get data from the file
		data.readData("data/numbers.txt");
		// Optionally, print the DataSet object to validate that data was read correctly
		System.out.println("DataSet: ");
		System.out.println(data.toString());
		// Compute statistics and print the results
		System.out.println("Average: ");
		System.out.println(data.findAverage());
		
		System.out.println("Modes: ");
		System.out.println(data.findModes());
		
		System.out.println("StandardDeviation: ");
		System.out.println(data.findStandardDeviation());


	}

}
