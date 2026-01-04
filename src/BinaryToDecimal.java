public class BinaryToDecimal {
    public static void main(String[] args) {
		int a=1010;
		int power =0;
		int decimal=0;
		for(int i=a-1;i>=0;i--) {
		int lastdigit=a%10;
		decimal +=lastdigit *Math.pow(2, power);
		power++;
		a=a/10;
		}
		
		 System.out.println(decimal);
			
	}
    
}
