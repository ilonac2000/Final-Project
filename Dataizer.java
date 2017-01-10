import java.util.*; 
import java.io.*; 
public class Dataizer{

     

    
    public static void organize (String fileName){
     ArrayList<String> dates  = new ArrayList<String>();
  ArrayList<String> times  = new ArrayList<String>();
     ArrayList<String> city  = new ArrayList<String>();
    ArrayList<String> shape  = new ArrayList<String>();
  ArrayList<String> desc  = new ArrayList<String>();
    ArrayList<String> posted  = new ArrayList<String>();
        ArrayList<String> state  = new ArrayList<String>();




	 
    try{  Scanner sc = new Scanner(new File(fileName)).useDelimiter("\\s*delimit\\s*");
	try{  	while(sc.hasNext()){
		    dates.add((sc.next()));
		  city.add((sc.next()));
		   state.add((sc.next()));
		    shape.add((sc.next()));
		    times.add((sc.next()));
		    desc.add((sc.next()));
		    posted.add((sc.next()));
	    }}
	    catch(NoSuchElementException e){
	    }

    }

 catch (FileNotFoundException e){
        	System.out.println("File Does Not Exist");
        	System.exit(1);
 }
    //   String[][][][] data = new String[dates.size()][dates.size()[dates.size()[dates.size();
	  
									     
    }
    
  public static void main(String[]args){
      organize("UFOData.txt");

       }


    
}
