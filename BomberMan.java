import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Solution {

  // Complete the bomberMan function below.
    static String[] bomberMan(int n, String[] grid) {
        int f=grid.length;
        int c=grid[0].length();

        
        char[][] matrizRes= new char[f][c];
        
        
        //System.out.println(f+"---"+c);

        if(n==1)
            return grid;

        if(n%2==0){
          //  String[] matrizRes2= new String[f];    
            for(int i=0;i<f;i++){
                grid[i]="";
                for(int j=0;j<c;j++){
                   grid[i]=grid[i].concat("O");
                }
            }
            return grid;
        }
           

        
      //  for(int s=3;s<=n;s+=2){
        for(int i=0;i<f;i++){
            for(int j=0;j<c;j++){
                if(cantVecinos(grid,i,j)>0)
                    matrizRes[i][j]='.';
                else
                    matrizRes[i][j]='O';
            }
        }
           // System.out.println("-------------------");
        for(int i=0;i<f;i++){
            grid[i]=String.valueOf(matrizRes[i]);
           // System.out.println(grid[i]);
        }

        if(n%4==3)
            return grid;

        for(int i=0;i<f;i++){
            for(int j=0;j<c;j++){
                if(cantVecinos(grid,i,j)>0)
                    matrizRes[i][j]='.';
                else
                    matrizRes[i][j]='O';
            }
        }
        for(int i=0;i<f;i++){
            grid[i]=String.valueOf(matrizRes[i]);
            System.out.println(grid[i]);
        }
        
        //}
        
        return grid;
    }

    public static int cantVecinos(String[]grid, int fila, int columna){
        if(grid[fila].charAt(columna)=='O')
            return 1;
        if(fila>0)
            if(grid[fila-1].charAt(columna)=='O')
               return 1;
        if(fila<grid.length-1)
            if(grid[fila+1].charAt(columna)=='O')
                return 1;
        if(columna>0)
            if(grid[fila].charAt(columna-1)=='O')
                return 1;
        if(columna<grid[0].length()-1)
            if(grid[fila].charAt(columna+1)=='O')
                return 1;
        return 0;
    
    
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] rcn = scanner.nextLine().split(" ");

        int r = Integer.parseInt(rcn[0]);

        int c = Integer.parseInt(rcn[1]);

        int n = Integer.parseInt(rcn[2]);

        String[] grid = new String[r];

        for (int i = 0; i < r; i++) {
            String gridItem = scanner.nextLine();
            grid[i] = gridItem;
        }

        String[] result = bomberMan(n, grid);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
