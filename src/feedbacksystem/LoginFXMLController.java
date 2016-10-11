package feedbacksystem;

import fs.bean.Login;
import fs.dao.LoginDAO;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Anshul Mehta
 */
public class LoginFXMLController implements Initializable, utilities {
 static  String file[] = new String[2];
    
    public static String Userid;
    @FXML
    private TextField userid;
    @FXML
    private PasswordField password;
    @FXML
    private Button submit;
    @FXML
    private Label ermsg;
    private Label msg;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("IN:LoginFXML");
    }

    @FXML
    private void he(ActionEvent event) throws IOException, InterruptedException {

        Login l = new Login();
        LoginDAO ld = new LoginDAO();
       
        file[0] = "FXMLDocument.fxml";
        file[1] = "exitFXML.fxml";
        if (event.getSource() == submit) {

            if (FeedBackSystem.isProcessRunning("xampp-control")) {
                l.setUserid(userid.getText());
                l.setPassword(password.getText());
                System.out.println(userid.getText() + " " + password.getText() + " 1");
                boolean search = ld.search(l);
                System.out.println(search + "" + userid.getText() + "" + password.getText() + " 3");
                Userid = l.getUserid();
                if (search == true) {

                    if (ld.getsubmit(l.getUserid()) == false) {

                        SceneChanger(file[0]);
                    } else {
                        SceneChanger(file[1]);
                    }
                } else {

                    ermsg.setText("Credentials Not Found");
                }
            } else {

                ermsg.setText("Starting Xampp Server!!");
                FeedBackSystem.xampp_start();
            }
        }
    }

    void SceneChanger(String name) throws IOException {
        Stage stage;
        System.out.println(name);
        Parent root;
        
        stage = (Stage) submit.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource(name));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

}
