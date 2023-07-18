// Задание
// Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение
package Java;

import java.util.ArrayList;
import java.util.Random;

public class HomeWork3 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = setArray();
        task1(numbers);
        task2(numbers);
        task3(numbers);
        task4(numbers);
    }

    static ArrayList<Integer> setArray() {
        Random random = new Random();
        int rnd = 0;
        int arraySize = 15;
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < arraySize; i++) {
            rnd = random.nextInt(20);
            numbers.add(rnd);
        }
        return numbers;

    }

    static void task1(ArrayList<Integer> array) {
        System.out.println("=".repeat(50) + " Task 1 " + "=".repeat(50));
        System.out.println(array);
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 == 0) {
                array.remove(i);
                i--;
            }
        }
        System.out.println(array);
    }

    static void task2(ArrayList<Integer> array) {
        System.out.println("=".repeat(50) + " Task 2 " + "=".repeat(50));
        int min = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (min > array.get(i)) min = array.get(i);
        }
        System.out.println("Minimum value: " + min + ".");
    }

    static void task3(ArrayList<Integer> array) {
        System.out.println("=".repeat(50) + " Task 3 " + "=".repeat(50));
        int max = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (max < array.get(i)) max = array.get(i);
        }
        System.out.println("Maximum value: " + max + ".");
    }

    static void task4(ArrayList<Integer> array) {
        System.out.println("=".repeat(50) + " Task 4 " + "=".repeat(50));
        float average = 0;
        for (int i = 0; i < array.size(); i++) average += array.get(i);
        System.out.printf("Average value: %.2f", average/array.size());
    }
}
