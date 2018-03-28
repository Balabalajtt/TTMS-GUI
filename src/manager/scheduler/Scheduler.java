package manager.scheduler;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Scheduler {

    @FXML
    public HBox hBoxContent;

    public void init() {



    }

    public void modify(ActionEvent actionEvent) {
        Stage primaryStage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("modify.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        primaryStage.setTitle("修改电影场次");
        primaryStage.setScene(new Scene(root, 360, 600));
        primaryStage.show();
    }

    public void add(ActionEvent actionEvent) {
        Stage primaryStage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("add.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        primaryStage.setTitle("添加影片");
        primaryStage.setScene(new Scene(root, 360, 600));
        primaryStage.show();
    }
}
