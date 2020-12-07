import java.util.Arrays;

public class DataSet {

	//FILEDS
	private int[] data;
	private final int MAX_FILE_SIZE = 10000;
	private int numValues;
	
	//CONSTRUCTOR
	public DataSet() {
		data = new int[MAX_FILE_SIZE];
	}
	
	//METHODS
	public void readData(String filename) {
		ArrayReader reader = new ArrayReader(filename);
		numValues = reader.fillArray(data);
	}
	
	
	public String toString() {
		String str = "[";
		for(int a=0;a<numValues;a++) {
			str += data[a]+", ";
		}
		str += "]";
		return str;
	}
	
	
	public double findAverage() {
		double sum = 0;
		for (int a=0; a<numValues; a++) {
			sum += data[a];
		}
		return sum/numValues;
	}
	
	
	public int[] findModes() {	
		int[] list = Arrays.copyOfRange(data, 0, numValues); //avoid side effect
		Arrays.sort(list);
		int modes[] = new int[1000];
		int max = 0, count = 0;
		
		for (int a=1;a<numValues;a++) {

			if(list[a] == list[a-1]){
				count++;
			}else {
				modes[max] = list[a-1];
				modes[max+500] = count;
				count = 0;
				max++;
			}
		}
		int maxNum = 0;
		for(int a=500;a<max+500;a++) {
			if (modes[a]>maxNum) {
				maxNum = modes[a];
			}
		}
		int modeCount = 0;
		for(int a=500;a<max+500;a++) {
			if (modes[a]==maxNum) {
				modes[modeCount] = modes[a-500];
				modeCount++;
			}
		}
		return Arrays.copyOfRange(modes, 0, modeCount);
	}
	
	
	public double findStandardDeviation() {
		double sumOfSq = 0;
		for (int a=0; a<numValues; a++) {
			sumOfSq += Math.pow((data[a]-findAverage()), 2);
		}
		return Math.sqrt(sumOfSq/(numValues-1));
	}
	
	
	public void insert(int val, int i) {
		numValues++;
		for (int a=numValues;a>i;a--){
		    data[a] = data[a-1];
		}
		data[i] = val;
	}
	
	
	public void removeVal(int val) {
		for (int a=0; a<numValues;a++) {
			if(data[a] == val) {
				for(int i=a;i<numValues;i++) {
					data[i] = data[i+1];
				}
				numValues--;
				a--;
			}
		}
	}
}
