
/**
 * Write a description of w2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W2 {
    public static String mystery(String dna) {
  int pos = dna.indexOf("T");
  int count = 0;
  int startPos = 0;
  String newDna = "";
  if (pos == -1) {
    return dna;
  }
  while (count < 3) {
    count += 1;
    newDna = newDna + dna.substring(startPos,pos);
    startPos = pos+1;
    pos = dna.indexOf("T", startPos);
    if (pos == -1) {
      break;
    }
  }
  newDna = newDna + dna.substring(startPos);
  return newDna;
  }
  
  public static void main() {

        System.out.println(mystery("Arragonttkkktttjjjt"));
    }

}
