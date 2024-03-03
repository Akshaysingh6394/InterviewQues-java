package practice;
import java.util.*;
public class array2D {
    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    System.out.println("Found at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();  //number of columns
        int n =sc.nextInt();  //number of rows
        int matrix[][] = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //output
        for(int i=0;i<n;i++){
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        search(matrix , 5);

    }
}


