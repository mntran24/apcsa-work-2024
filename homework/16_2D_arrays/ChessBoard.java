public class ChessBoard
{
    public static void main(String[] args)
    {
        //Create an 8x8 2D String array called chess.
        String[][] chess = new String[8][8];
        chess[0] = new String[] {"Rook","Knight","Bishop","Queen","King","Bishop","Knight","Rook"};
        chess[7] = chess[0];
        for (int i = 2;i<6;i++){
            for (int x = 0;x<8;x++){
                chess[i][x] = "  -  ";
            }
        }
        for (int i = 1;i<7;i+=5){
            for (int x = 0;x<8;x++){
                chess[i][x] = "Pawn ";
            }
        }
        //Use this method to print the chess board onto the console
        print(chess);
    }
    
    public static void print(String[][] array)
    {
        for (String[] item:array){
            for (String each:item){
                System.out.print(each+"  ");
            }
            System.out.println();
        }
    }
}