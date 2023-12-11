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
    String Brown = "\u001B[30m";
    String Cyan = "\u001B[36m";	
    String Pink = "\u001B[35m";
    String Orange = "\u001B[37m";
    String Red = "\u001B[31m";	
    String Yellow = "\u001B[33m";
    String Green = "\u001B[32m";	
    String White = "\u001B[37m";
    int lineCount = 0;
    
    public void printSpace(){
        for(int i = 0; i < 9; i++){
            System.out.print(Brown + '◦' +" ");
        }
    }
    public void newLine(){
        System.out.println(); System.out.print(" "); 
    }
    public void displayGrid(char[][] grid){
        System.out.print(Blue + grid[0][0] + " ");
        System.out.print(Red + grid[0][1] + " ");
        System.out.print(White + "▢" + " ");
        System.out.print(Red + grid[0][3] + " ");
        System.out.print(Red + grid[0][4] + " ");
        System.out.print(White + "▢" + " ");
        System.out.print(Yellow + grid[0][6] + " ");
        System.out.print(Yellow + grid[0][7] + " ");
        System.out.print(White + "▢" + " ");
        System.out.print(Yellow + grid[0][9] + " ");
        System.out.print(Blue + grid[0][10] + " ");
        newLine();
        System.out.print(Orange + grid[1][0] + " ");
        printSpace();
        System.out.print(Green + grid[1][10] + " ");
        newLine();
        System.out.print(Orange + grid[2][0] + " ");
        printSpace();
        System.out.print(Green + grid[2][10] + " ");
        newLine();
        System.out.print(White + "▢" + " ");
        printSpace();
        System.out.print(White + "▢" + " ");
        newLine();
        System.out.print(Orange + grid[4][0] + " ");
        printSpace();
        System.out.print(Green + grid[4][10] + " ");
        newLine();
        System.out.print(White + "▢" + " ");
        printSpace();
        System.out.print(White + "▢" + " ");
        newLine();
        System.out.print(Pink + grid[6][0] + " ");
        printSpace();
        System.out.print(White + "▢" + " ");
        newLine();
        System.out.print(Pink + grid[7][0] + " ");
        printSpace();
        System.out.print(Blue + grid[7][10] + " ");
        newLine();
        System.out.print(White + "▢" + " ");
        printSpace();
        System.out.print(White + "▢" + " ");
        newLine();
        System.out.print(Pink + grid[9][0] + " ");
        printSpace();
        System.out.print(Blue + grid[9][10] + " ");
        System.out.println();
        System.out.print(Blue + grid[10][0] + " ");
        System.out.print(Cyan + grid[10][1] + " ");
        System.out.print(Cyan + grid[10][2] + " ");
        System.out.print(White + "▢" + " ");
        System.out.print(Cyan + grid[10][4] + " ");
        System.out.print(White + "▢" + " ");
        System.out.print(White + "▢" + " ");
        System.out.print(Brown + grid[10][7] + " ");
        System.out.print(White + "▢" + " ");
        System.out.print(Brown + grid[10][9] + " ");
        System.out.print(Blue + grid[10][10] + " ");
        System.out.println();
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
