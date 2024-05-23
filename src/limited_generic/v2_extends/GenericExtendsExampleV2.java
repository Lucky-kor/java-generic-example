package limited_generic.v2_extends;

public class GenericExtendsExampleV2 {
    public static void addFruit(Box<? extends Fruit> box, Fruit fruit) {
        // box.setItem(fruit); // 컴파일 오류: <? extends Fruit>는 불변
        System.out.println("Fruit in box: " + box.getItem());
    }

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        appleBox.setItem(new Apple());
        addFruit(appleBox, new Apple());
    }
}