package codersLab;

public class Main19 {

	public static void main(String[] args) {
		int n = 5;
		for(int i= 0;i<n;i++) {
			 String row = "";
			 for (int j = 0; j < n; j++) {

	                if (j <= i) {
	                    row += "*";
	                } else {
	                    row += j+1;
	                }
		        }

		System.out.print(row + "\n");
		}
//new loop

	for(int i= n;i>0;i--) {
		 String row = "";
		 for (int j = 0; j < n; j++) {

                if (j >= i) {
                    row += j+1;
                } else {
                    row += "*";
                }
	        }

	System.out.print(row + "\n");
	}
	}
}