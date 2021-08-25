package HomeWork1;

public class HomeWork1 {

    static float num(float a, float b, float c, float d) {
        float res = a * (b + (c / d));
        return res;
    } //Метод для задачи 3

    static boolean q4(int a, int b) {
        int a4 = a + b;
        if (a4 <= 20 && a4 >= 10) {
            return true;
        } else {
            return false;
        }
    } //Метод для задачи 4

    static void q5(int a5) {
        if (a5 >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }//Метод для задачи 5

    static boolean q6(int a6) {
        if (a6 >= 0) {
            return false;
        } else {
            return true;
        }
    }//Метод для задачи 6

    static void q7(String name) {
        System.out.println("Привет, " + name + "!");
    } //Метод для задачи 7

    static int yearType(int year) {
        if (year % 4 == 0 && year % 400 == 0) {
            System.out.println(year + " год високосный");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не високосный");
        }
        return year;
    } //Метод для задачи 8

    public static void main(String[] args) { //Задача 1


        //region Задача 2
        byte A = -50;
        short B = 548;
        int C = 12548;
        long D = 14250L;
        float E = 12.54F;
        double F = 15.485;
        char G = 'c';
        boolean H = false;
        //endregion

        //region Задача 3

        float x = 5.5f;
        float y = 8.3f;
        float z = 12.0f;
        float j = 3.3f;
        float result = num(x, y, z, j);
        System.out.printf("Ответ: %.2f \n", result);


        //endregion

        //region Задача 4
        int n = 4;
        int b = 6;
        boolean answ = q4(n, b);
        System.out.println("Ответ: " + answ);
        //endregion

        //region Задача 5
        int a5 = 0;
        q5(a5);

        //endregion

        // region Задача 6
        int a6 = 4;
        boolean answ6 = q6(a6);
        System.out.println(answ6);
        // endregion

        //region Задача 7
        q7("Леонид");

//endregion

        //region Задача 8
        yearType(1700);
        //endregion
    }
}


