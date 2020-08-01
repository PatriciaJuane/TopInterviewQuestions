import java.util.*;
public class RotateImage {

    public static void rotate(int[][] matrix) {
      int l = matrix.length;
        
        for(int i=0; i<l/2; i++) {
            for(int j=i; j<l-1-i; j++) {
                int tmp = matrix[i][j]; // top element
                matrix[i][j] = matrix[l-1-j][i]; // left goes to top
                matrix[l-1-j][i] = matrix[l-1-i][l-1-j]; // bottom goes to left
                matrix[l-1-i][l-1-j] = matrix[j][l-1-i]; //right goes to bottom
                matrix[j][l-1-i] = tmp;
            }
        }
    }

    public static void main(String[] args) {

    }
}