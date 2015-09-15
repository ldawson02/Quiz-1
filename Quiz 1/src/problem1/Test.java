package problem1;

public class Test {
	public static void main(String[] args){
		 double x = Math.PI;
		 x = Math.floor(x * 10000000000.0) / 10000000000.0;
		 System.out.println(x);
		 String y = Long.toBinaryString(Double.doubleToRawLongBits(x));
		 System.out.print(y);
		 
	}

}
