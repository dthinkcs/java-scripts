public class YourClassNameHere {
  
    public static void main(String[] args) {
      int x = 1;
      Car c = new Car();
      c.yolo();
      c.yolo2();
      Car.yolo();
    }
}

 class Car {
  public static void yolo(){
    // System.out.println(this); ERROR
    System.out.println("Yolo");
  }
  public void yolo2() {
        System.out.println(this);

    System.out.println("Yolo"); 
  }
}
