package ua.ithillel.iovchev.four.partThree.itemThree;

    /* 3. Создать класс `Matrix`. Класс должен иметь следующие поля:
            - двумерный массив вещественных чисел;
            - количество строк и столбцов в матрице.
            - Добавить следующие методы:
                1) сложение с другой матрицей;
                2) умножение на число;
                3) вывод на печать;
                4) умножение матриц - по желанию.*/

public class Solution {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.sumArrays(new double[][]{{1, 2, 3}, {4, 5, 6}}, new double[][]{{1, 2, 3}, {4, 5, 6}});
        matrix.multiplyArrayNumber(new double[][]{{1, 2, 3}, {4, 5, 6}}, 5.0);
        matrix.multiplyArrays(new double[][]{{1, 2, 3}, {4, 5, 6}}, new double[][]{{1, 2, 3}, {4, 5, 6},{7,8,9}});
    }
}
