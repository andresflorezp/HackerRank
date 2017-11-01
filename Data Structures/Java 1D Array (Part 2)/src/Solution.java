import java.util.*;
import java.io.*;
public class Solution {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pr = new PrintWriter(System.out);
		int caso = Integer.parseInt(in.readLine());
		for(int i=0;i<caso;i++){
			StringTokenizer st = new StringTokenizer(in.readLine());
			int q=Integer.parseInt(st.nextToken());
			int leap =Integer.parseInt(st.nextToken());
			StringTokenizer stk = new StringTokenizer(in.readLine());
			int M[] = new int[q];
			for(int j=0;j<q;j++){
				M[j]=Integer.parseInt(stk.nextToken());
				
				
			}
			pr.println(isSolvable(leap,M,0)?"YES":"NO");
			
			
			
			
		}
		pr.close();
	}
	private static boolean isSolvable(int m, int[] arr, int i) {
	    if (i < 0 || arr[i] == 1) return false;
	    if ((i == arr.length - 1) || i + m > arr.length - 1) return true;

	    arr[i] = 1;
	    return isSolvable(m, arr, i + 1) || isSolvable(m, arr, i - 1) || isSolvable(m, arr, i + m);
	}

}
