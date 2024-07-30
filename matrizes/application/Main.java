package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe linhas e colunas:");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int [][] mat = new int[m][n];

        System.out.println("Declare a matriz:");
        for(int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Informe a busca: ");
        int busca = sc.nextInt();

        for(int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
               if(mat[i][j] == busca){
                    System.out.println("position: " + i +","+ j);
                    if(j - 1 >= 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                     if(j + 1 < n) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    if (i - 1 >= 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    if (i + 1 < m){
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
               }
            }
        }

        sc.close();
    }

    public void exists (){

    }
}
