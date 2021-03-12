package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    public  int i = 0;
    @FXML
    private Label MYlabel;

    @FXML
    private Button MYbutton;

    @FXML
    void click(ActionEvent event) {
        /*try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            MYlabel.setText("Connection succesfull!");

        }
        catch(Exception ex){
            MYlabel.setText("Connection failed...");
        }*/
        Main.kek="eke";
        MYlabel.setText(Main.kek);
    }

}
