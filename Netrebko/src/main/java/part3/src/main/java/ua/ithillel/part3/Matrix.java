//3.Создать класс `Matrix`. Класс должен иметь следующие поля:
//        - двумерный массив вещественных чисел;
//        - количество строк и столбцов в матрице.
//        - Добавить следующие методы:
//        1) сложение с другой матрицей;
//        2) умножение на число;
//        3) вывод на печать;
//        4) умножение матриц - по желанию.

package ua.ithillel.part3;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
    private int matrix[][];
    private int column;
    private int row;

    public Matrix(int column, int row) {
        this.column = column;
        this.row = row;
        matrix = new int[this.row][this.column];
        this.matrix = matrix;
    }

    public int[][] matrixRandom() {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(0, 10);
            }
        }
        return matrix;
    }

    public void matrixPrint() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
            }
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public int[][] matrixSum(Matrix array1, Matrix array2) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = array1.matrix[i][j] + array2.matrix[i][j];
            }
        }
        return matrix;
    }

    public int[][] matrixValue(Matrix array1, int value) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = array1.matrix[i][j] * value;
            }
        }
        return matrix;
    }

    public int[][] matrixMultiplication(Matrix array1, Matrix array2) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = array1.matrix[i][j] * array2.matrix[i][j];

            }
        }
        return matrix;
    }
}




