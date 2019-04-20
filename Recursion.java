class Main {
  public static void main(String[] args) {
    Rec rec = new Rec(5);
    System.out.println(rec);
  }
  public static int Rec(int n){
    int answer = n*Rec(n);
    return answer;
  }
}
