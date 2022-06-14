package ua.ithillel.iovchev.four.partThree.itemThree;

public class Matrix {
    private double[][] array;
    private int rows;
    private int columns;

    public Matrix(double[][] array, int rows, int columns) {
        this.array = array;
        this.rows = rows;
        this.columns = columns;
    }

    public double[][] getArray() {
        return array;
    }

    public void sumArrays(Matrix matrix) {
        double[][] resultArray = new double[rows][columns];
        double[][] arrayS = matrix.getArray();
        if (array.length != arrayS.length || array[0].length != arrayS[0].length) {
            System.out.println("Нельзя складывать массивы разных размерностей.");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                resultArray[i][j] = array[i][j] + arrayS[i][j];
            }
        }
        print(resultArray);
    }

    public void multiplyArrayNumber(double number) {
        double[][] resultArray = new double[rows][columns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                resultArray[i][j] = array[i][j] * number;
            }
        }
        print(resultArray);
    }

    private void print(double[][] resultArray) {
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i][0]);
            for (int j = 1; j < resultArray[i].length; j++) {
                System.out.print(", " + resultArray[i][j]);
            }
            System.out.println();
        }
        System.out.println("--------");
    }

    public void multiplyArrays(Matrix matrix) {
        double[][] resultArray = new double[rows][columns];
        double[][] arrayM = matrix.getArray();
        double element;
        if (array[0].length != arrayM.length) {
            System.out.println("Такие матрицы нельзя перемножить, так как количество столбцов матрицы А не равно количеству строк матрицы В");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                element = 0;
                for (int k = 0; k < arrayM[0].length; k++) {
                    element = element + array[i][k] * arrayM[k][j];
                }
                resultArray[i][j] = element;
            }
        }
        print(resultArray);
    }
}
