package lessen_7;

public class Cat {

// У класса есть -
//    Xарактеристики
//    поля / fields

    int age;
    String name;

    public void NameThisCat() {
        name = "Barsik";
    }

    public void meow() {
        System.out.println("Meow!");
    }

    public void PrintName() {
        System.out.println(name);
    }

    public int countDifficultNumbers(int a, int b){
//        int a = 524;
//        int b = 649;
        int result = a * b;
        return result;


        }
    }


