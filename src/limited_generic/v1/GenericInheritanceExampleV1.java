package limited_generic.v1;

public class GenericInheritanceExampleV1 {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<>();
        fruitBox.setItem(new Apple());
        System.out.println("Fruit in box: " + fruitBox.getItem());
    }
}