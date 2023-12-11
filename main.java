//Main
public class Main {
    public static void main(String[] args){
        Grid model = new Grid(11, 11);
        GridView view = new GridView();
        GridController controller = new GridController(model, view);

        controller.setCell(0, 0, '⬛');
        controller.setCell(0, 10, '⬛');
        controller.setCell(10, 0, '⬛');
        controller.setCell(10, 10, '⬛');

        for(int i = 1; i < 10; i++){
            controller.setCell(i, 0, '▪');
        }
        for(int i = 1; i < 10; i++){
            controller.setCell(i, 10, '▪');
        }
        for(int i = 1; i < 10; i++){
            controller.setCell(0, i, '▪');
        }
        for(int i = 1; i < 10; i++){
            controller.setCell(10, i, '▪');
        }
        controller.updateView();
    }
}