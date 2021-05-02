import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Simple_Controller
{

    @FXML
    public Label lblOutput;

    public void sayHello(ActionEvent actionEvent)
    {

        lblOutput.setText("TEMP_JAVAFX");

    }
}
