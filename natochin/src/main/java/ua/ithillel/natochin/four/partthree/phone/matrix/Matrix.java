package ua.ithillel.natochin.four.partthree.phone.matrix;

import java.util.Arrays;

public class Matrix {
    private int[][] matrix;
    private int lines;
    private int columns;

    public Matrix(int lines, int columns) {
        this.lines = lines;
        this.columns = columns;
        this.matrix = new int[this.lines][this.columns];
    }

    public int getLines(){
        return this.lines;
    }

    public int getColumns(){
        return this.columns;
    }

    public void setElement(int line, int column, int value){
        this.matrix[line][column] = value;
    }
    public int getElement(int line, int column){
        return this.matrix[line][column];
    }

    public void fillMatrixRandomly() {
        for (int i = 0; i < this.lines; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.matrix[i][j] = (int) (Math.random()*4)-1;
            }
        }
    }

    public Matrix addMatrix(Matrix matrixToAdd){
        if(matrixToAdd.getLines() != this.getLines() || matrixToAdd.getColumns() != this.getColumns()){
            System.out.println("You can add matrix with dims " + this.getLines() + " x " + this.getColumns() + " only.");
            System.out.println("First matrix as sample below.");
            return this;
        }

        Matrix helper = new Matrix(this.lines,this.columns);

        for (int i = 0; i < helper.lines; i++) {
            for (int j = 0; j < helper.columns; j++) {
                helper.setElement(i,j,this.matrix[i][j] + matrixToAdd.getElement(i,j));
            }
        }
        return helper;
    }

    public Matrix multiplyMatrix(int number){
        Matrix helper = new Matrix(this.lines,this.columns);
        for (int i = 0; i < helper.lines; i++) {
            for (int j = 0; j < helper.columns; j++) {
                helper.setElement(i,j,this.matrix[i][j] * number);
            }
        }
        return helper;
    }
    public void printMatrix(){
        for (int i = 0; i < this.lines; i++) {
            System.out.println(Arrays.toString(this.matrix[i]));
        }
    }

}
