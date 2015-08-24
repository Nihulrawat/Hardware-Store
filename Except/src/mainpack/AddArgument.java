package mainpack;

public class AddArgument {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int sum = 0;
			for (String arg : args) {
				sum += Integer.parseInt(arg);
			}
			System.out.println("sum" + sum);
		} catch (NumberFormatException nfe) {
			System.err.println("one of the command line args not an integer");
		}
	}
}
