import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String linea = in.readLine();
		StringBuilder constru = new StringBuilder(linea);
		
		System.out.println(linea.equals(constru.reverse().toString())?"Yes":"No");
	}

}
