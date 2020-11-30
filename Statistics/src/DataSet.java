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
	
	public int findModes() {
		Arrays.sort(data);
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
		
		

		
		int list[];
		list = new int [2000];

		
		for (int a=0; a<data.length;a++) {
			int count = 0;
			int i = 0;
			for(int b=a+1; b<data.length;b++) {
				if (data[a] == data[b]) {
					count ++;
				}
				else {
					list[i] = data[a];
					list[i+1] = count;
					i += 2;
					a = b;
				}
			}

		}
		
		
		
		
		
		
		
		
		
		
		String str = "";


		for (int a=0;a<list.length;a++) {
			str += list[a] + " ";
		}

		System.out.println(str);
		return 1;
	
		
		
	}
	
	public double findStandardDeviation() {
		double sumOfSq = 0;
		for (int a=0; a<data.length; a++) {
			sumOfSq += Math.pow((data[a]-findAverage()), 2);
		}
		return Math.sqrt(sumOfSq/(data.length-1));
	}
	
	
}
