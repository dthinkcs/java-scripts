
/**
 * Write a description of TwoAccess here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class TwoAccess {
 public static void main(String args[]) {
     B_sub subOb = new B_sub();
     subOb.setij(10, 12);
     subOb.sum();
     System.out.println("Total is " + subOb.total);
 }
}
class A_sup {
 int i; // public by default
 private int j; // private to A
 void setij(int x, int y) {
     i = x;
     j = y;
 }
}
// A's j is not accessible here.
class B_sub extends A_sup {
 int total;
 void sum() {
     //total = i + j; // ERROR, j is not accessible here
     total = i;
 }
}
