import java.util.*;
import java.io.*;
public class Solution {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("================================");
        for(int i=0;i<3;i++){
        	StringTokenizer st = new StringTokenizer(in.readLine());
        	String C = st.nextToken();
        	String V = st.nextToken();
        	System.out.printf("%-15s%03d%n", C, Integer.parseInt(V));
          
        }
        System.out.println("================================");

	}

}
