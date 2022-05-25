package Graphs;

import java.util.Scanner;

public class Graphs {


    


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); //vertices
        int e = s.nextInt(); // edges
        
        int[][] adjMatrix = new int[n][n];

        for(int i = 0; i < e; i++) {
            int v1 = s.nextInt();
            int v2 = s.nextInt();

            //mark 1 for edges
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;
        }


        //printing
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
