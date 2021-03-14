package com.epam.test.automation.java.practice9;

import java.text.DecimalFormat;

public class Matrix {

    private static final String EXCCOMUNICATE="Incompatible matrix sizes";
    private final int columns;
    private final int rows;
    private final double[][] data;

    public Matrix(int row, int column) {
        if(row>0&&column>0){
            this.columns =column;
            this.rows=row;
            this.data=new double[row][column];
            for (int i = 0; i < row; ++i) {
                for (int j = 0; j < column; ++j) {
                    this.data[i][j] = 0.0;
                }
            }
            } else
                throw new UnsupportedOperationException();
    }

    public Matrix(double[][] twoDimensionalArray) throws MatrixException {
        this.rows = twoDimensionalArray.length;
        if(this.rows==0){
            throw new MatrixException("Array passed with zero number of rows");
        }
        this.columns = twoDimensionalArray[0].length;
        if(this.columns==0){
            throw new MatrixException("Array passed with zero number of columns");
        }
        this.data=new double[rows][columns];
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0;j<this.columns;j++){

                this.setValue(i,j,twoDimensionalArray[i][j]);
            }
        }

    }


    public final int rows() {
        return  this.rows;
    }

    public final int columns() {
        return this.columns;
    }

    public double[][] twoDimensionalArrayOutOfMatrix() throws MatrixException {

        double[][] standardArray = new double[this.rows][this.columns];
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0;j<this.columns;j++){
                standardArray[i][j]=this.getValue(i, j);
            }
        }
        return standardArray;

    }

    public double getValue(int row, int column) throws MatrixException {
        if (row < 0 || column < 0 || row >= this.rows || column >= this.columns){
            throw new MatrixException(EXCCOMUNICATE);
        }return this.data[row][column];
    }


    public void setValue(int row, int column, double newValue) throws MatrixException {
        if(row<0||row>=this.rows||column<0||column>=this.columns){
            throw new MatrixException(EXCCOMUNICATE);
        }
        this.data[row][column] = newValue;
    }

    public Matrix addition(Matrix matrix) throws MatrixException {
        if (this.rows != matrix.rows() || this.columns != matrix.columns()){
            throw new MatrixException(EXCCOMUNICATE);
        }

        double[][] resultArray=matrix.twoDimensionalArrayOutOfMatrix();

        for (int i = 0; i < matrix.rows; ++i) {
            for (int j = 0; j < matrix.columns; ++j) {
                resultArray[i][j]= matrix.getValue(i, j)+this.getValue(i,j);
            }
        }
        return new Matrix(resultArray);
    }

    public Matrix subtraction(final Matrix matrix) throws MatrixException {
        if (this.rows != matrix.rows() || this.columns != matrix.columns()){
            throw new MatrixException(EXCCOMUNICATE);
        }

        double[][] resultArray=matrix.twoDimensionalArrayOutOfMatrix();

        for (int i = 0; i < matrix.rows; ++i) {
            for (int j = 0; j < matrix.columns; ++j) {
                resultArray[i][j]= this.getValue(i, j)-matrix.getValue(i,j);
            }
        }
        return new Matrix(resultArray);
    }

    public Matrix multiplication(final Matrix matrix) throws MatrixException {
        if (this.columns != matrix.rows()){
            throw new MatrixException(EXCCOMUNICATE);
        }

        double[][] resultArray=matrix.twoDimensionalArrayOutOfMatrix();

        for (int i = 0; i < matrix.rows; ++i) {
            for (int j = 0; j < matrix.columns; ++j) {
                Double cur = 0.0;
                for (int k = 0; k < columns; ++k) {
                    cur += this.data[i][k] * matrix.getValue(k, j);
                }
                resultArray[i][j]= cur;
            }
        }
        return new Matrix(resultArray);


    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.rows(); i++) {
            for (int j = 0; j < this.columns(); j++) {
                try {
                    if (j != this.columns() - 1) {
                        builder.append(decimalFormat.format(getValue(i, j)) + " ");
                    } else {
                        builder.append(decimalFormat.format(getValue(i, j)));
                    }
                } catch (MatrixException e) {
                    e.getMessage();
                }
            }
            builder.append("\n");
        }
        return builder.toString();
    }

}