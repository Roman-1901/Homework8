public class Task3 {
    public static void main(String[] args) {
        int numbers[] = new int[3];
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;
        double numbers2[] = {1.57, 7.654, 9.986};
        String names[] = {"Роман", "Василий", "Геннадий", "Ирина", "Светлана"};

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + ",");
            }
        }
        System.out.println();
        for (int i = numbers2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(numbers2[i]);
            } else {
                System.out.print(numbers2[i] + ",");
            }
        }
        System.out.println();
        for (int i = names.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(names[i]);
            } else {
                System.out.print(names[i] + ",");
            }
        }
    }
}
