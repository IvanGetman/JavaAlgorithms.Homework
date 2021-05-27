package Homework_6;

import Homework_4.Person;

import java.util.SortedMap;

public class Homework_6 {
    public static void main(String[] args) {
        // Заданиу 6.1 Приведите пример использования древовидной структуры.
        // файловая система
        // Задание 6.2 Реализуйте класс узла дерева и базовый шаблон дерева с базовыми методами.
        Tree tree = new Tree();
        // Задание 6.3 Реализуйте методы поиска и вставки узла в дерево.
        tree.insert(new Person(5, "Иван", "Иванов"));
        tree.insert(new Person(1, "Иван", "Сергеев"));
        tree.insert(new Person(6, "Сергей", "Иванов"));
        tree.insert(new Person(3, "Абырвалг", "Иванов"));
        tree.find(1).display();
        // Задание 6.4 Реализуйте базовые методы обхода дерева и метода дисплей. Реализуйте поиск максимума и минимума.
        System.out.println("Дерево");
        tree.displayTree();
        System.out.println("Максимум");
        tree.showMax().display();
        System.out.println("Минимум");
        tree.showMin().display();
        // Задание 6.5 Реализуйте метод удаления узла и выполните оценку времени базовых методов дерева с помощью System.nanoTime().
        tree.delete(5);
        // Задание 6.6 Реализуйте на основе массива из задания 2.1 алгоритм пирамидальной сортировки с реализацией бинарной пирамиды. Выполните оценку алгоритма пирамидальной сортировки с помощью System.nanoTime() и сравните с предыдущимиалгоритмами сортировки.
        HeapSort heapSort = new HeapSort();
        // Задание 6.7 Приведите пример сбалансированного дерева и его применения.
        //Красно-чёрное дерево
    }
}