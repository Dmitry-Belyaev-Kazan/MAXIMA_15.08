package HW;

import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        //1 Написать программу, чтобы она:
        //- выводил на экран строку "Число меньше 5", если число, которое мы ей подадим меньше 5,
        //- выводил строку "Число больше 5", если число, которое мы ей подадим больше 5,
        //- выводил строку "Число равно 5", если число, которое мы ей подадим равен 5.
/**

 Scanner scanner = new Scanner(System.in);

 int a = scanner.nextInt();

 if (a < 5) {
 System.out.println("Число " + a + " меньше чем 5");
 }
 else if (a == 5) {
 System.out.println("Число " + a + " равно 5-и");
 }
 else if (a > 5) {
 System.out.println("Число " + a + " больше чем 5");
 }
 */
        //2 Напиши программу. которая будет проверять попало ли целое число, которое мы ей подадим
        //в интервал от 50 до 100 и сообщить результат на экран в следующем виде:
        //"Число number не содержится в интервале." или "Число number содержится в интервале."
        // где number - число, которое мы ей подадим.
/**
 Scanner scanner = new Scanner(System.in);
 int num = scanner.nextInt();

 if (num >= 50 && num <= 100)
 System.out.println("Число " + num + " содержится в интервале");
 else
 System.out.println("Число " + num + " не содержится в интервале");
 */
        //3 Напиши программу, которая
        //по номеру месяца должна определить время года (зима, весна, лето, осень) и вывести на экран.

/**
 Scanner scanner = new Scanner(System.in);
 int monthOFYear = scanner.nextInt();
 if (monthOFYear == 1) {
 System.out.println("Январь! Сейчас идёт Зима!");
 } else if (monthOFYear == 2) {
 System.out.println("Февраль! Сейчас идёт Зима!");
 } else if (monthOFYear == 3) {
 System.out.println("Март! Сейчас идёт Весна!");
 } else if (monthOFYear == 4) {
 System.out.println("Апрель! Сейчас идёт Весна!");
 } else if (monthOFYear == 5) {
 System.out.println("Май! Сейчас идёт Лето!");
 } else if (monthOFYear == 6) {
 System.out.println("Июнь! Сейчас идёт Лето!");
 } else if (monthOFYear == 7) {
 System.out.println("Июль! Сейчас идёт Лето!");
 } else if (monthOFYear == 8) {
 System.out.println("Август! Сейчас идёт Лето!");
 } else if (monthOFYear == 9) {
 System.out.println("Сентябрь! Сейчас идёт Осень!");
 } else if (monthOFYear == 10) {
 System.out.println("Октябрь! Сейчас идёт Осень!");
 } else if (monthOFYear == 11) {
 System.out.println("Ноябрь! Сейчас идёт Зима!");
 } else if (monthOfYear = 12) {
 System.out.println("Декабрь! Сейчас идёт Зима!");
 else{
 System.out.println("Мы такого времени года не знаем");
 }
 */
/**
 Scanner scanner = new Scanner(System.in);
 int monthOFYear = scanner.nextInt();

 switch (monthOFYear) {
 case (1):
 System.out.println("Январь! Сейчас идёт Зима!");
 break;
 case (2):
 System.out.println("Февраль! Сейчас идёт Зима!");
 break;
 case (3):
 System.out.println("Март! Сейчас идёт Весна!");
 break;
 case (4):
 System.out.println("Апрель! Сейчас идёт Весна!");
 break;
 case (5):
 System.out.println("Май! Сейчас идёт Лето!");
 break;
 case (6):
 System.out.println("Июнь! Сейчас идёт Лето!");
 break;
 case (7):
 System.out.println("Июль! Сейчас идёт Лето!");
 break;
 case (8):
 System.out.println("Август! Сейчас идёт Лето!");
 break;
 case (9):
 System.out.println("Сентябрь! Сейчас идёт Осень!");
 break;
 case (10):
 System.out.println("Октябрь! Сейчас идёт Осень!");
 break;
 case (11):
 System.out.println("Ноябрь! Сейчас идёт Зима!");
 break;
 case (12):
 System.out.println("Декабрь! Сейчас идёт Зима!");
 break;
 default:
 System.out.println("В году всего 12 месяцев! Попробуй ещё раз.");

 }
 */
//        4
//        Написать программу, которая будет проверять число, которое мы подадим ей.
//                Если число положительное, то увеличить его в два раза.
//                Если число отрицательное, то прибавить единицу.
//        Если введенное число равно нулю, необходимо вывести ноль.
//        Вывести результат в консоль.
/**
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        if (num > 0)
        {
            num = num * 2;
            System.out.println(num);
        } else if (num < 0)
        {
            num = num + 1;
            System.out.println(num);
        } else if (num == 0)
        {
            System.out.println(num);
        }
 */

//        6
//        Написать программу, которая, в зависимости от того числа, которое мы ей подадим (год)
//                , будет определять количество дней в году. Результат вывести на экран в следующем виде:
//        количество дней в этом году: x
//                , где
//        х - 366 для високосного года,
//                х - 365 для обычного года.
        /**
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(+ year + " год является високосным");
        } else {
            System.out.println(+ year + " год не является високосным");
        }
         */
//        7
//        Объявить три переменных (a, b, c) - стороны предполагаемого треугольника.
//        Определить возможность существования треугольника по сторонам.
//        Результат вывести на экран в следующем виде:
//        "Треугольник существует." - если треугольник с такими сторонами существует.
//                "Треугольник не существует." - если треугольник с такими сторонами не существует.
        /**
        Scanner scanner = new Scanner(System.in);
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();
        if  ((side1 + side2) > side3 && (side1 + side2) > side3 && (side2 + side3) > side1) {
            System.out.println("Треугольник построить возможно");
        } else {
            System.out.println("Треугольник построить невозможно");
        }
        */


    }
}