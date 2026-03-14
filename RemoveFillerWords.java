import java.util.ArrayList;


public class RemoveFillerWords{

  //instance variables
  private ArrayList<String> speech;
  private ArrayList<String> fillerWords;

  /**
   * constructor for the RemoveFillerWords class which sets the parameter to instance variables
   *
   * @param ArrayList<String> speech
   * @param ArrayList<String> fillerWords
   * @return speech instance variable with updated ArrayList
   * @return fillerWords instance variable with updated ArrayList
   */
  public RemoveFillerWords(ArrayList<String> speech, ArrayList<String> fillerWords){
    this.speech = speech;
    this.fillerWords = fillerWords;
  }



  /**
   * updates the speech ArrayList to have only the words that are not filler words
   *
   * @return ArrayList<String> speech
   */
  public ArrayList<String> removeFiller(){
    for (int i = 0; i<speech.size(); i++){
      boolean isFiller = false;
      for (int j = 0; j<fillerWords.size(); j++){
        //checks to see if the word is filler
        if (speech.get(i).equals(fillerWords.get(j))){
         isFiller = true;
        }
      }
      //if the word is filler, remove the word
      if (isFiller){
        speech.remove(i);
        i--;
      }
    }

    return speech;

 }


  
}