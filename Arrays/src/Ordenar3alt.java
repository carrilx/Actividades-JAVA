

import java.util.*;
public class Ordenar3alt {
  public static void main(String[] a){
    Scanner s=new Scanner(System.in);
    int[] n={s.nextInt(),s.nextInt(),s.nextInt()};
    Arrays.sort(n);
    System.out.println(n[2]+" "+n[1]+" "+n[0]);
  }
}