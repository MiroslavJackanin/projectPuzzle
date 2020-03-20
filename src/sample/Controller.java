package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class Controller {
    private Game game;

    public Button b0;
    public Button b1;
    public Button b2;
    public Button b3;
    public Button b4;
    public Button b5;
    public Button b6;
    public Button b7;
    public Button b8;
    public Button b9;
    public Button b10;
    public Button b11;
    public Button b12;
    public Button b13;
    public Button b14;
    public Button b15;

    public Controller(){
        game = new Game();
    }

    public void click(ActionEvent actionEvent) {
        int value = Integer.parseInt(((Button)actionEvent.getSource()).getId().substring(((Button)actionEvent.getSource()).getId().lastIndexOf("b")+1));
        if (game.getValue1() == 0 && game.getValue2() == 0){
            game.setValue1(value);
        }else if (game.getValue1() != 0 && game.getValue2() == 0) {
            game.setValue2(value);
            if (game.evaluate()){

            }
        }


    }
}
