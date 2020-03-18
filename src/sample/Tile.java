package sample;

public class Tile {
    private TileStatus status;
    private int value;

    public Tile(int value) {
        this.status = TileStatus.HIDDEN;
        this.value = value;
    }

    public TileStatus getStatus() {
        return status;
    }
    public void setStatus(TileStatus status) {
        this.status = status;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}