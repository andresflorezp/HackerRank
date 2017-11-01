import java.util.*;
import java.io.*;
public class Solution {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int casos = Integer.parseInt(in.readLine());
		ArrayList<Integer> L = new ArrayList();
		StringTokenizer st = new StringTokenizer(in.readLine());
		for(int i=0;i<casos;i++){
			L.add(Integer.parseInt(st.nextToken()));
	
			
		}
		int q = Integer.parseInt(in.readLine());
		for(int j=0;j<q;j++){
			String operacion= in.readLine();
			if(operacion.equals("Insert")){
				StringTokenizer stk = new StringTokenizer(in.readLine());
				int indice = Integer.parseInt(stk.nextToken());
				int x = Integer.parseInt(stk.nextToken());
				L.add(indice, x);
				
				
			}
			else{
				int indice = Integer.parseInt(in.readLine());
				L.remove(indice);
				
				
			}
			
			
			
			
		}
		for(int i=0;i<L.size();i++){
			System.out.print(L.get(i)+" ");
			
			
		}
		

	}

}
