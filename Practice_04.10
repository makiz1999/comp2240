import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //Rectangle myBox = new Rectangle (10.0, 5.0, "red");
    //System.out.println(myBox.toString());
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter length of your Rectangle");
    double lengthRec = keyboard.nextDouble();
    System.out.println("Enter width of your Rectangle");
    double widthRec = keyboard.nextDouble();
    keyboard.nextLine();
    System.out.println("Enter color of your Rectangle");
    String colorRec = keyboard.nextLine();
    Rectangle userRec = new Rectangle(lengthRec, widthRec, colorRec);
    System.out.println(userRec.toString());

    System.out.println("\n");
    System.out.println("Enter height of your Rectangle");
    double heightRec = keyboard.nextDouble();
    Rectangle2D user2DRec = new Rectangle2D(lengthRec, widthRec, colorRec, heightRec);
    System.out.println(user2DRec.toString());
  }

static class Rectangle {
  private double length;
  private double width;
  private String color;

  Rectangle (){
    this.length = 20.0;
    this.width = 10.0;
    this.color = "purple";
  }
  Rectangle (double length, double width){
    this.length = length;
    this.width = width;
    this.color = "purple";
  }
  Rectangle (double length, double width, String color){
    this.length = length;
    this.width = width;
    this.color = color;
  }

  public void setLength(double length){
    this.length = length;
  }
  public void setWidth(double width){
    this.width = width;
  }
  public void setColor(String color){
    this.color = color;
  }
  public double getLength(){
    return this.length;
  }
  public double getWidth(){
    return this.width;
  }
  public String getColor(){
    return this.color;
  }
  public double getArea(){
    return width*length;
  }
  public String toString(){
    return String.format("\n\nFROM RECTANGLE CLASS\n\nLength: %.2f\nWidth: %.2f\nArea: %.2f\nColor: %s", getLength(), getWidth(), getArea(), getColor());
  }
}
static class Rectangle2D extends Rectangle{
  private double height;

  Rectangle2D(){
    super();
    this.height = 5.0;
  }
  Rectangle2D(double length, double width, String color, double height){
    super(length, width, color);
    this.height = height;
  }

  public void setHeight(double height){
    this.height = height;
  }
  public double getHeight(){
    return height;
  }
  public double getVolume(){
    return super.getArea() * height;
  }
  public String toString(){
    return String.format("%s\nFROM RECTANGLE2D CLASS\n\nHeight: %.2f\nVolume: %.2f", super.toString(), getHeight(), getVolume());
  }
  }
}
