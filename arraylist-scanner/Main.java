import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
class Main {
  public static void main(String[] args) {
    System.out.println("Hello User!");
    ArrayList<Integer> arrayList = new ArrayList<>();
    System.out.println(arrayList);
    Scanner userInput = new Scanner(System.in);
    boolean editList = true;
    while (editList) {
      try {
        System.out.println("add to list: a, remove from list: r, quit program: q, print list: p");
        String inputTemp = userInput.nextLine();
        switch (inputTemp) {
          case "a":
            System.out.println("enter number to add to the list");
            int addToList = userInput.nextInt();
            arrayList.add(addToList);
          case "r":
            System.out.println("enter what spot in the arrayList you wish to remove");
            int removeFromList = userInput.nextInt();
            arrayList.remove(removeFromList);
          case "q":
            userInput.close();
            editList = false;
          case "p":
            System.out.println(arrayList);
          default:
            System.out.println("Unknown command");
        }
      } catch (Exception e) {
        System.out.println("Invalid Input");
        userInput.next();
      }
    }
    System.out.println(arrayList);
  }

}