package common.login;

import common.StageList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sun.applet.Main;

import java.io.IOException;

public class Login {
    public void login(ActionEvent actionEvent) {
        Stage primaryStage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("../managerMain.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        primaryStage.setTitle("管理员");
        primaryStage.setScene(new Scene(root, 1500, 700));
        primaryStage.show();
        StageList.stageList.get(0).close();
        StageList.stageList.get(1).close();
        StageList.stageList.add(primaryStage);
    }
}
