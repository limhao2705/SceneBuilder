package application;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.scene.control.MenuButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class FXMLController {

		// TODO Auto-generated method stub
	    @FXML
	    private JFXButton dashboard;

	    @FXML
	    private JFXButton dashboard1;

	    @FXML
	    private JFXButton dashboard11;

	    @FXML
	    private JFXButton dashboard111;

	    @FXML
	    private AnchorPane head;

	    @FXML
	    private AnchorPane nav_bar;

	    @FXML
	    private MenuButton profile;

	    @FXML
	    private JFXButton profile_setting;

	    @FXML
	    private AnchorPane top;

	    @FXML
	    private JFXButton top_button;

	    @FXML
	    private BorderPane window;
	    
	    public void close() {
	    	System.exit(0);
	    }
}

