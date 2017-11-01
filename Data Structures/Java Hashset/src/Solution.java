import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;
public class Solution {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int casos = Integer.parseInt(in.readLine());
		HashSet<String> dic = new HashSet();
		for(int i=0;i<casos;i++){
			String re = "";
			StringTokenizer st = new StringTokenizer(in.readLine());
			re+=st.nextToken();
			re+=st.nextToken();
			
			dic.add(re);
			System.out.println(dic.size());
			
			
			
		}

	}

}
