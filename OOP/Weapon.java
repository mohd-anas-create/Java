package OOP;

public class Weapon implements ItemStuff{
  private int damage;
  private String name;
  private int quantity;
  private String type;
  public Weapon(String name, int quantity, String type, int damage) {
    this.name = name;
    this.quantity = quantity;
    this.type = type;
    this.damage = damage;
    
  }
    public int getDamage()
  {
    return damage;
  } 
  @Override 
    public String getName() {
    return name;
  }
  @Override 
  public int getQuantity() {
    return quantity;
  }
  @Override 
  public String getType() {
    return type;
  }
   // method overriding - runtime polymorphism
  @Override      
  public void displayInfo() {
    System.out.println("item: " + getName() + " quantity: " + getQuantity() + " type: " + getType() + " damage: " + getDamage());
  }

}
