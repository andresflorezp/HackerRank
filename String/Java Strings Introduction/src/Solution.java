import java.util.*;
import java.io.*;
public class Solution {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String linea1 = in.readLine();
		String linea2 = in.readLine();
		System.out.println(linea1.length()+linea2.length());
		System.out.println(linea1.compareTo(linea2)>0?"Yes":"No");
		System.out.println(Character.toUpperCase(linea1.charAt(0))+linea1.substring(1)+" "+Character.toUpperCase(linea2.charAt(0))+linea2.substring(1));
	}

}
