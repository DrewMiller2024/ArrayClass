import java.util.ArrayList;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Hello User!");
    ArrayList<Integer> arrayList = new ArrayList<>();
    System.out.println(arrayList);
    Scanner userInput = new Scanner(System.in);
    boolean editList = true;
    System.out.println("add to list: a, remove from index: r, remove first occurence of an integer: rf; remove all occurences of an integer: ra, quit program: q, print list: p");
    while (editList) {
      System.out.println("-----------");
      try {
        String inputTemp = userInput.nextLine().toLowerCase();
        switch (inputTemp) {
          case "a":
            System.out.println("enter number you wish to add");
            int addToList = userInput.nextInt();
            arrayList.add(addToList);
            break;
          case "r":
            System.out.println("enter the index of the integer you wish to remove");
            int removeFromList = userInput.nextInt();
            arrayList.remove(removeFromList);
            break;
          case "rf":
            System.out.println("enter what integer you wish to remove");
            int intToRemove = userInput.nextInt();
            int idx1 = arrayList.indexOf(intToRemove);
            arrayList.remove(idx1);
            break;
          case "ra":
            System.out.println("enter what integer you wish to remove");
            int intToRemoveAll = userInput.nextInt();
            while (arrayList.indexOf(intToRemoveAll) != -1) {
              int idx2 = arrayList.indexOf(intToRemoveAll);
              arrayList.remove(idx2);
            }
            break;
          case "q":
            userInput.close();
            editList = false;
            break;
          case "p":
            System.out.println(arrayList);
            break;
          default:
            System.out.println("Uknown Input");
            break;
        }
        System.out.println("ArrayList: " + arrayList + "");
      } catch (Exception e) {
        System.out.println("Invalid Input");
        userInput.next();
      }
    }
    System.out.println("Final ArrayList: "+ arrayList +"");
  }

}