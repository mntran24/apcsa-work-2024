/**
*@return true when the queen added correctly, false Otherwise
*@precondition r and c are valid indices of the board array
*@postcondition the board is only changed when the function returns true
* in which case the queen is added and all it's threatened positions are incremented.
*/
private boolean addQueen(int[][] arr, int r, int c){
    if(arr[r][c]>0){
        return false;
    }
arr[r][c]=-1;
for(int i = 1;i<arr.length-r;i++){
    if(c+i<arr[0].length){
        arr[r+i][c+i]++;
    }
    if(c-i>=0){
        arr[r+i][c-i]++;
    }
    arr[r+i][c]++;
}
return true;
}

/**Remove the queen that was added to r,c
*@precondition r and c are valid indices of the board array and there is a queen at position r,c
*@postcondition the board is modified to remove that queen and all it's
*threatened positions are decremented
*/
private void removeQueen(int[][] arr, int r, int c){
arr[r][c]=0;
for(int i = 1;i<arr.length-r;i++){
    if(c+i<arr[0].length){
        arr[r+i][c+i]--;
    }
    if(c-i>=0){
        arr[r+i][c-i]--;
    }
    arr[r+i][c]--;
}
}