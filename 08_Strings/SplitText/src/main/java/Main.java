public class Main {

  public static void main(String[] args) {


    String text = "I didn’t think, I didn’t guess,\n" +
            "He took it and became a programmer.\n" +
            "Sly he knows the language,\n" +
            "He's not used to anything else.";
    System.out.println(splitTextIntoWords(text));


  }

  public static String splitTextIntoWords(String text) {
    String[] words = text.split("[\\s,\\.]+".trim());
    for (int i = 0; i < words.length;i++){
      System.out.println(words[i]);
    }


    //TODO реализуйте метод
    return "";
  }

}