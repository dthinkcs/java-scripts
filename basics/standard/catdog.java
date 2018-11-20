
/**
 * Write a description of catdog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class catdog {
    public static void main(){
    String s1 = "Acatdogcatdoglion";
    String s2 = "dog";
    String s3 = "TIGER";
    
    String s4 = s1.substring(0, s1.lastIndexOf(s2) + s2.length()) + s3 +  s1.substring(s1.lastIndexOf(s2) + s2.length());
    System.out.println(s4);
}
}
