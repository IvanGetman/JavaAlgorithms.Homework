package Homework_5;

import java.util.Arrays;
import java.util.Random;

public class Homework_5 {
    public static void main(String[] args) {
        // Задание 5.1. Приведите пример использования рекурсии.
        // Классический пример: рекурсивно-определённый факториал целого неотрицательного числа
        // Задание 5.2. Реализуйте простой пример бесконечной рекурсии и обычной рекурсии с условием для выхода.
        int n = 5;
        System.out.println(getFactorial(n)); //рекурсия с условием для выхода
        //System.out.println(getInfinity());//бесконечная рекурсия
        // Задание 5.3. Приведите пример изображающий стек вызова и стек вызова с рекурсией.
        System.out.println(getFactorial(n)); //тоже что и п.5.2
        // Задание 5.4. Реализуйте простой алгоритм использующий цикл и простой алгоритм использующий рекурсию. Оцените два алгоритма с помощью базового метода System.nanoTime().
        getSum(n, n + 5); // простой алгоритм использующий цикл
        System.out.println(getSumRecursion(n, n + 5));  // простой алгоритм использующий рекурсию
        // Задание 5.5. Реализуйте алгоритм двоичного рекурсивного поиска на основе массива из задания 2.1. Оцените алгоритм двоичного рекурсивного поиска с помощью базового метода System.nanoTime() и сравните с обычным двоичным поиском.
        int sizeArr = 20;
        int searchKey = 10;
        int[] arrSort = new int[sizeArr];
        arrSort[0] = searchKey;
        Random rand = new Random();
        for (int i = 1; i < sizeArr; i++) {
            arrSort[i] = rand.nextInt(sizeArr * 2);
        }
        int[] arrSortCopy = Arrays.copyOf(arrSort, arrSort.length);
        Arrays.sort(arrSort);
        System.out.println(Arrays.toString(arrSort));
        System.out.println(recBinaryFind(searchKey, 0, arrSort.length - 1, arrSort));
        // Задание 5.6. На основе массива из задания 2.1 реализуйте алгоритм сортировки слиянием. Оцените алгоритм сортировки слиянием с помощью базового метода System.nanoTime() и сравните с сортировкой методом sort().
        System.out.println(Arrays.toString(arrSortCopy));
        System.out.println(Arrays.toString(sortMerge(arrSortCopy)));
    }

//    public static boolean getInfinity() {
//        System.out.println("infinity");
//        return getInfinity();
//    }

    public static int getFactorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * getFactorial(n - 1);
        }
    }

    public static void getSum(int min, int max) {
        int result = 0;
        for (int i = min; i <= max; i++) {
            result = result + i;
        }
        System.out.println("Сумма чисел от " + min + " до " + max + " включительно = " + result);
    }

    public static int getSumRecursion(int min, int max) {
        if (min == max) {
            return max;
        } else {
            return min + getSumRecursion(min + 1, max);
        }
    }

    public static int recBinaryFind(int searchKey, int low, int high, int[] arr) {

        if (low > high) {
            return arr.length;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == searchKey) {
            return mid;
        } else if (arr[mid] < searchKey) {
            return recBinaryFind(searchKey, low + 1, high, arr);
        } else {
            return recBinaryFind(searchKey, low, high - 1, arr);
        }
    }

    public static int[] sortMerge(int[] arr) {
        int len = arr.length;
        if (len < 2) return arr;
        int middle = len / 2;
        return merge(sortMerge(Arrays.copyOfRange(arr, 0, middle)),
                sortMerge(Arrays.copyOfRange(arr, middle, len)));
    }

    public static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;

        for (int i = 0; i < result.length; i++) {
            result[i] = a[aIndex] < b[bIndex] ? a[aIndex++] : b[bIndex++];
            if (aIndex == a.length) {
                System.arraycopy(b, bIndex, result, ++i, b.length - bIndex);
                break;
            }
            if (bIndex == b.length) {
                System.arraycopy(a, aIndex, result, ++i, a.length - aIndex);
                break;
            }
        }
        return result;
    }
}
