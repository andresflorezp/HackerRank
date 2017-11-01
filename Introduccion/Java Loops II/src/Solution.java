import java.util.*;
import java.io.*;
public class Solution {
	
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for(int i=0;i<T;i++){
			StringTokenizer st = new StringTokenizer(in.readLine());
			int a= Integer.parseInt(st.nextToken());
			int b= Integer.parseInt(st.nextToken());
			int N= Integer.parseInt(st.nextToken());
			
			int total = (int) (a+(Math.pow(2, 0)*b));
			System.out.print(total+" ");
			for(int j=1;j<N;j++){
				total+=(Math.pow(2, j)*b);
				System.out.print(total+" ");
				
				
				
			}
			System.out.print("\n");
			
			
			
		}

	}

}
