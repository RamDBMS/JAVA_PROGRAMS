package conditional_statement;

public class If_Condition1 {
	
	public static void main(String[] args) {
		If_Condition1 ip1=new If_Condition1();
		ip1.t20(100,90);
		ip1.tri_series(250,150,350);
		
	}

	private void t20(int team1,int team2) {
		//int india=90;
		//int pakistan=90;
		if(team1>team2)
		{
			System.out.println("team1 won the match");
		}
		else if(team2>team1)
		{
			System.out.println("team2 won the match");
		}
		else if(team1==team2)
		{
			System.out.println("match tie");
		}
		
		
	}
	private void tri_series(int ind,int pak,int aus)
	{
		if(ind>pak) {
			if(ind>aus) {
			System.out.println("ind win"); //1
		}else if(aus>ind) {
			System.out.println("aus win"); //2
		}else {
			System.out.println("ind and aus won"); //4
		}
		}
			else if(pak>ind) {
				if(pak>aus) {
					System.out.println("pak win"); //3
				}else if(aus>pak) {
					System.out.println("aus win");
				}else {
					System.out.println("aus,pak"); //5
				}
			}else if(ind>aus && pak>aus) {
			System.out.println("pak,ind"); //6
		}else if(aus>pak && aus>ind) {
			System.out.println("aus");
		}else {
			System.out.println("aus,ind,pak"); //7
		}
	}

}

