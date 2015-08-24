package arrpack;

class Process2{
	public int[][][] create(){
		int num[][][];
	     num=new int[5][3][2];
	     num[1][1][1]=5;
	   
	     return num;
	}
	public void display(int[][][] src){
		
		for(int[][] data:src){
			for(int[] ref:data){
			for(int val:ref)
			System.out.print(val);
		}
			System.out.println();
	}
		
}
	
}
public class MultidimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Begin");
Process2 p= new Process2();
int[][][] result= p.create();

p.display(result);


	}

}
