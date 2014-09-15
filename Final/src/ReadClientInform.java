
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class ReadClientInform {
	public static void main(String args[]) throws IOException{
		FileInputStream fis = null;
		fis = new FileInputStream("cuatomer_out_priorityqueue.csv");
		BufferedInputStream bip = new BufferedInputStream(fis); 
		
		Queue clientQ = new LinkedList();
		
		FileOutputStream fos = null;
		fos = new FileOutputStream("result1.csv");
		BufferedOutputStream bop = new BufferedOutputStream(fos);
		
		InputStreamReader fsr = null;
		fsr = new InputStreamReader(fis, "EUC-KR");
		BufferedReader br = new BufferedReader(fsr);
		

		String data = "";
	
		while((data = br.readLine()) != null){
			StringTokenizer st = new StringTokenizer(data,",");
			String[] string = new String[10];
			int i = 0;
			while(st.hasMoreTokens()){
				string[i++] = st.nextToken();
			}
			
			clientQ.add(new Client(string[0],string[1],string[2],string[3],string[4],string[5]));
        }
		
		//testCode
		while(!clientQ.isEmpty()){
		System.out.println(clientQ.poll().toString());
		}
		
		
		
		
		if(fsr != null) try{fsr.close();}catch(IOException e){}
		fis.close();
		fos.close();
		
		
		
	}
}
