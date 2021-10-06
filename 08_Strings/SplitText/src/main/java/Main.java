import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {


    String text = "I didn’t think, I didn’t guess,\n" +
            "He took it and became a programmer.\n" +
            "Sly he knows the language,\n" +
            "He's not used to anything else.";
    System.out.println(splitTextIntoWords(text));


  }

  public static String splitTextIntoWords(String text) {

    String regex = "";
    String[] words = text.split("[^a-zA-Z[’]]+".trim());
    for (int i = 0; i < words.length;i++){
      regex += words[i]+"\n";

    }




    //TODO реализуйте метод
    return regex.trim() ;
  }

}