package lesson_2;

public class Main {

    public static void main(String[] args) {
        // Переменная

        // 1ым делом обозначить тип даннных, переменную которых мы хотим объявить
        // 2 - Дать этой переменной имя
        // 3 - Через вызов оператора присвоения (=) присвоить переменной значение
        byte a;
        a = 123;
        System.out.println(a);
        a = 50;
        System.out.println(a);
        short s = 12312;
        System.out.println(s);
        s = 6548;
        System.out.println(s);
        int i = 1236548;
        i = 6548;
        System.out.println(i);
        long l = 123412541243123L;
        System.out.println(l);
        float f = 10.5f;
        System.out.println(f);
        double d = 1.666666777;
        System.out.println(d);

        char firstChar = '!';

        char myfirstChar = '3';
        System.out.println(myfirstChar);
        System.out.println(firstChar);

        boolean b = true;
        System.out.println(b);

        boolean math = f > d;

        System.out.println(math);
        int first = 25;

        int second = 50;

        int third = first * 10;

/**    Операторы сравнения

 == Проверяет, равны или нет значения двух операндов, если да,
 то условие становится истинным (A == B) – не верны


 != Проверяет, равны или нет значения двух операндов,
 если значения не равны, то условие становится истинным (A != B) – значение истинна

 > Проверяет, является ли значение левого операнда больше,
 чем значение правого операнда, если да, то условие становится истинным (A > B) – не верны

 < Проверяет, является ли значение левого операнда меньше,
 чем значение правого операнда, если да, то условие становится истинным (A < B) – значение истинна

 >= Проверяет, является ли значение левого операнда больше или равно значению правого операнда,
 если да, то условие становится истинным (A >= B) – значение не верны

 <= Проверяет, если значение левого операнда меньше или равно значению правого операнда,
 если да, то условие становится истинным (A <= B) – значение истинна
 int a = 1;
 boolean is = true;
 * */
        int x = 10;
        int z = 5;
        boolean isOneEqualsTwo = x > z;

        System.out.println(isOneEqualsTwo);
/**
 Логические операторы

 && Называется логический оператор «И». Если оба операнда являются не равны нулю, то условие становится истинным
 || Называется логический оператор «ИЛИ». Если любой из двух операндов не равен нулю, то условие становится истинным
 ! Называется логический оператор «НЕ». Использование меняет логическое состояние своего операнда.
 Если условие имеет значение true, то оператор логического «НЕ» будет делать false
 * */
        /** int temp = 15;
         boolean isWeekEnd = true;
         isIWillGoToWalking = isWeekEnd || temp >= 25;
         if (isIWillGoToWalkinh) {
         System.out.println("Я сегодня пойду гулять");
         else {
         System.out.println("О нет, сегодня не получится пойти гулять!");
         }
         }
         }
         * */
        int dayOfWeek = 3;

        if (dayOfWeek == 1) {
            System.out.println("Сегодня пн");
        } else if (dayOfWeek == 2) {
            System.out.println("Сегодня вт");
        } else if (dayOfWeek == 3) {
            System.out.println("Сегодня ср");
        } else if (dayOfWeek == 4) {
            System.out.println("Сегодня чт");
        } else if (dayOfWeek == 5) {
            System.out.println("Сегодня пт");
        } else if (dayOfWeek == 6) {
            System.out.println("Сегодня сб");
        } else {
            System.out.println("Мы не знаем такого дня недели");
        }

    }
}






