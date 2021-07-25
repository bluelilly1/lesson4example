 class Main{
  static String color = "red";
  String size;
  public void setColor() {
    System.out.println(color);
  }
  public static void main(String[] args) {
    Main instance1 = new Main();
    instance1.color = "green";
    instance1.setColor();
  }
}
