
public class Sudoku {

	public static void main(String[] args){
		String [] ss = {"..9748...","7........",".2.1.9...","..7...24.",".64.1.59.",".98...3..","...8.3.2.","........6","...2759.."};
		char[][] board = new char[9][];
		for(int i =0; i<9; i++){
			board[i] = ss[i].toCharArray();
		}
		
		for(int i=0;i<9;i++){
			for(int j=0; j<9;j++){
				System.out.print(board[i][j]);
			}
			System.out.print('\n');
		}
		
		solveSudoku(board);
		
		for(int i=0;i<9;i++){
			for(int j=0; j<9;j++){
				System.out.print(board[i][j]);
			}
			System.out.print('\n');
		}
		
	}
	
	
    public static void solveSudoku(char[][] board) {
        // Start typing your Java solution below
        // DO NOT write main() function
        solveSudoku(board,-1,-1);
        
    }
    
    public static char[][] solveSudoku(char[][] board, int x, int y){
        
        int i=0;
        int j=0;
        int posx =x;
        int posy = y;
        boolean find =false;
        if(x<0||y<0){
            for(i =0; i<9;i++){
                for(j=0;j<9;j++){
                    if(board[i][j]=='.'&&find==false){
                        posx = i;
                        posy = j;
                        find = true;
                        break;
                    }
                }
                if(find == true){
                	break;
                }
            }
            
            
        }
        
        
        
        while(board[posx][posy] !='9'){
        	if(board[posx][posy]=='.'){
                board[posx][posy] = '1';
            }else if (board[posx][posy]>='1'&&board[posx][posy]<'9'){
                board[posx][posy]+=1;
                
            }
        	
        	
        	 if(checkPartial(board, posx, posy)==true){
                 
             	
             	find =false;
             	for(i =0; i<9;i++){
             		for(j=0;j<9;j++){
             			if(board[i][j]=='.'&&find==false){
                                 find = true;
                                 break;
                         }
                     }
                     if(find == true){
                         	break;
                     }
                 }
                     
                 if(i==9&&j==9){
                     return board;
                 }
                 else{
                    char[][] temp = solveSudoku(board, i, j);
                    if(temp == null){
                        continue;
                    }else {
                        return temp;
                    }
                 }
                 
             }
        	
        }
        board[posx][posy]='.';
        return null;
        
       
        
    }
    
    public static boolean checkPartial(char[][] board, int posx, int posy){
        for(int i =0; i<9; i++){
            if(i!=posx&&board[i][posy]==board[posx][posy]){
                return false;
            }
        }
        
        for(int j=0; j<9; j++){
            if(j!=posy&&board[posx][j]==board[posx][posy]){
                return false;
            }
        }
        
        for(int i=posx/3*3;i<posx/3*3+3;i++){
            for(int j= posy/3*3;j<posy/3*3+3;j++){
                if(i!=posx&&j!=posy&&board[i][j]==board[posx][posy]){
                    return false;
                }
            }
        }
        
        return true;
        
    }
    
    
    
    
    
    
}
