package ua.ithillel.chernovol.four.ClassesPartThree;

/**
 * @author Chernovol Alexander
 */

//Создать класс Matrix. Класс должен иметь следующие поля:
//        двумерный массив вещественных чисел;
//        количество строк и столбцов в матрице.
//        Добавить следующие методы:
//        сложение с другой матрицей;
//        умножение на число;
//        вывод на печать;
//        умножение матриц - по желанию.

public class Matrix {
    private double[][] array;
    private int column;
    private int line;

    public static void main(String[] args) {
        Matrix firstMatrix = new Matrix(3,3);
        Matrix secondMatrix = new Matrix(3,3);
        Matrix resultMatrix;

        firstMatrix.fillArray();
        secondMatrix.fillArray();


        System.out.println("Первая матрица");
        firstMatrix.showMatrix();
        System.out.println("Вторая матрица");
        secondMatrix.showMatrix();

        System.out.println("Сложение матриц");
        resultMatrix = firstMatrix.additionMatrix(secondMatrix);
        resultMatrix.showMatrix();

        System.out.println("Умножение всех элементов на 3");
        resultMatrix = firstMatrix.multiplicationOnValue(3);
        resultMatrix.showMatrix();

        System.out.println("Умножении матриц между собой");
        resultMatrix = firstMatrix.multiplicationMatrix(secondMatrix);
        resultMatrix.showMatrix();




    }
    //Конструктор
    public Matrix(int column, int line) {
        array = new double[column][line];
        this.column = column;
        this.line = line;
    }

    //Метод для заполнения матрицы
    private void fillArray(){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                //Изначально заполняю int что бы не было много знаков после запятой
                array[i][j] = (int) (Math.random() * ((10 + 1) - 1) + 1);
            }
        }
    }

    //Метод для вывода матрицы
    private void showMatrix(){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%-10s",array[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    //Метод сложения двух матриц
    private Matrix additionMatrix(Matrix mArray){
        Matrix returnMatrix = new Matrix(this.column,this.line);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                returnMatrix.array[i][j] = array[i][j] + mArray.array[i][j];
            }
        }
        return returnMatrix;
    }

    //Метод для умножения матрицы на заданное число
    private Matrix multiplicationOnValue(double value){
        Matrix returnMatrix = new Matrix(this.column,this.line);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                returnMatrix.array[i][j] = array[i][j] * value;
            }
        }
        return returnMatrix;
    }

    //Метод для умножения матриц между собой
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
