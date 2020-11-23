

public class DataSet {

	private int[] data;
	
	public DataSet() {
		data = new int[1000];
	}
	
	public void readData(String filename) {
		ArrayReader reader = new ArrayReader(filename);
		int numValues = reader.fillArray(data);
	}
	
	public String toString() {
		
	}
	
	public double findAverage() {
		int sum = 0;
		for (int a=0; a<data.length-1; a++) {
			sum =+ data[a];
		}
		return sum;
	}
	
	public int[] findModes() {
		
	}
	
	public double findStandardDeviation() {
		
	}
	
	
}
