package lesson1.hw;

import lesson1.hw.fruits.Apple;
import lesson1.hw.fruits.Orange;

import java.applet.Applet;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"1", "2", "3"};
        ArrayList<String> al = arrayToList(arr);
        System.out.println(al);

        BoxWithFruits<Apple> box1 = new BoxWithFruits<>();
        box1.add(new Apple());
        BoxWithFruits<Orange> box2 = new BoxWithFruits<>();
        box2.add(new Orange());

    }
    public static <T> ArrayList<T> arrayToList(T[] arr) { //Написать метод, который преобразует массив в ArrayList;
        return new ArrayList<>(Arrays.asList(arr)); }

    public static void swap(Object[] arr, int index1, int index2) { //Написать метод, который меняет два элемента массива местами.
        Object obj = arr[index1];                                   //(массив может быть любого ссылочного типа);
        arr[index1] = arr[index2];
        arr[index2] = obj;
    }
    public static <T> void swap1(T[] arr, int index1, int index2) {
        T obj = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = obj;
    }
}
