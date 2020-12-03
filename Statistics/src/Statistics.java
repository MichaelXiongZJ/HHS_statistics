import java.util.Arrays;

public class Statistics {

	public static void main(String[] args) {
		// Create a DataSet object
		
		DataSet data = new DataSet();
		// Call the readData method to get data from the file
		
	//	data.readData("more data/numbers.txt");
	//	data.readData("more data/numbers2.txt");
		data.readData("more data/numbers3.txt");
	//	data.readData("more data/numbers4.txt");
	//	data.readData("RemoveVal & Insert/compact.txt");
		
		// Optionally, print the DataSet object to validate that data was read correctly
		System.out.println("All 0 removed");
		data.removeVal(0);
		
		System.out.println("DataSet: ");
		System.out.println(data.toString());
		// Compute statistics and print the results
		System.out.println("Average: ");
		System.out.println(data.findAverage());
		
		System.out.println("Modes: ");
		System.out.println(Arrays.toString(data.findModes()));
		
		System.out.println("StandardDeviation: ");
		System.out.println(data.findStandardDeviation());
		/*
		System.out.println("Add 100 at data[0] and data[2]: ");
		data.insert(100, 0);
		data.insert(100, 2);
		System.out.println(data.toString());
		
		System.out.println("remove all 0: ");
		data.removeVal(0);
		System.out.println(data.toString());*/
	}

}
