import java.util.Arrays;

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
		String str = "";
		for(int a : data) {
			str += a+"\n";
		}
		return str;
	}
	
	public double findAverage() {
		double sum = 0;
		for (int a=0; a<data.length; a++) {
			sum += data[a];
		}
		return sum/data.length;
	}
	
	public int[] findModes() {
		Arrays.sort(data);
		int list[] = new int [200];
		int i = 0;
		for (int a=0; a<data.length;a++) {
			int count = 0;
			for(int b=a+1; b<data.length;b++) {
				if (data[a] == data[b]) {
					count ++;
				}
				else {
					list[i] = data[a];
					list[i+1] = count;
					count = 0;
					i += 2;
					a = b;
				}
			}

		}
		int maxCount = 0;
		for (int a=1;a<list.length;a+=2) {
			if (list[a]>maxCount) {
				maxCount = list[a];
			}
		}
		int modes[] = new int[2];
		int b = 0;
		for (int a=1;a<list.length;a+=2) {
			if (list[a] == maxCount) {
				modes[b] = list[a-1];
				b++;
			}
		}
		
		String str = "";
		for(int a : modes) {
			str += a+" ";
		}
		System.out.println(str);
		return modes;
	//	return location;
		/*
		int list[];
		list = new int [2000];
		int max = 0;
		for (int a=0; a<data.length;a++) {
			int num = data[a];

			for (int b=0;b<max;b+=2) {
				if (num == list[b]) {
					list[b+1] += 1;
				}
				else {
					list[max] = num;
					list[max+1] += 1;
					max += 2;
				}
			}
		}*/	
	}
	
	public double findStandardDeviation() {
		double sumOfSq = 0;
		for (int a=0; a<data.length; a++) {
			sumOfSq += Math.pow((data[a]-findAverage()), 2);
		}
		return Math.sqrt(sumOfSq/(data.length-1));
	}
	
	
}
