package OOP;

class Main {
 public static void main(String[] args) {

   Inventory inventory = new Inventory();

  // Item item = new Item("stone", 64, "Block");

   Fruit fruit = new Fruit("Apple", 20, "food", "healing");

   //Weapon weapon = new Weapon("Sword", 2, "combat", 5);

   inventory.addItem(item);
   
   inventory.addItem(fruit);

   inventory.addItem("Sword", 2, "combat", 5);

   inventory.displayInventory();

 }
}
