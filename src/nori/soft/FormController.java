/**
 * "Form.fxml"コントローラ・クラスのサンプル・スケルトン
 */

package nori.soft;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;

public class FormController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="savefileMenuItem"
    private MenuItem savefileMenuItem; // Value injected by FXMLLoader

    @FXML // fx:id="saveasMenuItem"
    private MenuItem saveasMenuItem; // Value injected by FXMLLoader

    @FXML // fx:id="CopyMenuItem"
    private MenuItem CopyMenuItem; // Value injected by FXMLLoader

    @FXML // fx:id="PasteMenuItem"
    private MenuItem PasteMenuItem; // Value injected by FXMLLoader

    @FXML // fx:id="gridPane"
    private GridPane gridPane; // Value injected by FXMLLoader

    @FXML // fx:id="textArea"
    private TextArea textArea; // Value injected by FXMLLoader

    @FXML
    void copyLine(ActionEvent event) {

    }

    @FXML
    void pasteLine(ActionEvent event) {

    }

    @FXML
    void saveFile(ActionEvent event) {
        
    }

    @FXML
        // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert savefileMenuItem != null : "fx:id=\"savefileMenuItem\" was not injected: check your FXML file 'Form.fxml'.";
        assert saveasMenuItem != null : "fx:id=\"saveasMenuItem\" was not injected: check your FXML file 'Form.fxml'.";
        assert CopyMenuItem != null : "fx:id=\"CopyMenuItem\" was not injected: check your FXML file 'Form.fxml'.";
        assert PasteMenuItem != null : "fx:id=\"PasteMenuItem\" was not injected: check your FXML file 'Form.fxml'.";
        assert gridPane != null : "fx:id=\"gridPane\" was not injected: check your FXML file 'Form.fxml'.";
        assert textArea != null : "fx:id=\"textArea\" was not injected: check your FXML file 'Form.fxml'.";

    }
}
