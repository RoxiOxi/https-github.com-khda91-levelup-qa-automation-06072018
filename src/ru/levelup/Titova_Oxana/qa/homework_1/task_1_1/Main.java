package ru.levelup.Titova_Oxana.qa.homework_1.task_1_1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int elem, array[], count;

        Scanner input = new Scanner(System.in); //считываем элементы
        System.out.println("Enter the number of array elements");
        elem = input.nextInt();

        array = new int[elem];

        System.out.println("Enter " + elem + " elements");

        for (count = 0; count < elem; count++) {
            array[count] = input.nextInt();
        }

        System.out.println("Source array" + Arrays.toString(array));

        bubbleSort(array);

        System.out.println("Array after sorting" + Arrays.toString(array));

    }

    // с выделением доп.памяти
    public static void bubbleSort(int[] elem) {
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int j = 0; j < elem.length - 1; j++) {
                if (elem[j] > elem[j + 1]) {
                    temp = elem[j];
                    elem[j] = elem[j + 1];
                    elem[j + 1] = temp;
                    flag = true;
                }
            }
        }
    }
}
