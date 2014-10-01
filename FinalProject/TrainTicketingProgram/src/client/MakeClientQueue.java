package client;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;


public class MakeClientQueue {
	public ArrayList<Client> clientQueue; 
	
	public MakeClientQueue() throws IOException
	{
		try{
			clientQueue = new ArrayList<Client>();
			
			FileInputStream fis = null;
			fis = new FileInputStream("ClientData.csv");
			BufferedInputStream bip = new BufferedInputStream(fis); 
			
			
			FileOutputStream fos = null;
			fos = new FileOutputStream("result1.csv");
			BufferedOutputStream bop = new BufferedOutputStream(fos);
			
			InputStreamReader fsr = null;
			fsr = new InputStreamReader(fis, "EUC-KR");
			BufferedReader br = new BufferedReader(fsr);
			
	
			String data = "";
		
			while((data = br.readLine()) != null)
			{
				StringTokenizer st = new StringTokenizer(data,",");
				String[] string = new String[10];
				int i = 0;
				Client client = new Client();
				
				while(st.hasMoreTokens())
				{
					string[i++] = st.nextToken();
				}
				
				client.setID(string[0]);
				client.setClientName(string[1]);
				client.setArrivalTime(string[2]);
				client.setTicketingTime(string[3]);
				client.setStartStation(string[4]);
				client.setArrivalStaion(string[5]);
			
				clientQueue.add(client);
			
				
	        }

			if(fsr != null) try{fsr.close();}catch(IOException e){}
			fis.close();
			fos.close();
				
			
		}catch(Exception e){
			e.printStackTrace();
		};
		

	}
}
