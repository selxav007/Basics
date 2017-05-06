
public class Array2 {

	public static void main(String[] args) {

		int row= 2;
		int col= 3;
		int table[][] = new int[row][col];
		table[0][0] = 10;
		table[0][1] = 20;
		table[0][2] = 30;
		table[1][0] = 40;
		table[1][1] = 50;
		table[1][2] = 60;
		System.out.println(table.length);
		System.out.println(table[0].length);
		for(int x=0;x<table.length;x++){
			for(int y=0;y<table[0].length;y++){
				System.out.print(" "+table[x][y]);
			}
			System.out.println(" ");
		}
	}
}
