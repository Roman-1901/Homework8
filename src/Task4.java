public class Task4 {
    public static void main(String[] args) {
        int numbers[] = {42, 7, 33, 78, 21, 3, 84};
        for (int i = 0; i <= numbers.length - 1; i++) {
            numbers[i] = numbers[i] % 2 != 0 ? numbers[i] += 1 : numbers[i];
            System.out.print(numbers[i] + " ");
        }
    }
}
