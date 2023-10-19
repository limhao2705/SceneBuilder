package application;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class sceneController implements Initializable{

    @FXML
    private TableView<?> AI_tableView;

    @FXML
    private VBox aiSug_form;
    
    @FXML
    private JFXButton login_btn;
    
    @FXML
    private JFXButton ai_btn;
    
    @FXML
    private JFXButton addMed_btn;
    
    @FXML
    private TextArea ai_solution;

    @FXML
    private VBox bg;

    @FXML
    private JFXButton close;

    @FXML
    private JFXButton dashboard_btn;

    @FXML
    private VBox dashboard_form;
    
    @FXML
    private VBox addMed_form;

    @FXML
    private AnchorPane head;

    @FXML
    private AnchorPane main_form;

    @FXML
    private JFXButton minimize;

    @FXML
    private AnchorPane nav_bar;

    @FXML
    private JFXButton order_btn;

    @FXML
    private VBox order_form;

    @FXML
    private MenuButton profile;

    @FXML
    private JFXButton profile_btn;

    @FXML
    private JFXButton purchase_addtocartBtn;

    @FXML
    private JFXButton purchase_payBtn;

    @FXML
    private JFXButton report_btn;

    @FXML
    private VBox report_form;

    @FXML
    private HBox search;

    @FXML
    private AnchorPane top;

    @FXML
    private AnchorPane white_bg;

    // switches scenes in the navigation bar
    public void switchScene(ActionEvent event){
    	if(event.getSource() == dashboard_btn) {
    		dashboard_form.setVisible(true);
    		aiSug_form.setVisible(false);
    		order_form.setVisible(false);
    		report_form.setVisible(false);
    		
    		dashboard_btn.setStyle("-fx-background-color: #d7dbd8");
    		ai_btn.setStyle("-fx-background-color: transparent");
    		order_btn.setStyle("-fx-background-color: transparent");
    		report_btn.setStyle("-fx-background-color: transparent");
    	}
    	else if(event.getSource() == ai_btn) {
    		dashboard_form.setVisible(false);
    		aiSug_form.setVisible(true);
    		order_form.setVisible(false);
    		report_form.setVisible(false);
    		
    		ai_btn.setStyle("-fx-background-color: #d7dbd8");
    		dashboard_btn.setStyle("-fx-background-color: #transparent");
    		order_btn.setStyle("-fx-background-color: transparent");
    		report_btn.setStyle("-fx-background-color: transparent");
    	}
    	else if(event.getSource() == order_btn) {
    		dashboard_form.setVisible(false);
    		aiSug_form.setVisible(false);
    		order_form.setVisible(true);
    		report_form.setVisible(false);
    		
    		ai_btn.setStyle("-fx-background-color: transparent");
    		dashboard_btn.setStyle("-fx-background-color: transparent");
    		order_btn.setStyle("-fx-background-color: #d7dbd8");
    		report_btn.setStyle("-fx-background-color: transparent");
    	}
    	else if(event.getSource() == report_btn) {
    		dashboard_form.setVisible(false);
    		aiSug_form.setVisible(false);
    		order_form.setVisible(false);
    		report_form.setVisible(true);
    		
    		ai_btn.setStyle("-fx-background-color: transparent");
    		dashboard_btn.setStyle("-fx-background-color: transparent");
    		order_btn.setStyle("-fx-background-color: transparent");
    		report_btn.setStyle("-fx-background-color: #d7dbd8");
    	}
    	else if(event.getSource() == login_btn) {
    		ai_btn.setStyle("-fx-background-color: transparent");
    		dashboard_btn.setStyle("-fx-background-color: transparent");
    		order_btn.setStyle("-fx-background-color: transparent");
    		report_btn.setStyle("-fx-background-color: transparent");
    		login_btn.setStyle("-fx-background-color: #d7dbd8");
    	}
    }
    
    public void signin(ActionEvent event) throws IOException {
    	Alert alert;
    	alert = new Alert(AlertType.CONFIRMATION);
    	alert.setTitle("Confirmation");
    	alert.setHeaderText(null);
    	alert.setContentText("Are you an administrator?");
    	//default buttontype is "ok" and cancel", change that using this method.
        alert.getButtonTypes().setAll(ButtonType.YES, ButtonType.NO);
    	Optional<ButtonType> option = alert.showAndWait();
    	if(option.get().equals(ButtonType.YES)) {    		
    		// hide the previous window(the user interface)
    		//login_btn.getScene().getWindow().hide();
    		Stage stage = new Stage ();
    		//link ur login form
    		Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
    		Scene scene = new Scene(root);
    		
    		
    		stage. initStyle (StageStyle.TRANSPARENT) ;
    		stage. setScene (scene);
    		stage.show () ;
    	}
    }
    
    public void close() {
    	System.exit(0);
    }
	public void initialize(URL url, ResourceBundle rb) {
    	
    }
}
