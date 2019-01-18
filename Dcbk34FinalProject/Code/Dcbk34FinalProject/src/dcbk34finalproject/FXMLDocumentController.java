/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dcbk34finalproject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author dylan
 */
public class FXMLDocumentController extends Switchable implements Initializable {
    private Stage stage;
    
    @FXML
    public Button loginButton;
    
    @FXML
    private void handleLogin(ActionEvent event) {
        Switchable.switchTo("NewsViewer");
        NewsViewerController controller = (NewsViewerController)getControllerByName("NewsViewer");
        
        controller.ready(stage);
        
        //System.out.println("testing");
    }   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    
    
}
