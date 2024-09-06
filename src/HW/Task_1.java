package HW;

public class Task_1 {

    public static void main(String[] args) {
        //        5
//        Вывести на экран таблицу умножения 10х10 используя цикл while.
//        Числа разделить пробелом.
        int i=1;
        while (i<=10){
            int a=1;
            while(a<= 10){
                System.out.print(a*i+" ");
                a++;
            }
            i++;
            System.out.println();

        }

    }
}


