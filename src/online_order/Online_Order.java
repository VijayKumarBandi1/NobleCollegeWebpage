package online_order;

public class Online_Order {
	public static void main(String[] args){
		Online_Order2 obj=new Online_Order2();
		obj.clothe();
		obj.phone(10000,"black","opo");
		obj.phone(15000,"blue","vivo","S1pro");
	}
}
	class Online_Order1{
void clothe() {
	int size=28;
	String colour="red";
	System.out.println(size+" "+colour);
}
void phone(int price,String colour,String company) {
	System.out.println(price+" "+colour+" "+company);
}
void phone(int price,String colour,String company,String model) {
	System.out.println(price+" "+colour+" "+company+" "+model);
}

	}
class Online_Order2 extends Online_Order1{
	void clothe() {
		int size=32;
	String	colour="black";
		System.out.println(size+" "+colour);
		
	}
	

}
