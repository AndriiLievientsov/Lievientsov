package ua.ithillel.Lievientsov.HomeworkFive.PartThree;

//3. Создать класс `Matrix`. Класс должен иметь следующие поля:
//   - двумерный массив вещественных чисел;
//   - количество строк и столбцов в матрице.
//   - Добавить следующие методы:
//        1) сложение с другой матрицей;
//        2) умножение на число;
//        3) вывод на печать;
//        4) умножение матриц - по желанию.

public class Matrix {
    private double[][] array;
    private int column;
    private int line;

    public static void main(String[] args) {
        Matrix matrixOne = new Matrix(5,5);
        Matrix matrixTwo = new Matrix(5,5);
        Matrix matrixResult;
        matrixOne.fillArray();
        matrixTwo.fillArray();

        System.out.println("First One: ");
        matrixOne.presentMatrix();

        System.out.println("First Two: ");
        matrixTwo.presentMatrix();

        System.out.println("Matrix addition: ");
        matrixResult = matrixOne.additionMatrix(matrixTwo);
        matrixResult.presentMatrix();

        System.out.println("Multiplying all elements by 5: ");
        matrixResult = matrixOne.multiplicationOnValue(5);
        matrixResult.presentMatrix();

        System.out.println("Multiplication of matrices with each other: ");
        matrixResult = matrixOne.multiplicationMatrix(matrixTwo);
        matrixResult.presentMatrix();
    }

    public Matrix(int column, int line) {
        array = new double[column][line];
        this.column = column;
        this.line = line;
    }

    private void fillArray(){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ((int) (Math.random() * 31) + 1);
            }
        }
    }
    private void presentMatrix(){
        for (double[] doubles : array) {
            for (double value : doubles) {
                System.out.printf("%-8s", value);
            }
            System.out.println();
        }
        System.out.println();
    }

    private Matrix additionMatrix(Matrix mArray){
        Matrix returnMatrix = new Matrix(this.column,this.line);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                returnMatrix.array[i][j] = array[i][j] + mArray.array[i][j];
            }
        }
        return returnMatrix;
    }

    private Matrix multiplicationOnValue(double value){
        Matrix returnMatrix = new Matrix(this.column,this.line);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                returnMatrix.array[i][j] = array[i][j] * value;
            }
        }
        return returnMatrix;
    }

    private Matrix multiplicationMatrix(Matrix mArray){
        Matrix returnMatrix = new Matrix(this.column,this.line);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                returnMatrix.array[i][j] = array[i][j] * mArray.array[i][j];
            }
        }
        return returnMatrix;
    }
}
