package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Board {
    private Tile[][] tiles;

    public Board() {
        randomizeBoard();
    }

    public int getTile(int h, int v){
        return tiles[h][v].getValue();
    }

    public void randomizeBoard(){
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        int num = 0;
        tiles = new Tile[4][4];
        for (int x = 0; x<8; x++){
            num = random.nextInt(15)+1;
            while(list.contains(num)){
                num = random.nextInt(15)+1;
            }
            list.add(num);

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

    public void showTiles(int value){
        for (int i=0; i<tiles.length; i++){
            for (int j=0; j<tiles.length; j++){
                if (tiles[i][j].getValue() == value){
                    tiles[i][j].setStatus(TileStatus.FOUND);
                }
            }
        }
    }
}