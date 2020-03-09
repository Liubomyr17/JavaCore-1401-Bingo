package com.company;

/*
1401   Bingo
Оператор instanceof имеет вид: a instanceof B.
Другими словами, оператор instanceof вернет значение true, если:
1) переменная а хранит ссылку на объект типа B
2) переменная a хранит ссылку на объект, класс которого унаследован от B
3) переменная а хранит ссылку на объект реализующий интерфейс B
Иначе оператор instanceof вернет значение false.

Bingo!
Исправь строчку ‘Object animal = new Pet();‘ в методе main так, чтобы программа вывела «Bingo!«.
Требования:
1. Класс Cat должен наследоваться от класса Pet.
2. Класс Tiger должен наследоваться от класса Cat.
3. В переменной animal должен храниться объект который будет одновременно являться и Pet, и Cat, и Tiger.
4. Программа должна выводить на экран: "Bingo!".


 */


public class Solution {
    public static void main(String[] args)  {

        Object animal = new Tiger();

        boolean isCat = animal instanceof Cat;
        boolean isTiger = animal instanceof Tiger;
        boolean isPet = animal instanceof Pet;

        printResults(isCat, isTiger, isPet);
    }

    private static void printResults(boolean cat, boolean tiger, boolean pet)  {
        if (cat && tiger && pet) System.out.println("Bingo!");
    }

    static class Pet {
    }

    static class Cat extends Pet  {
    }

    static class Tiger extends Cat  {
    }

}






