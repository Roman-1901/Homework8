public class Task1_2 {
    public static void main(String[] args) {

        // Первое задание
        int numbers[] = new int[3];
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;
        double numbers2[] = {1.57, 7.654, 9.986};
        String names[] = {"Роман", "Василий", "Геннадий", "Ирина", "Светлана"};

        // Второе задание
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (i < numbers.length - 1) {
                System.out.print(numbers[i] + ",");
            } else {
                System.out.print(numbers[i]);
            }
        }
        System.out.println();
        for (int i = 0; i <= numbers2.length - 1; i++) {
            if (i < numbers2.length - 1) {
                System.out.print(numbers2[i] + ",");
            } else {
                System.out.print(numbers2[i]);
            }
        }
        System.out.println();
        for (int i = 0; i <= names.length - 1; i++) {
            if (i < names.length - 1) {
                System.out.print(names[i] + ",");
            } else {
                System.out.print(names[i]);
            }
        }
    }
}
