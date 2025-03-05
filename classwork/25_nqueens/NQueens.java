public class NQueens{
    private int[][] board;
    private int r,c;
    public NQueens(){
        board = new int[4][4];
        if(this.addQueen(r, c)){
            c=0;
            if(!this.addQueen(r+1, c)){
                this.addQueen(r+1, c+1);
            }
        }
        this.removeQueen(r, c);
    }
    public NQueens(String test){
        board = new int[4][4];
        if(test=="testing"){
            if(this.addQueen(r+1, 0)){
                this.addQueen(r+1,0);
            }
            else{
                if(c+1<4){
                    this.addQueen(r+1, c+1);
                }
                else{
                    this.removeQueen(r, c);
                }
            }
        }
    }
    
    public boolean addQueen(int r, int c){
        if(board[r][c]>0){
            return false;
        }
        board[r][c]=-1;
        for(int i = 1;i<board.length-r;i++){
            if(c+i<board[0].length){
                board[r+i][c+i]++;
            }
            if(c-i>=0){
                board[r+i][c-i]++;
            }
            board[r+i][c]++;
        }
        return true;
    }
    public void removeQueen(int r, int c){
        board[r][c]=0;
        for(int i = 1;i<board.length-r;i++){
            if(c+i<board[0].length){
                board[r+i][c+i]--;
            }
            if(c-i>=0){
                board[r+i][c-i]--;
            }
            board[r+i][c]--;
        }
    }
    public String toString(){
        String ret = "";
        for(int[] each:board){
            for(int a:each){
                if(a==-1){
                    ret+="Q";
                }
                else{
                    ret+="_";
                }
                ret+=" ";
            }
            ret = ret.substring(0,ret.length()-1);
            ret+="\n";
        }
        return ret.substring(0,ret.length()-1);
    }
    public String toStringPlain(){
        String ret = "";
        for(int[] each:board){
            for(int a:each){
                ret+= a + " ";
            }
            ret = ret.substring(0,ret.length()-1);
            ret+="\n";
        }
        return ret.substring(0,ret.length()-1);
    }
}