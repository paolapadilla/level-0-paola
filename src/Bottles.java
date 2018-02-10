
public class Bottles {

	public static void main(String[] args) {
		for(int i=99; i>0;i--) {
			if(i==2) {
				System.out.println(i+" bottles of beer on the wall, "+i+" bottles of beer");
				System.out.println("take one down pass it around, "+(i-1)+ " bottle of beer on the wall");
				System.out.println();
			}else if(i==1) {
				System.out.println(i+" bottle of beer on the wall, "+i+" bottle of beer");
				System.out.println("take one down pass it around, "+(i-1)+ " bottle of beer on the wall");
				System.out.println();
				
		
			}
			
			
			
			else {
			System.out.println(i+" bottles of beer on the wall, "+i+" bottles of beer");
			System.out.println("take one down pass it around, "+(i-1)+ " bottles of beer on the wall");
			System.out.println();
			}
		}

	}

}
