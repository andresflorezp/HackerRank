import java.util.*;
import java.util.Map.Entry;
import java.io.*;
public class Main {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Character,Integer> dic = new HashMap();
		HashMap<Character,Integer> dic2 = new HashMap();
		String linea1 = in.readLine();
		linea1 = linea1.toLowerCase();
		String linea2 = in.readLine();
		linea2 = linea2.toLowerCase();
		for(int i=0;i<linea1.length();i++){
			if(!dic.containsKey(linea1.charAt(i))){
				dic.put(linea1.charAt(i), 1);
			}
			
			if(dic.containsKey(linea1.charAt(i))){
				int temp =dic.get(linea1.charAt(i));
				dic.put(linea1.charAt(i), temp+1);
			}
			
			
			
			
		}
		for(int j=0;j<linea2.length();j++){
			if(!dic2.containsKey(linea2.charAt(j))){
				dic2.put(linea2.charAt(j), 1);
			}
			if(dic2.containsKey(linea2.charAt(j))){
				int temp =dic2.get(linea2.charAt(j));
				dic2.put(linea2.charAt(j), temp+1);
			}
			
			
			
		}
		
		boolean flag =true;
		for(Character key: dic.keySet()){
			if(linea1.length()!=linea2.length()){
				flag=false;
				break;
			}
				
			if(!dic2.containsKey(key) || dic.get(key)!=dic2.get(key)){
				flag=false;
				break;
				
				
			}
			
			
			
		}
		System.out.println(flag);
		

	}

}
