package codersLab;

public class Main22 {

	public static void main(String[] args) {
		int[]numbers= new int []{4, 643, 112, 9999, 69};
		int sum = 0;
		for(int i = 0;i < numbers.length;i = i + 1){
			sum+=numbers[i];
	}
		System.out.println("SUM: " + sum);
}
}