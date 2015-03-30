public class One8Test {
    public static void main(String[] args) {
        System.out.println(One8Rotation.isRotate("11111111111111111111111111111111", ""));
        System.out.println(One8Rotation.isRotate("", ""));
        System.out.println(One8Rotation.isRotate("11111111111111111111111111111111", "12"));
        System.out.println(One8Rotation.isRotate("1", "1"));
        System.out.println(One8Rotation.isRotate("123", "231"));
        System.out.println(One8Rotation.isRotate("112", "211"));
    }
}
