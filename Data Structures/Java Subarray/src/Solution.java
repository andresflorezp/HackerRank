import java.util.*;
import java.io.*;
public class Solution {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		int M[] = new int[T];
		ArrayList<Integer> K= new ArrayList();
		StringTokenizer st = new StringTokenizer(in.readLine());
		for(int i=0;i<T;i++){
			M[i]=Integer.parseInt(st.nextToken());
	
		}
		int  suma=0;
		for(int i=0;i<M.length;i++){
			for(int j=i;j<M.length;j++){
				suma +=M[j];
				
				K.add(suma);
				
				
			}
			suma=0;
			
			
			
		}
		int total=0;
		for(int b:K){
			if(b<0)total++;
			
		}
		System.out.println(total);
	}

}
