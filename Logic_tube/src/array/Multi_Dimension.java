
package array;

import java.util.Scanner;

public class Multi_Dimension {

	public static void main(String[] args) {
		Multi_Dimension obj=new Multi_Dimension();
		//obj.multi();
		//obj.multi1();
		obj.multi2();//nested for loop 2 dimensional array
	}

	private void multi2() {
		
		
	}

	private void multi1() {
		int[][] player=new int[2][];
		player[0]=new int[4];
		System.out.println("Player[0] length is:"+player[0].length);
		int total=0;
	  Scanner sc=new Scanner(System.in);
	  for(int match=0;match<player[0].length;match++) {
		  System.out.println("Player[0] Enter Score:");
		  player[0][match]=sc.nextInt();
		  total+=player[0][match];
		  }
	  System.out.println("Player[0] total scores:"+total);
	  System.out.println("Player[0] avg is:"+total/player[0].length);
	  player[1]=new int[3];
	  total=0;
	  for(int match=0;match<player[1].length;match++) {
		  System.out.println("Player[1] Enter Score:");
		  player[1][match]=sc.nextInt();
		  total+=player[1][match];
		  }
	  System.out.println("Player[0] total scores:"+total);
	  System.out.println("Player[0] avg is:"+total/player[1].length);
	}

	private void multi() {
		int [][] scores= {{65,35,120,80},{35,68,110,90}};
		int player=0;
		while(player<2) {
			for(int match=0;match<4;match++) {
				System.out.print(scores[player][match]+" ");
			}
			System.out.println();
			player++;
		}
		
	}
	

}
