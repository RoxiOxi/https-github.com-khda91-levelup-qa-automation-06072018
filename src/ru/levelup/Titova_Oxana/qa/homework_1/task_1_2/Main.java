package ru.levelup.Titova_Oxana.qa.homework_1.task_1_2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int elem, array[], count, item, first, last;

        Scanner input = new Scanner(System.in); //считываем элементы
        System.out.println("Enter the number of array elements");
        elem = input.nextInt();

        array = new int[elem];

        System.out.println("Enter " + elem + " elements");

        for (count = 0; count < elem; count++) {
            array[count] = input.nextInt();
        }

        Arrays.sort(array);

        System.out.println("Enter an element for binary search");
        item = input.nextInt();
        first = 0;
        last = elem - 1;

        System.out.println("Array after sorting" + Arrays.toString(array));

        binarySearch(array, first, last, item);
    }

    public static void binarySearch(int[] array, int first, int last, int item) {
        int position;
        int countComp = 1; //подсчет количества сравнений

        position = (first + last) / 2;

        while ((array[position] != item) && (first <= last)) {
            countComp++;
            if (array[position] > item) {  // если число заданного для поиска
                last = position - 1; // уменьшаем позицию на 1.
            } else {
                first = position + 1;    // иначе увеличиваем на 1
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println(item + " is " + ++position + " element in array");

            System.out.println("The binary search method found the number after " + countComp +
                    " comparison");
        } else {
            System.out.println("Element not found in array. The binary search method is finished after "
                    + countComp + " comparison");
        }
    }

}
