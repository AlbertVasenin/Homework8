package sky.pro.java;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Task1:
        /*Объявите три массива:
        Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 – сразу заполнив его значениями.
        Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ
        создания массива: с помощью ключевого слова или сразу заполненный элементами. */
        int[] array = new int[3];
        array[0]=1;
        array[1]=2;
        array[2]=3;

        double[] Array = {1.57, 7.654, 9.986};

        String[] string = new String[2];
        string[0] = "execution cannot";
        string[1] = "be pardoned";

        //Task2:
        /* Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов,
        начиная с первого элемента, через запятую. Запятая между последним элементом одного
        массива и первым элементом следующего не нужна. */
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(i< array.length-1){
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i]);
            if(i< array.length-1){
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < string.length; i++) {
            System.out.print(string[i]);
            if(i< string.length-1){
                System.out.print(",");
            }
        }
        System.out.println();

         //Task3:
         /*Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не с первого
         элемента массива, а с последнего. Элементы должны быть распечатаны через запятую, при этом элементы
         одного массива располагаются на одной строчке, а элементы другого массива – на другой.
         Запятая между последним элементом одного массива и первым элементом следующего не нужна.
         Если во втором задании в консоль у вас вывелся результат
         1, 2, 3
         1.57, 7.654, 9.986
         *произвольные элементы третьего массива*, то в третьем задании результат должен быть
         3, 2, 1
         9.986, 7.654, 1.57
         *произвольные элементы третьего массива в обратном порядке* */
        for (int i = array.length-1; i >=0 ; i--) {
            System.out.print(array[i]);
            if(i>0){
                System.out.print(",");
            }
        }
        System.out.print("\n");
        for (int i = Array.length-1; i >=0 ; i--) {
            System.out.print(Array[i]);
            if(i>0){
                System.out.print(",");
            }
        }
        System.out.print("\n");
        for (int i = string.length-1; i >=0 ; i--) {
            System.out.print(string[i]);
            if(i>0){
                System.out.print(",");
            }
        }
        System.out.print("\n");

        //Task4:
        /*Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам
        нужно использовать циклы. Распечатайте результат преобразования в консоль.*/
        /*  int[] array = new int[3]; такой массив был
             array[0]=1;
             array[1]=2;
             array[2]=3;  */

        for (int i=0; i< array.length; i++){
            if(array[i]%2==0){
                array[i]+=0;
            }else {
                array[i]++;
            }
            System.out.printf("%d,", array[i]);
        }
    }
}






