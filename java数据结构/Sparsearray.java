package sparsearray;

public class Sparsearray {

	public static void main(String[] args) {
		
		int chessArr1[][]=new int[11][11];
		chessArr1[1][2]=1;
		chessArr1[2][4]=2;
		chessArr1[5][7]=2;
		
		System.out.println("原始的二维数组:");
		
		for(int[] a:chessArr1) {
			for(int b:a)
				System.out.print(b+" ");
			System.out.println();
		}
		
		int a=0;
		for(int i=0;i<chessArr1.length;i++) {
			for(int j=0;j<chessArr1[0].length;j++) {
				if(chessArr1[i][j]!=0)a++;
			}
		}
		
		int sparsearr[][] =new int[a+1][3];
		sparsearr[0][2]=a;
		sparsearr[0][0]=chessArr1.length;
		sparsearr[0][1]=chessArr1[0].length;
		a=1;
		for(int i=0;i<chessArr1.length;i++) {
			for(int j=0;j<chessArr1[0].length;j++) {
				if(chessArr1[i][j]!=0) {
					sparsearr[a][0]=i;
					sparsearr[a][1]=j;
					sparsearr[a++][2]=chessArr1[i][j];
				}
			}
			
		}
		
		System.out.println("转换为稀疏数组:");
		for(int[] c:sparsearr) {
			for(int b:c)
				System.out.print(b+" ");
			System.out.println();
		}
		
		System.out.println("再转换到原始数组:");
		int[][] array=new int[sparsearr[0][0]][sparsearr[0][1]];
		for(int i=1;i<sparsearr.length;i++) {
				array[sparsearr[i][0]][sparsearr[i][1]]=sparsearr[i][2];
		}
		
		for(int[] c:array) {
			for(int b:c) {
				System.out.print(b+" ");				
			}
			System.out.println();
		}
		
		
	}

}
