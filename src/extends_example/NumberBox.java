package extends_example;

// 'Number' 클래스 또는 그 하위 클래스만을 제네릭 타입 파라미터로 받는 'NumberBox' 클래스
public class NumberBox<T extends Number> {
    private T number; // 'Number' 타입의 private 멤버 변수

    // 'NumberBox' 객체를 생성할 때 'Number' 타입의 객체를 받아 'number' 멤버 변수에 할당하는 생성자
    public NumberBox(T number) {
        this.number = number;
    }

    // 저장된 숫자를 double 타입으로 반환하는 메서드
    public double doubleValue() {
        return number.doubleValue(); // 'Number' 클래스가 제공하는 'doubleValue' 메서드를 호출
    }

    // 저장된 'number'를 반환하는 메서드
    public T getNumber() {
        return number;
    }

    // 'number' 멤버 변수의 값을 새로운 값으로 설정하는 메서드
    public void setNumber(T number) {
        this.number = number;
    }

    // 'main' 메서드 - 프로그램의 시작점
    public static void main(String[] args) {
        // 'Integer' 타입을 갖는 'NumberBox' 객체를 생성하고 '10'으로 초기화
        NumberBox<Integer> intBox = new NumberBox<>(10);
        // 'Double' 타입을 갖는 'NumberBox' 객체를 생성하고 '3.14'로 초기화
        NumberBox<Double> doubleBox = new NumberBox<>(3.14);

        // 'intBox'의 숫자를 double 타입으로 출력 (10.0)
        System.out.println(intBox.doubleValue());
        // 'doubleBox'의 숫자를 double 타입으로 출력 (3.14)
        System.out.println(doubleBox.doubleValue());
    }
}

/**
 * NumberBox 클래스는 정수, 부동 소수점 수 등 모든 숫자 타입을 처리할 수 있으며,
 * 이는 Number 클래스가 Integer, Double, Float 등의 부모 클래스이기 때문입니다.
 */