public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        if (0 <= 4 && 4 < arr.length) {
            arr[4] = 10; // Correct way to access array elements.
        } else {
            System.out.println("Invalid array index");
        }
    }
}