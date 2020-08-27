import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.util.*;
import java.util.regex.*;


public class SummaryRankRaw {

public static void main(String[] args)
{
    
	
    String filePath = "E:\\TaggedEUADR.txt";
    
	
    BufferedReader br; String line = "";
	    String split= "";
		
	
	
	int count=0;
	 ArrayList<String> list = new ArrayList<String>();
	

    try {    br = new BufferedReader(new FileReader(filePath));
		
		

   try {       while((line = br.readLine()) != null)        {            
				
				count++;
				String gene="";
				String disease="";
				String des="Describes the functional association between";
				Pattern re = Pattern.compile("<GENE>(.*?)</GENE>");
								Matcher reMatcher = re.matcher(line);
								while(reMatcher.find()) {
			                              
							  gene=reMatcher.group(1).trim();
								}
								Pattern res = Pattern.compile("<DISEASE>(.*?)</DISEASE>");
								Matcher reMatchers = res.matcher(line);
								while(reMatchers.find()) {
			                              
							    disease=reMatchers.group(1).trim();
														 }
				des=des+" "+gene+" and "+" "+disease;			
				line=line.replace("<GENE>"," ");
				line=line.replace("</GENE>"," ");
				line=line.replace("<DISEASE>"," ");
				line=line.replace("</DISEASE>"," ");
				System.out.println("<query>"+"\n"+"\t"+"<title>");
				System.out.println("\t\t"+"<docno>"+"DOCNO"+count+"</docno>.");
				System.out.println("\t\t"+"<tag>"+line+"</tag>");
				System.out.println("\t</title>");
				System.out.println("\t"+"<desc>");
				System.out.println("\t\t"+"<docno>"+"DOCNO"+count+"</docno>.");
				System.out.println("\t\t"+"<tag>"+des+"</tag>");
				System.out.println("\t"+"</desc>");
				System.out.println("</query>");
				
				
						
			}     			
																		
												
					 br.close();

				}									       
		
		   catch (IOException e) {       // TODO Auto-generated catch block       e.printStackTrace();
								}
		
   
    
    } catch (FileNotFoundException e) {   // TODO Auto-generated catch block   e.printStackTrace();
									  }

}
}