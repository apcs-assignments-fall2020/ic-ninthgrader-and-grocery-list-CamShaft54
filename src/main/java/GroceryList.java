import java.util.ArrayList;
import java.util.Arrays;

public class GroceryList {
    private String[] arr;

    public GroceryList() {
        // our grocery list will have a max size of 10
        this.arr = new String[10];
    }

    public void add(String item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = item;
                break;
            }
        }
    }

    public void remove(String item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].equals(item)) {
                arr[i] = "";
            }
        }
    }

    public String toString() {
        ArrayList<String> sorted = new ArrayList<>();
        for (String s : arr) {
            if (s != null)
                sorted.add(s);
            sorted.remove("");
        }
        return Arrays.toString(sorted.toArray()).replace("[", "").replace("]", "");
    }
}