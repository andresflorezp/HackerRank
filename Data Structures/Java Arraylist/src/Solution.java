import java.util.*;
import java.io.*;
public class Solution {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<ArrayList<Integer>> T =  new ArrayList();
		int casos = Integer.parseInt(in.readLine());
		for(int i=0;i<casos;i++){
			StringTokenizer st = new StringTokenizer(in.readLine());
			int cas=Integer.parseInt(st.nextToken());
			ArrayList<Integer> V = new ArrayList();
			for(int j=0;j<cas;j++){
				V.add(Integer.parseInt(st.nextToken()));
			
			}
			T.add(V);
			
			
			
			
		}
		int consult = Integer.parseInt(in.readLine());
		for(int i=0;i<consult;i++){
			StringTokenizer stk = new StringTokenizer(in.readLine());
			int dx = Integer.parseInt(stk.nextToken());
			int dy = Integer.parseInt(stk.nextToken());
			try{
				
				System.out.println(T.get(dx-1).get(dy-1));
				
			}
			catch(Exception ex){
				
				System.out.println("ERROR!");
				
				
			}
			
		}
		
	}
	

}
