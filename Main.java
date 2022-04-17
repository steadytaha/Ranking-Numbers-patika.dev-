import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int a, b, c;
      System.out.print("1st Number: ");
      a = input.nextInt();
        System.out.print("2nd Number: ");
        b = input.nextInt();
        System.out.print("3rd Number: ");
        c = input.nextInt();
      if(a < b && b < c){
          System.out.println(a+ " < " +b+ " < " +c);
      }else if(a < b && c < b){
          System.out.println(a+ " < " +c+ " < " +b);
      }else if(b < a && a < c){
          System.out.println(b+ " < " +a+ " < " +c);
    }else if(c < a && a < b) {
          System.out.println(c + " < " + a + " < " + b);
      }else if(c < b && b < a) {
          System.out.println(c + " < " + b + " < " + a);
      }else if(b < c && c < a) {
          System.out.println(b + " < " + c + " < " + a);
      }
    }
}
