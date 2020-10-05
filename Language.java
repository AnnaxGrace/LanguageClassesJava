public class Language {

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

  public Language(String langName, int speakers, String regions, String word){
    name = langName;
    numSpeakers = speakers;
    regionsSpoken = regions;
    wordOrder = word;

  }

  public void getInfo() {
    System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ". The language follows the word order: " + wordOrder);
  }
  public static void main(String[] args) {
    Language Spanish = new Language("Spanish", 2, "many", "subject-verb-object");
    Spanish.getInfo();
    Mayan Tzotzil = new Mayan("Tzotzil", 66); 
    Tzotzil.getInfo();
  }
}