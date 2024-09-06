package HW;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
//        1
//        Ввести с клавиатуры два числа m и n.
//        Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int lenght = scanner.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= lenght; j++) {
                System.out.print(8);
            }
            System.out.println();
        }


//        2
//        Используя цикл for вывести на экран
//        прямоугольный треугольник из восьмёрок со сторонами 10 и 10

        int sizeLenght = 10;
        for (int i = 0; i < sizeLenght; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }


//        3
//        Ввести с клавиатуры три числа, вывести на экран средне
//        е из них.
//                Т.е. не самое большое и не самое маленькое.
//        Если все числа равны, вывести любое из них.

//        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите число 2: ");
        int num2 = scanner.nextInt();
        System.out.print("Введите число 3: ");
        int num3 = scanner.nextInt();
        if (num1 == num2 || num1 == num3 || num2 == num3) {

        } else if (num1 >= num2 && num1 <= num3) {
            System.out.println(num1);
        } else if (num1 <= num2 && num1 >= num3) {
            System.out.println(num1);
        } else if (num2 >= num3 && num2 <= num1) {
            System.out.println(num2);
        } else if (num2 < num3 && num2 > num1) {
            System.out.println(num2);
        } else if (num3 < num1 && num3 > num2) {
            System.out.println(num3);
        } else if (num3 < num1 && num3 > num2) {
            System.out.println(num3);
        }
    }


//        4
//        Вводить с клавиатуры числа.
//        Если пользователь ввел -1, вывести на экран сумму всех введенных чисел
//        и завершить программу.
//                -1 должно учитываться в сумме.


//        5
//        Вывести на экран таблицу умножения 10х10 используя цикл while.
//        Числа разделить пробелом.
//        int i=1;
//        while (i<=10){
//            int a=1;
//            while(a<= 10){
//                System.out.print(a*i+" ");
//                a++;
//            }
//            i++;
//            System.out.println();

//        }


//        6
//        Ввести с клавиатуры строку name.
//                Ввести с клавиатуры дату рождения (три числа): y, m, d.
//        Вывести на экран текст:
//        "Меня зовут name.
//        Я родился d.m.y"

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите имя: ");
//        String name = scanner.nextLine();
//        System.out.println("Введите дату рождения: ");
//        System.out.print("День: ");
//        int Day = scanner.nextInt();
//        System.out.print("Месяц: ");
//        int Month = scanner.nextInt();
//        System.out.print("Год: ");
//        int Year = scanner.nextInt();
//        System.out.println("Меня зовут: " +name);
//        System.out.print("Я родился: ");
//        System.out.print(+Day);
//        System.out.print("."+Month);
//        System.out.print("."+Year);


}

