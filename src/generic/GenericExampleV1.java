package generic;

import java.util.ArrayList;
import java.util.List;

public class GenericExampleV1 {
    public static void main(String[] args) {
        // List 생성 (제네릭 사용하지 않음)
        Object[] items = new Object[3];

        // 다양한 타입의 요소 추가
        items[0] = ("Apple");
        items[1] = (123); // Integer 타입 추가
        items[2] = (45.67); // Double 타입 추가

        // 요소 출력
        for (Object item : items) {
            System.out.println(item);
        }

        // 특정 타입으로 변환해야 할 때 (캐스팅 필요)
        String firstItem = (String) items[0];
        System.out.println("First item: " + firstItem);
    }
}
