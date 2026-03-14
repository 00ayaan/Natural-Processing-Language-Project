import java.util.ArrayList;

public class AgeArtist{

  //instance variable
  private ArrayList<String> artists;

  /**
   * constructor for the AgeArtist class which sets the parameter to instance variable
   *
   * @param ArrayList<String> artists
   * @return instance variable with updated ArrayList
   */
  public AgeArtist(ArrayList<String> artists){
    this.artists = artists;
  }

  /**
   * gives an int array with all of the ages from the artists.txt file
   *
   * @return int[] array arr
   */
  public int[] returnAges(){
    int[] arr = new int[artists.size()];
    for (int i = 0; i<artists.size(); i++){
      //creates the small string and then turns into int
      String sub = artists.get(i).substring(artists.get(i).indexOf(",")+1);
      arr[i] = Integer.parseInt(sub);
    }

    return arr;
  } 

  /**
   * produces a String that contains all of the ages, each being on a new line
   *
   * @return String output
   */
  public String toString(){
    int[] arr = returnAges();

    String output = "";

    //loops through array of ages and adds them to a String
    for (int i = 0; i<arr.length; i++){
      output += arr[i];
      output += "\n";
    }

    return output;
    
  }



  
}