package ua.games;

import com.cs.engine.cell.Game;

public class GameObject {
    public int x;
    public int y;
    public int [][] matrix;
    public int width;
    public int height;

    //Color.values()[matrix[y][x]]

    public GameObject(int x, int y, int[][] matrix, int width, int height) {
        this.x = x;
        this.y = y;
        this.matrix = matrix;
       width = matrix[0].length;
        height = matrix.length;
    }
    public void draw(Game game){
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

            }

        }
    }
}
