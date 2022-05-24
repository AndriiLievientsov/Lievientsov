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
        double[][] array1 = new double[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        double[][] array2 = new double[][]{{1, 2, 3}, {4, 5, 6}, {4, 5, 6}};

        Matrix matrix1 = new Matrix(array1, array1.length, array1[0].length);
        Matrix matrix2 = new Matrix(array2, array2.length, array2[0].length);

        matrix1.sumArrays(matrix2);
        matrix1.multiplyArrayNumber(5.0);
        matrix1.multiplyArrays(matrix2);
    }
}
