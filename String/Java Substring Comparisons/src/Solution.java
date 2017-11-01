import java.util.*;
import java.io.*;
public class Solution {
	static ArrayList<String> L= new ArrayList();
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String linea = in.readLine();
		int k = Integer.parseInt(in.readLine());
		for(int i=0;i<linea.length()-(k-1);i++){
			L.add(linea.substring(i, i+k));
			
			
		}

		String Menor=L.get(0);
		String Mayor=L.get(0);
		for(int i=0;i<L.size();i++){
			if(Mayor.compareTo(L.get(i))<0)Mayor=L.get(i);
			if(Menor.compareTo(L.get(i))>0)Menor=L.get(i);
			
			
			
			
		}
		System.out.println(Menor);
		System.out.println(Mayor);
		
		
		
	}

}
