package sample;

import java.util.Random;

public class Board {
    private Tile[][] tiles;

    public Board() {
        randomizeBoard();
    }

    public void randomizeBoard(){
        Random random = new Random();
        tiles = new Tile[4][4];
        for (int x = 0; x<8; x++){
            int num = random.nextInt(15)+1;

            generateTile(random, num);
            generateTile(random, num);
        }
    }

    private void generateTile(Random random, int num) {
        int i = random.nextInt(4);
        int j = random.nextInt(4);
        while(tiles[i][j] != null){
            i = random.nextInt(4);
            j = random.nextInt(4);
        }
        tiles[i][j] = new Tile(num);
    }

    public void printBoard(){
        for (int i=0; i<tiles.length; i++){
            for (int j=0; j<tiles.length; j++){
                System.out.print(tiles[i][j].getValue() + " ");
            }
            System.out.println();
        }
    }
}