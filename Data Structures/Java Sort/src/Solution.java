import java.util.*;
import java.io.*;
public class Solution {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int casos = Integer.parseInt(in.readLine());
		int[] ID = new int[casos];
		String[] NAME = new String[casos];
		double[] CGPA = new double[casos];
		for(int i=0;i<casos;i++){
			StringTokenizer st = new StringTokenizer(in.readLine());
			ID[i]=Integer.parseInt(st.nextToken());
			NAME[i]=st.nextToken();
			CGPA[i]=Double.parseDouble(st.nextToken());
		
		}
		for(int i=0;i<casos;i++){
			for(int j=0;j<casos-1;j++){
				if(CGPA[j]>CGPA[j+1]){
					String temp = NAME[j];
					NAME[j]=NAME[j+1];
					NAME[j+1]=temp;
					
					double temp2 = CGPA[j];
					CGPA[j]=CGPA[j+1];
					CGPA[j+1]=temp2;
					
					int temp3 = ID[j];
					ID[j]=ID[j+1];
					ID[j+1]=temp3;
				}
				else if(CGPA[j]==CGPA[j+1] && NAME[j].compareTo(NAME[j+1])<0){
					String temp = NAME[j];
					NAME[j]=NAME[j+1];
					NAME[j+1]=temp;
					
					double temp2 = CGPA[j];
					CGPA[j]=CGPA[j+1];
					CGPA[j+1]=temp2;
					
					int temp3 = ID[j];
					ID[j]=ID[j+1];
					ID[j+1]=temp3;
				}
				else if(CGPA[j]==CGPA[j+1] && NAME[j].compareTo(NAME[j+1])==0 && ID[j]<ID[j+1]){
					String temp = NAME[j];
					NAME[j]=NAME[j+1];
					NAME[j+1]=temp;
					
					double temp2 = CGPA[j];
					CGPA[j]=CGPA[j+1];
					CGPA[j+1]=temp2;
					
					int temp3 = ID[j];
					ID[j]=ID[j+1];
					ID[j+1]=temp3;
				}
				
				
				
			}
			
			
			
		}
		for(int i=casos-1;i>=0;i--)System.out.println(NAME[i]);
		
	}

}
