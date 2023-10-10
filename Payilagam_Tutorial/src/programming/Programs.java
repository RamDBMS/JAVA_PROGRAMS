package programming;

public class Programs {

	public static void main(String[] args) {
		Programs obj=new Programs();
		//obj.Swap_Two();
		//obj.Swap_Two();
		//obj.puzzle1();
		obj.puzzle2();

	}
	public void Swap_Two() {
		int no1=5;
		int no2=6;
		int temp=no1;
		no1=no2;
		no2=temp;
		System.out.println(no1);
		System.out.println(no2);
	}
	public void SwapTwo() {
		int no1=5;
		int no2=6;
		no1=no1+no2;
		no2=no1-no2;
		no1=no1-no2;
		System.out.println(no1);
		System.out.println(no2);	
	}
	public void puzzle1() {
		int beat=1024;
		int security=0;
		while(beat>1) {
			beat=beat/2;
			security++;
			System.out.println("Beat is:"+beat);
		}
			System.out.println(security);
	}
	public void puzzle2() {
		int temple=7;
		int flower=1;
		while(temple>=1) {
			flower=flower*2;
			temple--;
			System.out.println("Flower is:"+flower);
		}
		System.out.println(flower);
	}

}
