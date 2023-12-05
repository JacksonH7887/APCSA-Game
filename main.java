//Model
class Grid {
    private char[] [] grid;

    public Grid(int rows, int cols){
        grid = new char[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                grid[i][j] = '◦';
            }
        }
    }

    public void setCell(int row, int col, char value){
        grid[row][col] = value; 
    }

    public char[][] getGrid(){
        return grid;
    }
}

//View
class GridView{
    String Blue = "\u001B[34m";
    int lineCount = 0;
    public void displayGrid(char[][] grid){
        for(char[] row : grid){
            for(char cell : row){
                System.out.print(Blue + cell + " ");
            }
            System.out.println();
            lineCount += 1;
            if(lineCount < 8) System.out.print(" "); 
        }
    }
}

//Controller
class GridController{
    private Grid model;
    private GridView view;

    public GridController(Grid model, GridView view){
        this.model= model;
        this.view = view;
    }

    public void updateView() {
        view.displayGrid(model.getGrid());
    }

    public void setCell(int row, int col, char value){
        model.setCell(row, col, value);
    }
}

//Main
public class Main {
    public static void main(String[] args){
        Grid model = new Grid(9, 9);
        GridView view = new GridView();
        GridController controller = new GridController(model, view);

        controller.setCell(0, 0, '⬛');
        controller.setCell(0, 8, '⬛');
        controller.setCell(8, 0, '⬛');
        controller.setCell(8, 8, '⬛');

        for(int i = 1; i < 8; i++){
            controller.setCell(i, 0, '▪');
        }
        for(int i = 1; i < 8; i++){
            controller.setCell(i, 8, '▪');
        }
        for(int i = 1; i < 8; i++){
            controller.setCell(0, i, '▪');
        }
        for(int i = 1; i < 8; i++){
            controller.setCell(8, i, '▪');
        }
        controller.updateView();
    }
}