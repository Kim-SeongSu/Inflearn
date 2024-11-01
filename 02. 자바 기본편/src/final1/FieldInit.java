package final1;

public class FieldInit {
    static final int CONST_VALUE = 10;
    final int value = 10;

    public FieldInit() {
        // this.value = value; // 이미 초기값이 지정되었으므로 생성자로 입력 불가
    }
}
