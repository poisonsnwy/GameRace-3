package ua.games;

import com.cs.engine.cell.Color;
import com.cs.engine.cell.Game;

public class RaceGame extends Game {
    public static final int WIDTH = 64;
    public static final int HEIGHT = 64;
    public static final int ROADSIDE_WIDTH = 14;
    public static final int CENTER_X = WIDTH/2;
public void initialize (){
    setScreenSize(WIDTH,HEIGHT);
    showGrid(false);
    createGame();
}

    private void createGame() {
    drawScene();
    }
/**
 * Метод відмальовки усіх ігрових об'єктів
 *
 *
 */
    private void drawScene() {
drawField();
    }
    /**
     * Метод відмальовки ігрового поля
     *
     */
    private void drawField() {
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                if (CENTER_X==x){
            }
                if (ROADSIDE_WIDTH < x && x < WIDTH-ROADSIDE_WIDTH){
                    setCellColor(x,y, Color.DIMGRAY);


                }else {
                    setCellColor(x, y, Color.GREEN);
                    setCellColor(x, y, Color.GREEN);
                }
            }

        }

    }

    @Override
    public void setCellColor(int x, int y, Color color) {
        if (x>=0 && x< WIDTH&& y >= 0 &&y < HEIGHT ) {

        }
        super.setCellColor(x, y, color);
    }
}
