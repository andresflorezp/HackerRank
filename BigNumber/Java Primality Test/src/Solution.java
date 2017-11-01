import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Solution {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BigInteger numero = new BigInteger(in.readLine());
		if(numero.isProbablePrime(20))System.out.println("prime");
		else System.out.println("not prime");
	}

}
