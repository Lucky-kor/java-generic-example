package generic;

import java.util.ArrayList;
import java.util.List;

public class GenericExampleV2 {
    public static void main(String[] args) {
        // List 생성 (String 타입으로 제네릭 사용)
        List<String> items = new ArrayList<>();

        // 요소 추가 (String 타입만 추가 가능)
        items.add("Apple");
        // items.add(123); // 컴파일 오류: Integer 타입 추가 불가
        // items.add(45.67); // 컴파일 오류: Double 타입 추가 불가

        // 요소 출력
        for (String item : items) {
            System.out.println(item);
        }

        // 캐스팅 없이 특정 타입으로 변환
        String firstItem = items.get(0);
        System.out.println("First item: " + firstItem);
    }
}
