package collection;

public class Mobile implements Comparable{
	 String brand; 
	  int price; 
	  public Mobile(String brand, int price) {
	    this.brand = brand;
	    this.price = price;
	  }
public String toString() {
	return this.brand+" "+this.price;
}
@Override
public int compareTo(Object o) {
    // TODO Auto-generated method stub
    int price2 = this.price; 
    String brand2 =this.brand;
    Mobile m1 = (Mobile) o;
    int price1 = m1.price; 
    String brand1 =this.brand;
    if(price1>price2)
      return -1234; 
    else if (price1<price2)
      return 5; 
    
    return 0;
  }

	
}

