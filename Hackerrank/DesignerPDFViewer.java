import java.util.*;


public class DesignerPDFViewer {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] c = new int[26];
    for (int i = 0; i < 26; ++i) {
      int[i] = in.nextInt();
    }
    String w = in.next();
    int maxH = 0;
    for (char letter : w.toCharArray()) {
      if (c[letter - 'a'] > maxH) maxH = c[letter - 'a'];
    }
    System.out.println(maxH*w.length());
    in.close();
  }



}