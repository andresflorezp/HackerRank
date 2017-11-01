import java.util.*;
import java.io.*;
public class Solution {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		if((n%2==0 && n>=2 && n<=5) || (n%2==0 && n>20))System.out.println("Not Weird");
		else System.out.println("Weird");

	}

}
