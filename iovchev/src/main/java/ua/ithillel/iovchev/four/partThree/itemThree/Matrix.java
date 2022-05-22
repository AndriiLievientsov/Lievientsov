package ua.ithillel.iovchev.four.partThree.itemThree;

public class Matrix {
    private double[][] array;
    private int rows;
    private int columns;

    public void sumArrays(double[][] array1, double[][] array2) {
        rows = array1.length;
        columns = array1[0].length;
        array = new double[rows][columns];
        if (array1.length != array2.length || array1[0].length != array2[0].length) {
            System.out.println("Нельзя складывать массивы разных размерностей.");
            return;
        }
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array[i][j] = array1[i][j] + array2[i][j];
            }
        }
        print();
    }

    public void multiplyArrayNumber(double[][] array3, double number) {
        rows = array3.length;
        columns = array3[0].length;
        array = new double[rows][columns];
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                array[i][j] = array3[i][j] * number;
            }
        }
        print();
    }

    private void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][0]);
            for (int j = 1; j < array[i].length; j++) {
                System.out.print(", " + array[i][j]);
            }
            System.out.println();
        }
        System.out.println("--------");
    }

    public void multiplyArrays(double[][] array4, double[][] array5) {
        if (array4[0].length != array5.length) {
            System.out.println("Такие матрицы нельзя перемножить, так как количество столбцов матрицы А не равно количеству строк матрицы В");
            return;
        }
        rows = array4.length;
        columns = array5[0].length;
        array = new double[rows][columns];
        double element;
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[0].length; j++) {
                element = 0;
                for (int k = 0; k < array5[0].length; k++) {
                    element = element + array4[i][k] * array5[k][j];
                }
                array[i][j] = element;
            }
        }
        print();
    }
}
