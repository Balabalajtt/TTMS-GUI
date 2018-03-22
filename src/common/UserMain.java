package common;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class UserMain {

    @FXML
    public BorderPane contentPane;

    public void login(MouseEvent mouseEvent) {
        Stage primaryStage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("../common/login/login.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        primaryStage.setTitle("请登录");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
        StageList.stageList.add(primaryStage);
    }

    public void hotClick(ActionEvent actionEvent) {
        contentPane.getChildren().clear();
        Pane pane = null;
        try {
            pane = FXMLLoader.load(getClass().getResource("../normal/hot/hot.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        contentPane.setCenter(pane);
    }

    public void foreshowClick(ActionEvent actionEvent) {

    }

    public void orderClick(ActionEvent actionEvent) {

    }

    public void aboutClick(ActionEvent actionEvent) {

    }
}
