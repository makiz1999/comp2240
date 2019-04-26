//Practice with stringuilder
class Main {
  public static void main(String[] args) {
    String word = "My name is Max\n";
    StringBuilder str = new StringBuilder(word);
    System.out.println(word.charAt(5));
    System.out.println(word.substring(11));

    String replace = "Josh\n";
    System.out.println(str.replace(11, 15, replace));
    System.out.println(word);

    System.out.println(str);
    str.delete(0, 3);
    System.out.println(str);

    String names1 = "Max John Chris Alex";
    String[] names = names1.split(" ");
    for( String index: names){
      System.out.println(index);
    }
    StringBuilder str2 = new StringBuilder(names1);
    System.out.println(str2);
    str2.append(" Nick");
    System.out.println(str2);

  }
}
