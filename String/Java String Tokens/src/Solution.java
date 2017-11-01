import java.util.*;
import java.io.*;
public class Solution {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String linea = in.readLine();
		linea = linea.replaceAll("[^a-z A-Z]", " ");
		StringTokenizer st = new StringTokenizer(linea);
		ArrayList<String> M = new ArrayList();
		while(st.hasMoreTokens()){
			M.add(st.nextToken());
			
			
		}
		System.out.println(M.size());
		for(String b:M)System.out.println(b);

	}

}
