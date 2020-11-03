public class GroceryListClient {
    public static void main(String[] args) {
        GroceryList l1 = new GroceryList();
        l1.add("when");
        l1.add("life");
        l1.add("gives");
        l1.add("you");
        l1.add("lemons");
        l1.add("make");
        l1.add("lemonade");
        System.out.println(l1);
        l1.remove("when");
        l1.remove("life");
        System.out.println(l1);
    }
}
