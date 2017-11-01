import java.util.*;
import java.io.*;
import java.math.BigDecimal;
public class Solution {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int caso = Integer.parseInt(in.readLine());
		BigDecimal [] V = new BigDecimal[caso];
		String [] B = new String[caso];
		for(int i=0;i<caso;i++){
			String linea = in.readLine();
			V[i]=new BigDecimal(linea);
			B[i]=linea;
	
		}
	for(int i=0;i<caso;i++){
		for(int j=0;j<caso-1;j++){
			if(V[j].compareTo(V[j+1])<0){
				BigDecimal temp = V[j];
				V[j]=V[j+1];
				V[j+1]=temp;
				String temp2 = B[j];
				B[j]=B[j+1];
				B[j+1]=temp2;
				
				
				
			}
			
			
			
			
		}
		
		
		
	}
	for(String b:B)System.out.println(b);
	}
	

}
