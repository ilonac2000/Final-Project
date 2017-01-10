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
	try{  	while(sc.hasNextLine()){
		    dates.add((sc.nextLine()));
		  city.add((sc.nextLine()));
		   state.add((sc.nextLine()));
		    shape.add((sc.nextLine()));
		    times.add((sc.nextLine()));
		    desc.add((sc.nextLine()));
		    posted.add((sc.nextLine()));
	    }}
	    catch(NoSuchElementException e){
	    }

    }

 catch (FileNotFoundException e){
        	System.out.println("File Does Not Exist");
        	System.exit(1);
 }
    }
    
  public static void main(String[]args){
      organize("UFOData.txt");
      // System.out.println(Arrays.toString(places));
       }


    
}
