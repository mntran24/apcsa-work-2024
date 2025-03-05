How would you solve this problem with recursive backtracking? Would you duplicate the entire board each time you make the recursive call?
When there is no where else to place another queen, we remove the last queen and continue the recursion.

How could you place the queens on the board making sure no queens will attach each other?
We need to mark where a square is attacked so we know not to place a queen there.

How can you indicate if a position on the board is safe to add a queen?
Add 1 to the number at that position.
