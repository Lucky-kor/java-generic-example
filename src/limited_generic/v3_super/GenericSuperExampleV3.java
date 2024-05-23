package limited_generic.v3_super;

public class GenericSuperExampleV3 {
    public static void addFruit(Box<? super Apple> box, Apple fruit) {
        box.setItem(fruit);
        System.out.println("Fruit in box: " + box.getItem());
    }

    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<>();
        addFruit(fruitBox, new Apple());
    }
}
