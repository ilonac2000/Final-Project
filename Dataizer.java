import java.util.*; 
import java.io.*; 
public class Dataizer{

    //public string[][][][][][]data;
   
     public ArrayList<String> times  = new ArrayList<String>();
     public ArrayList<String> places  = new ArrayList<String>();
     public ArrayList<String> shape  = new ArrayList<String>();
    public static void organize (String fileName){
        ArrayList<String> dates  = new ArrayList<String>();
    try {  Scanner sc = new Scanner(new File(fileName)).useDelimiter("</TR>");
      		while(sc.hasNextLine()){
		    dates.add((sc.nextLine()).substring(102,111));      
		}}
    catch (FileNotFoundException e){
        	System.out.println("File Does Not Exist");
        	System.exit(1); } 
    }
  public static void main(String[]args){
      organize("UFOData.txt");}


    
}
