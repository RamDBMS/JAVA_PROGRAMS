
package learn_typecasting;

public class Engineer extends Student {

	public static void main(String[] args) {
		//Engineer eng=new Engineer();
		//eng.doproject();
		//eng.study();
        
		//Student stud=(Student)eng; //UPcasting or widen casting
		//stud.study();
		
		Student s=new Engineer();
		Engineer eng=(Engineer)s; //down casting
		eng.study();
		eng.doproject();
	}

	public void doproject() {
		System.out.println("project");
		
	}
	public void study() {
		System.out.println("studing");
	}

}
