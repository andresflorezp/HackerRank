import java.util.*;
import java.io.*;
import java.math.*;
public class Solution {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(;;){
			String linea = in.readLine();
			if(linea==null)break;
			StringTokenizer st = new StringTokenizer(linea);
			int n = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			if(n==0 && p==0){
				throw new Exception("n and p should not be zero.");
				
				
			}
			if(n<0 || p<0){
				throw new Exception("n or p should not be negative.");
				
				
			}
			else{
				System.out.println(Math.pow(n, p));
				
			}
			
		}
	}

}
