import java.util.ArrayList;


public class NLPRunner {
  public static void main(String[] args) {

  ArrayList<String> arr = FileReader.toStringList("artists.txt");

  AgeArtist artist1 = new AgeArtist(arr);

  System.out.println(artist1);

  ArrayList<String> words = new ArrayList<String>();

    //adding all of the speech into the ArrayList
        words.add("So");
        words.add("um");
        words.add("I");
        words.add("was");
        words.add("thinking");
        words.add("that");
        words.add("like");
        words.add("maybe");
        words.add("we");
        words.add("should");
        words.add("uh");
        words.add("start");
        words.add("the");
        words.add("presentation");
        words.add("now");
        words.add("basically");
        words.add("what");
        words.add("is");
        words.add("actually");
        words.add("it’s");
        words.add("totally");
        words.add("fine");
        words.add("if");
        words.add("we");
        words.add("wait");
        words.add("but");
        words.add("you");
        words.add("know");
        words.add("time");
        words.add("is");
        words.add("kind");
        words.add("of");
        words.add("like");
        words.add("running");
        words.add("out");
        words.add("honestly");
        words.add("I’m");
        words.add("just");
        words.add("um");
        words.add("trying");
        words.add("to");
        words.add("make");
        words.add("sure");
        words.add("that");
        words.add("like");
        words.add("everyone");
        words.add("is");
        words.add("on");
        words.add("the");
        words.add("same");
        words.add("page");
        words.add("right");
        words.add("So");
        words.add("anyway");
        words.add("let's");
        words.add("just");
        words.add("uh");
        words.add("see");
        words.add("how");
        words.add("it");
        words.add("goes");

  ArrayList<String> fillerWords = FileReader.toStringList("fillerWords.txt");

  RemoveFillerWords remove1 = new RemoveFillerWords(words, fillerWords);

  System.out.print(remove1.removeFiller());


    
  }
}