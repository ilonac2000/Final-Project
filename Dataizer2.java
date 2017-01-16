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
    public static String [][]  stateCount = new String [50][2];
    
     

    
  public static void organize (String fileName){




   
    try{  Scanner sc = new Scanner(new File(fileName)).useDelimiter("\\s*delimit\\s*");
  try{    while(sc.hasNext()){
        desc.add((sc.next()));
      posted.add((sc.next()));
       dates.add((sc.next()));
        city.add((sc.next()));
        state.add((sc.next()));
        shape.add((sc.next()));
        times.add((sc.next()));
      }}
      catch(NoSuchElementException e){
      }

    }

 catch (FileNotFoundException e){
          System.out.println("File Does Not Exist");
          System.exit(1);
 }
  
    
                       
    }
      public static void countState (){
    //Alabama 1
     stateCount [0][0] = "Alabama";
     stateCount [0][1] = String.valueOf(Collections.frequency(state, "AL"));
      //Alaska 2 
     stateCount [1][0] = "Alaska";
     stateCount [1][1] = String.valueOf(Collections.frequency(state, "ALK"));
      //Arizona 3
     stateCount [2][0] = "Arizona";
     stateCount [2][1] = String.valueOf(Collections.frequency(state, "AK"));
      //Arkansas 4
     stateCount [3][0] = "Arkansas";
     stateCount [3][1] = String.valueOf(Collections.frequency(state, "AR"));
      //California 5
     stateCount [4][0] = "California";
     stateCount [4][1] = String.valueOf(Collections.frequency(state, "CA"));
      //Colorado 6
     stateCount [5][0] = "Colorado";
     stateCount [5][1] = String.valueOf(Collections.frequency(state, "CO"));
      //Connecticut 7
     stateCount [6][0] = "Connecticut";
     stateCount [6][1] = String.valueOf(Collections.frequency(state, "CT"));
      //Deleware 8
     stateCount [7][0] = "Deleware";
     stateCount [7][1] = String.valueOf(Collections.frequency(state, "DE"));
      //Florida 9
     stateCount [8][0] = "Florida";
     stateCount [8][1] = String.valueOf(Collections.frequency(state, "FL"));
      //Georgia 10 
     stateCount [9][0] = "Georgia";
     stateCount [9][1] = String.valueOf(Collections.frequency(state, "GA"));
      //Hawaii 11
     stateCount [10][0] = "Hawaii";
     stateCount [10][1] = String.valueOf(Collections.frequency(state, "HI"));
      //Idaho 12
     stateCount [11][0] = "Idaho";
     stateCount [11][1] = String.valueOf(Collections.frequency(state, "ID"));
      //Illinois 13
     stateCount [12][0] = "Illonois";
     stateCount [12][1] = String.valueOf(Collections.frequency(state, "IL"));
     //Indiana 14
     stateCount [13][0] = "Indiana";
     stateCount [13][1] = String.valueOf(Collections.frequency(state, "IN"));
      //Iowa 15
     stateCount [14][0] = "Iowa";
     stateCount [14][1] = String.valueOf(Collections.frequency(state, "IA"));
      //Kansas 16
     stateCount [15][0] = "Kansas";
     stateCount [15][1] = String.valueOf(Collections.frequency(state, "KS"));
      //Kentucky 17
     stateCount [16][0] = "Kentucky";
     stateCount [16][1] = String.valueOf(Collections.frequency(state, "KY"));
      //Louisiana 18
     stateCount [17][0] = "Louisiana";
     stateCount [17][1] = String.valueOf(Collections.frequency(state, "LA"));
      //Maine 19
     stateCount [18][0] = "Maine";
     stateCount [18][1] = String.valueOf(Collections.frequency(state, "ME"));
      //Maryland 20
     stateCount [19][0] = "Maryland";
     stateCount [19][1] = String.valueOf(Collections.frequency(state, "MD"));
      //Massachusetts 21
     stateCount [20][0] = "Massachusetts";
     stateCount [20][1] = String.valueOf(Collections.frequency(state, "MA"));
      //Michigan 22
     stateCount [21][0] = "Michigan";
     stateCount [21][1] = String.valueOf(Collections.frequency(state, "MI"));
      //Minnesota 23
     stateCount [22][0] = "Minnesota";
     stateCount [22][1] = String.valueOf(Collections.frequency(state, "MN"));
      //Mississippi 24
     stateCount [23][0] = "Mississippi";
     stateCount [23][1] = String.valueOf(Collections.frequency(state, "MS"));
      //Missouri 25
     stateCount [24][0] = "Missouri";
     stateCount [24][1] = String.valueOf(Collections.frequency(state, "MO"));
      //Montana 26
     stateCount [25][0] = "Montana";
     stateCount [25][1] = String.valueOf(Collections.frequency(state, "MT"));
      //Nebraska 27
     stateCount [26][0] = "Nebraska";
     stateCount [26][1] = String.valueOf(Collections.frequency(state, "NE"));
      //Nevada 28
     stateCount [27][0] = "Nevada";
     stateCount [27][1] = String.valueOf(Collections.frequency(state, "NV"));
      //New Hampshire 29
     stateCount [28][0] = "New Hampshire";
     stateCount [28][1] = String.valueOf(Collections.frequency(state, "NH"));
      //New Jersey 30
     stateCount [29][0] = "New Jersey";
     stateCount [29][1] = String.valueOf(Collections.frequency(state, "NJ"));
      //New Mexico 31
     stateCount [30][0] = "New Mexico";
     stateCount [30][1] = String.valueOf(Collections.frequency(state, "NM"));
      //New York 32
     stateCount [31][0] = "New York";
     stateCount [31][1] = String.valueOf(Collections.frequency(state, "NY"));
      //North Carolina 33
     stateCount [32][0] = "North Carolina";
     stateCount [32][1] = String.valueOf(Collections.frequency(state, "NC"));
      //North Dakota 34
     stateCount [33][0] = "North Dakota";
     stateCount [33][1] = String.valueOf(Collections.frequency(state, "ND"));
      //Ohio 35
     stateCount [34][0] = "Ohio";
     stateCount [34][1] = String.valueOf(Collections.frequency(state, "OH"));
      //Oklahoma 36
     stateCount [35][0] = "Oklahoma";
     stateCount [35][1] = String.valueOf(Collections.frequency(state, "OK"));
      //Oregon 37
     stateCount [36][0] = "Oregon";
     stateCount [36][1] = String.valueOf(Collections.frequency(state, "OR"));
      //Pennsylvania 38
     stateCount [37][0] = "Pennsylvania";
     stateCount [37][1] = String.valueOf(Collections.frequency(state, "PA"));
      //Rhode Island 39
     stateCount [38][0] = "Rhode Island";
     stateCount [38][1] = String.valueOf(Collections.frequency(state, "RI"));
      //South Carolina 40
     stateCount [39][0] = "South Carolina";
     stateCount [39][1] = String.valueOf(Collections.frequency(state, "SC"));
      //South Dakota 41
     stateCount [40][0] = "South Dakota";
     stateCount [40][1] = String.valueOf(Collections.frequency(state, "SD"));
      //Tennessee 42
     stateCount [41][0] = "Tennessee";
     stateCount [41][1] = String.valueOf(Collections.frequency(state, "TN"));
      //Texas 43
     stateCount [42][0] = "Texas";
     stateCount [42][1] = String.valueOf(Collections.frequency(state, "TX"));
      //Utah 44
     stateCount [43][0] = "Utah";
     stateCount [43][1] = String.valueOf(Collections.frequency(state, "UT"));
      //Vermont 45
     stateCount [44][0] = "Vermont";
     stateCount [44][1] = String.valueOf(Collections.frequency(state, "VT"));
        //Virgina 46
     stateCount [45][0] = "Virginia";
     stateCount [45][1] = String.valueOf(Collections.frequency(state, "VA"));
          //Washington 47
     stateCount [46][0] = "Washington";
     stateCount [46][1] = String.valueOf(Collections.frequency(state, "WA"));
          //West Virginia 48
     stateCount [47][0] = "West Virginia";
     stateCount [47][1] = String.valueOf(Collections.frequency(state, "WV"));
          //Wisconsin 49
     stateCount [48][0] = "Wisconsin";
     stateCount [48][1] = String.valueOf(Collections.frequency(state, "WI"));
          //Wyoming 50
     stateCount [49][0] = "Wyoming";
     stateCount [49][1] = String.valueOf(Collections.frequency(state, "WY"));



    }
      public static void dateFixer(){
  for (int i = 0; i < dates.size(); i++){
        try{
      dates.set(i, ((dates.get(i)).substring(25,32)));
    }
       catch(StringIndexOutOfBoundsException e ){}

  }


    }
  public static String getSum(String state){
    for(int i = 0; i < 50; i++){
        if (stateCount[i][0].equals(state)){
            return stateCount[i][1];
        }
    }
    return "";
 }
  public static void main(String[]args){
      organize("UFOData2.txt");
      //  countState();
      //System.out.println(Arrays.deepToString(stateCount));
       dateFixer();
       countState();
         //System.out.println( Arrays.toString(dates.toArray())); 
       }


    
}

