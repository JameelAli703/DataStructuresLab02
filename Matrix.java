package DSA_LAB_02;

public class Matrix {
    int row;
    int column;
    int[][] arr;
    public Matrix(int r, int c) {
        row = r;
        column = c;
        arr = new int[row][column];
    }
    public int getRows() {
        return row;
    }
    public int getColumns() {
        return column;
    }
    public int getElement(int r, int c) {
        return arr[r][c];
    }
    public void setElement(int r, int c, int element) {
        arr[r][c] = element;
    }
    public static Matrix add(Matrix x, Matrix y) {
        if ((x.row == y.row) && (x.column == y.column)) {
            Matrix m = new Matrix(x.row, x.column);
            for (int i = 0; i < m.row; i++) {
                for (int j = 0; j < m.column; j++) {
                    m.setElement(i, j, (x.getElement(i, j) +
                            y.getElement(i, j)));
                }
            }
            return m;
        } else {
            System.out.println("Matrices can not be added");
            return new Matrix(0, 0);
        }
    }
    public static Matrix product(Matrix x, Matrix y) {
        Matrix m = new Matrix(x.row, y.column);
        for (int i = 0; i < x.row; i++) {
            for (int j = 0; j < y.column; j++) {
                int sum = 0;
                for (int k = 0; k < x.column; k++) {
                    sum = sum + (x.getElement(i, k) * y.getElement(k, j));
                }
                m.setElement(i, j, sum);
            }
        }
        return m;
    }
    public void printMatrix() {
        System.out.println("Matrix is : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Matrix m = new Matrix(3, 3);
        Matrix n = new Matrix(3,3 );
        int k = 1;
        for (int i = 0; i < 3; i++) {
            for (int j =0; j < 3; j++) {
                m.setElement(i, j, k);
                k++;
                n.setElement(i, j, k);
                k++;
            }
        }
        m.printMatrix();
        n.printMatrix();
        Matrix a = Matrix.add(m, n);
        a.printMatrix();
        Matrix p = Matrix.product(m, n);
        p.printMatrix();
    }
}
