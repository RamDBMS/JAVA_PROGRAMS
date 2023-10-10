package looping;

public class Prime {

	public static void main(String[] args) {
		int no = 13;
		int div =2;
		int count  =0;
		
		while(div<=no/2) {
			if(no%div==0)
			{
				System.out.println("NOT A PRIME");
				count++;
				break;
			}
			div++;
		}
		if(count==0) {
			System.out.println("prime");
		}

	}

}

