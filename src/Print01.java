
public class Print01 {

	public static void main(String[] args) {
		System.out.println("Data Types");
		byte var_byte = 120;	
		System.out.println(var_byte + "   byte   -128 to 127");
		short var_short = 32000;
		System.out.println(var_short + "   short   -32768 to 32767");
		int var_int = 100000000;
		System.out.println(var_int + "   int    -2147483648 to 2147483647");
		long var_long = 1000000000000000L;
		System.out.println(var_long + "   long    -9223372036854775808 to 9223372036854775808");
		System.out.println("\n");
		float var_float = 123456.5674f;
		System.out.println(var_float + "   float    3.4e 038 to 3.4e 038");
		double var_double = 12e5d;
		System.out.println(var_double + "  Double ");
		boolean var_boolean = false;
		System.out.println(var_boolean + "  Boolean ");
		String var_string = "Test for String variable"; 
		System.out.println(var_string + "   String ");
		System.out.println(var_short < var_int);
		

	}

}
