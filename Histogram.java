import java.util.Scanner;

public class Histogram {
  //attributes, bounds and array
  int lowerbound;
  int upperbound;
  int[] histArr;

  public Histogram(int lowerbound, int upper) {
    this.lowerbound = lowerbound;
    upperbound = upper;
    histArr = new int[upper - lowerbound + 1 ];
  }


  public boolean add(int i) {
      if (i >= lobound) {
        return true;
      }
      else {
        return false;
      }
  }

  public String toStirng() {

  }










  public static void main(String[] args) {

    Histogram newGraph = new Histogram(0, 0);

    System.out.println("---Histogram Console---");
    System.out.println("Options");
    System.out.println("add - used to add numbers to the histogram");
    System.out.println("print = prints the histogram to the screen");
    System.out.println("quit - leaves the program");

    Scanner myScanner = new Scanner(System.in);
    String input = myScanner.nextLine();

    String newInput = (input);
    String[] inputArr = newInput.split(" ", 2);

    int lobound = Integer.parseInt(inputArr[0]);
    int upbound = Integer.parseInt(inputArr[1]);

    System.out.println("Enter Range to get started: " + newGraph.Histogram(lobound,upbound);

    key = "quit"
    String addInput = "default"; //don't know if this'll work
    int counter = -1;




    while (addInput != key) {

      Scanner addScanner = new Scanner(System.in);
      String addInput = addScanner.nextLine();

      if (addInput == "add") {

        System.out.println("Enter number(s): ");
        Scanner anotherScanner = new Scanner(System.in);
        String anotherInput = anotherScanner.nextLine();

        int anotherInt = Integer.parseInt(anotherInput);

        //Create the string used to store the values before they go to array
        String tempArr = "";

        if (newGraph.add(anotherInt) == true ) {
          //add to String
          String tempArr = tempArr + anotherInput;

        }
        else {
          System.out.println(anotherInput + " is not in the range");
        }
      }
    }

  }

}
