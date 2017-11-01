import java.util.*;
import java.io.*;
public class Solution {
	static int[] dx={-1,0,-1,-1,1,1,1};
	static int[] dy={0,0,-1,1,0,1,-1};
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int[][] M = new int[6][6];
		for(int i=0;i<6;i++){
			StringTokenizer st = new StringTokenizer(in.readLine());
			for(int j=0;j<6;j++){
				M[i][j]=Integer.parseInt(st.nextToken());
		
			}
		}
		int sumaM=Integer.MIN_VALUE;
		for(int i=1;i<5;i++){
			for(int j=1;j<5;j++){
				int sumaP=0;
				for(int h=0;h<7;h++){
					sumaP+=M[i+dx[h]][j+dy[h]];
					
					
				}
				if(sumaP>sumaM)sumaM=sumaP;
				
				
				
				
			}
			
			
		}
		System.out.println(sumaM);
	}

}
