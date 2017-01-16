import java.util.*; 
import java.io.*; 
public class Dataizer{
     private static ArrayList<String> dates  = new ArrayList<String>();
  private static ArrayList<String> city  = new ArrayList<String>();
private static     ArrayList<String> state  = new ArrayList<String>();
 private static   ArrayList<String> shape  = new ArrayList<String>();
private static  ArrayList<String> times  = new ArrayList<String>();
    private static ArrayList<String> desc  = new ArrayList<String>();
       private static ArrayList<String> posted  = new ArrayList<String>();

     

    
    public static void organize (String fileName){




	 
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
      //      System.out.println( Arrays.toString(dates.toArray()));

      //  System.out.println( Arrays.toString(city.toArray()));
      System.out.println( Arrays.toString(state.toArray()));
      //	  System.out.println( Arrays.toString(shape.toArray()));
            //System.out.println( Arrays.toString(times.toArray()));
      //   System.out.println( Arrays.toString(desc.toArray()));
      
      //	    System.out.println( Arrays.toString(posted.toArray()));
       }


    
}
