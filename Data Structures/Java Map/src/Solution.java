import java.util.*;
import java.io.*;
public class Solution {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String,String> DIC = new HashMap();
		int casos = Integer.parseInt(in.readLine());
		for(int i=0;i<casos;i++){
			String name = in.readLine();
			String telefono= in.readLine();
			DIC.put(name, telefono);
		
		}
		for(;;){
			String q = in.readLine();
			if(q==null)break;
			if(DIC.get(q)==null)System.out.println("Not found");
			else System.out.println(q+"="+DIC.get(q));
			
			
			
		}
	}

}
