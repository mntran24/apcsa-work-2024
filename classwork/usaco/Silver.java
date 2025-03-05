import java.util.Scanner;
import java.io.File;
public class Silver{
    public static void main(String[] args) {
        try{
            File inp = new File("ctravel.in");
            Scanner sc = new Scanner(inp);
            int n = sc.nextInt();
            int m = sc.nextInt();
            int t = sc.nextInt();
            int[][] grid = new int[n][m];
            for (int[] a:grid){
                String curr = sc.nextLine();
                for(int i = 0;i<m;i++){
                    if(curr.charAt(0)=='*'){
                        a[i] = -1;
                    }
                }
            }
            grid[sc.nextInt()-1][sc.nextInt()-1] = 1;

            for(int x = 0;x<t;x++){
                for(int j = 0;j<n;j++){
                    for (int k = 0;k<m;k++){
                        if(grid[j][k]!=0){
                            boolean fill = true;
                        }
                        grid[j][k] = grid
                    }
                }
            }
            sc.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}