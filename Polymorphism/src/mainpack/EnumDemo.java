package mainpack;

enum Apple
{
	Jonathan(10), GopldenDel(9), RedDel(12), Winesap(8), Cortland(10);
	private int price;
	Apple(int p){
		price=p;
	}
int getPrice(){
		return price;
		}
	}

 public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Apple ap;
System.out.println("Winesap costs" + Apple.Winesap.getPrice()+ "cents.n");

System.out.println("All apple prices");
for(Apple a: Apple.values())
	System.out.println(a+ "costs" + a.getPrice() + "cents.");
	}

}
      