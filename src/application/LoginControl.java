package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class LoginControl implements Initializable{

    @FXML
    private JFXButton close;

    @FXML
    private JFXButton login_btn;

    @FXML
    private BorderPane login_form;

    @FXML
    private AnchorPane login_left;
    
    @FXML
    private TextField username;
    
    @FXML 
    private PasswordField password;
    
    @FXML
    private Label loginMsgBtn;
    
    
    public void signin(ActionEvent event) throws IOException{
    	
    	if(username.getText().isBlank() || password.getText().isBlank()) {
    		loginMsgBtn.setText("Please fill out the username/password!");
    	}
    	else if (username.getText().equals("admin") && password.getText().equals("admin123")) {
    		loginMsgBtn.setText("Succeed!"); // not neccessary but i just want to.
    		Stage stage = new Stage();
    		//linking the login page to the admin page after login
    		Parent root = FXMLLoader.load(getClass().getResource("admin.fxml"));
    		Scene scene = new Scene(root);
    		
    		stage.initStyle(StageStyle.TRANSPARENT);
    		stage.setScene(scene);
    		stage.show();
    		//after successfully login this will hide the login page.
    		login_btn.getScene().getWindow().hide();
    		}
    	else if(username.getText().equals("admin") == false || password.getText().equals("admin123") == false) {
    		loginMsgBtn.setText("Wrong password/username!");
    	}

    	}
    	
    public void close() {
    	System.exit(0);
    }
	public void initialize(URL url, ResourceBundle rb) {
    	
    }
}
