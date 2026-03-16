public class Multi_Dimensional_Array{
	public static void main(String[] args){
		
		int[][] num = {{9,10,4,6,2},{4,0,5,2,1},{12,9,3,8,6}};
		
		for(int row = 0; row < 3; row++){
			for(int col = 0; col < 5; col++){
				System.out.printf("%d%n",num[row][col]);
			}
		}
		
		System.out.println("Using Enhanced For Loop");
		for(int[] row : num){
			for(int col : row){
				System.out.printf("%d%n",col);
			}
		}
		
		System.out.println("Using Tabular Format");
		for(int row = 0; row < 1; row++){
			for(int col = 0; col < 5; col++){
				System.out.printf("%4d ",num[row][col]);
			}
		}
		System.out.println("");
		for(int row = 1; row < 2; row++){
			for(int col = 0; col < 5; col++){
				System.out.printf("%4d ",num[row][col]);
			}
		}
		System.out.println("");
		for(int row = 2; row < 3; row++){
			for(int col = 0; col < 5; col++){
				System.out.printf("%4d ",num[row][col]);
			}
		}
	}
}