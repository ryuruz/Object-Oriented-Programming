public class IrrArr {

	public static void main(String[] args) {
		int a [][] = {{10,11,12}, {20, 21}, {30, 31, 32}, {40,41}} ;
		
		int b [][] = new int [4][];
		b[0] = new int[3];
		b[1] = new int[2];
		b[2] = new int[3];
		b[3] = new int[2];
		
		for (int i=0; i<b.length; i++) {
			for (int j=0; j<b[i].length; j++) {
				b[i][j] = (i+1)*10 + j;
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

}
