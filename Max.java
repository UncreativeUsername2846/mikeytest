//import Math;

public class Max {

    public static void main(String[] args) {

      System.out.println(recursiveMaxDigit(578));
      System.out.println(recursiveMaxDigit(10));
      System.out.println(recursiveMaxDigit(9999));
      System.out.println(recursiveMaxDigit(13442));
      System.out.println(recursiveMaxDigit(19019019));
      System.out.println(recursiveMaxDigit(314));
      System.out.println(recursiveMaxDigit(1));
      System.out.println(iterativeMaxDigit(787));
      System.out.println(iterativeMaxDigit(578));
      System.out.println(iterativeMaxDigit(782194791));

    }

    public static int recursiveMaxDigit(int num) {

      String num1 = Integer.toString(num);

        return Math.max(num % 10, recursiveMaxHelper(num / 10, num1.length(), 0));

      }


    public static int recursiveMaxHelper(int num, int startnum, int maxnum) { //needs additional parameter from recursiveMaxDigit
      //base case for recursion
      if (startnum == 0) {

        return maxnum;
      }

      //recursive case
      else {
      return Math.max(num % 10, recursiveMaxHelper(num / 10, startnum - 1, maxnum));
      }
    }



    public static int iterativeMaxDigit(int newnum) {
      int max = newnum % 10;
      for (int x = newnum; x > 0; x = x / 10) {

        if (x % 10 > max) {
          max = x % 10;
        }
      }
    return max;
    }





}
