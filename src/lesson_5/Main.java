package lesson_5;

public class Main {
    public static void main(String[] args) {
        // Циклы
        // For i
        // While
        // For each


//        for ( int i = 0 ; i < 5 ; i++ )
//        {
//            System.out.println(i);
//        }
//        System.out.println("Мы находимся вне цикла");

        int counter = 10;

        while (counter > 0) {
            System.out.println(counter); System.out.println(counter); System.out.println(counter);


            counter--; // counter = counter - 1

            if (counter == 5) {
                break;
            }
        }
    }
}
