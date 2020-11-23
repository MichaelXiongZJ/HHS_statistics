

public class DataSet {

	private int[] data;
	
	public DataSet() {
		
	}
	
	public void readData(String filename) {
		ArrayReader reader = new ArrayReader(filename);
		int numValues = reader.fillArray(data);
	}
	
	public String toString() {
		
	}
	
	public double findAverage() {
		
	}
	
	public int[] findModes() {
		
	}
	
	public double findStandardDeviation() {
		
	}
	
	
}
