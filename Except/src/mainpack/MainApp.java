package mainpack;

class IllegalAgeEception extends Exception{
	public String getMessage(){
		return "you are not eligible to register";
	}
}
class Vote{
	
	public void register (int age) throws IllegalAgeEception {
		if(age<18){
			throw new IllegalAgeEception();
			
		}
		System.out.println(" you are eligible to register");
	}
}

public class MainApp {
public static void main(String[] args){
	Vote vote=new Vote();
	try{
	vote.register(16);
}
 catch(IllegalAgeEception e){
	System.out.println(e.getMessage());
}
}

}
 