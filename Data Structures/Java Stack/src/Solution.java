import java.util.*;
import java.io.*;
public class Solution {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(;;){
			String linea = in.readLine();
			
			if(linea==null)break;
			Stack<Character> pila = new Stack();
			if(linea.length()==0)System.out.println(true);
			else System.out.println(f(pila,linea));
			
			
			
		}

	}
	static boolean f(Stack<Character> L,String linea){
		for(int i=0;i<linea.length();i++){
			if(linea.charAt(i)=='{'){
				L.push(linea.charAt(i));
				
			}
			else if(linea.charAt(i)=='['){
				L.push(linea.charAt(i));
				
			}
			else if(linea.charAt(i)=='('){
				L.push(linea.charAt(i));
				
			}
			else if(linea.charAt(i)==')'){
				L.push(linea.charAt(i));
				for(;;){
					
					char val =L.pop();
					if(L.isEmpty() && val!='(' )return false;
					if(val=='('){
						break;
						
					}
					
					
				}
				
				
				
			}
			else if(linea.charAt(i)=='}'){
				L.push(linea.charAt(i));
				for(;;){
					
					char val =L.pop();
					if(L.isEmpty() && val!='{' )return false;
					if(val=='{'){
						break;
						
					}
					
					
				}
				
				
				
			}
			else if(linea.charAt(i)==']'){
				L.push(linea.charAt(i));
				for(;;){
				
				char val =L.pop();
				if(L.isEmpty() && val!='[' )return false;
					if(val=='['){
						break;
						
					}
					
					
				}
				
				
				
			}
			
			
		}
		if(L.size()==0)return true;
		else return false;
		
		
		
		
	}

}
