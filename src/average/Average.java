package average;


public class Average {
	
	public static void main(String[] args) {
		
		int average = 0;
		
		if(args.length == 0){
			System.out.println("No arguments");
		}
		else{
			System.out.print("Arguments:");
			for(int i = 0;i < args.length;i++){
				System.out.print(" " + args[i]);
				average += Integer.parseInt(args[i]);
			}
			average /= args.length;
			System.out.println("\nAverage: " + average);
		}
	}
}
