package arrpack;
class Point2{ 
	int i,j;
	Point2(){
		
	}
	Point2(int x, int y)
	{
		i=x;
		j=y;
		
	}
		
		
	
}

 class Point1 {

		public Point2[] createAraay(){
			Point2[] p;
			p=new Point2[10];
			for(int i=0;i<10;i++)
			{
				p[i]= new Point2(i ,i+1);
			}
			return p;
		}
		
		
		public class Point{
			
		}
		
		public static void main(String [] args){
			Point1 p1[];
		Point1 p2= 	new Point1();
		p1= p2.createArray();
		
		
		for(Point2 ref:p1){
			System.out.println();
		}
		
	    
		
		}

	}


