package DZ_Lesson_02_java;

/** Задание 2. Если необходимо, исправьте данный код
 *
 *             try {
 *    int d = 0;
 *    double catchedRes1 = intArray[8] / d;
 *    System.out.println("catchedRes1 = " + catchedRes1);
 * } catch (ArithmeticException e) {
 *    System.out.println("Catching exception: " + e);
 * }
 * */
public class Task_02 {

    public static void main(String[] args) {
        foo1();
    }

    public static void foo1(){
        try {
            int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
