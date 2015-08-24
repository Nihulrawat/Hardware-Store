package arrpack;


	class Process{
		public int[] create(){
			int num[];
		     num=new int[10];
		     num[3]=6;
		     num[7]=9;
		     return num;
		}
		public void display(int [] src){
			for(int data:src){
				System.out.println(data);
				
			}
		}
	}
	public class MainApp {
		
	public static void main(String[] args) {
	System.out.println("Begin");
	Process p= new Process();
	int[] result= p.create();
	
	p.display(result);
	
    
	}

}
