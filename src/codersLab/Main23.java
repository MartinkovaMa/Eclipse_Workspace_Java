package codersLab;

public class Main23 {

	public static void main(String[] args) {
		int[]numbers= new int []{4, 643, 112, 9999, 69};
		System.out.println(numbers[0]);
		System.out.println(numbers[2]);
		int sumOdd = 0;
		for(int i = 0;i < numbers.length;i = i + 1){
			sumOdd+=numbers[i];
	}
		System.out.println("SUM: " + sumOdd);
}

	
	}


