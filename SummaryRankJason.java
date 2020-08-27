import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.util.*;
import java.util.regex.*;


public class SummaryRankJason {

public static void main(String[] args)
{
    
	
    String filePath = "E:\\TaggedEUADR.txt";
    
	
    BufferedReader br; String line = "";
	    String split= "";
		
	
	
	int count=0;
	 ArrayList<String> list = new ArrayList<String>();
	System.out.println("{"+"\n"+" +queries+ : [ ");

    try {    br = new BufferedReader(new FileReader(filePath));
		
		

   try {       while((line = br.readLine()) != null)        {            
				
				count++;
					
				line=line.replace("<GENE>"," ");
				line=line.replace("</GENE>"," ");
				line=line.replace("<DISEASE>"," ");
				line=line.replace("</DISEASE>"," ");
				System.out.println("  { +number+ : +"+count+"+, +text+ :  +"+line+"+},");
				
				
				
						
			}     			
																		
												
					 br.close();

				}									       
		
		   catch (IOException e) {       // TODO Auto-generated catch block       e.printStackTrace();
								}
		
   
    
    } catch (FileNotFoundException e) {   // TODO Auto-generated catch block   e.printStackTrace();
									  }

}
}