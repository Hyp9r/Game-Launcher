package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class Controller {


    public void buttonClickHandler(ActionEvent event){
        Button clickedButton = (Button) event.getTarget();
        if(clickedButton.getText().equals("X")){
            System.out.println("Exiting the launcher");
            System.exit(0);
        }
    }
}
