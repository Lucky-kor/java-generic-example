package generic;

import java.util.ArrayList;
import java.util.List;

public class GenericExampleV3 {
    public static void main(String[] args) {
        // Box 객체 생성 (String 타입)
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello, Generics!");
        System.out.println("String in box: " + stringBox.getItem());

        // Box 객체 생성 (Integer 타입)
        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(123);
        System.out.println("Integer in box: " + integerBox.getItem());

        // 제네릭 List 사용
        List<Box<String>> listOfStringBoxes = new ArrayList<>();
        listOfStringBoxes.add(stringBox);

        // 요소 출력
        for (Box<String> box : listOfStringBoxes) {
            System.out.println("Box contains: " + box.getItem());
        }
    }
}

// 제네릭 클래스를 정의
class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}