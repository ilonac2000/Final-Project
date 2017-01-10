import java.util.*; 
import java.io.*; 
public class Dataizer{

    //public string[][][][][][]data;
    public ArrayList<String> dates  = new ArrayList<String>();
     public ArrayList<String> times  = new ArrayList<String>();
     public ArrayList<String> places  = new ArrayList<String>();
     public ArrayList<String> shape  = new ArrayList<String>();
    public void organize (String fileName){
     Scanner sc = new Scanner(new File(fileName)).useDelimiter("</TR>");
      		while(sc.hasNextLine()){
		    dates.add((sc.nextLine()).substring(102,11));      
		}
    }

  public static void main(String[]args){
      organize(UfoData.txt);}


    
}
