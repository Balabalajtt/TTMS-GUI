package common;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;


public class ManagerMain {

    @FXML
    private Button accountBtn;
    @FXML
    private Button hallBtn;
    @FXML
    private Button schedulerBtn;
    @FXML
    private Button ticketBtn;
    @FXML
    private Button analyseBtn;
    @FXML
    private Button aboutBtn;

    @FXML
    private BorderPane contentPane;

    @FXML
    protected void accountClick() {

        /**
         * 加自己的界面在contentPane.getChildren()中
         */

        contentPane.getChildren().clear();
        BorderPane pane = null;
        try {
            pane = FXMLLoader.load(getClass().getResource("../manager/account/account.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        contentPane.setCenter(pane);
    }

    @FXML
    protected void hallClick() {
        contentPane.getChildren().clear();
        BorderPane pane = null;
        try {
            pane = FXMLLoader.load(getClass().getResource("../manager/hall/hall.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        contentPane.setCenter(pane);
    }

    @FXML
    protected void schedulerClick() {

        contentPane.getChildren().clear();
        BorderPane pane = null;
        try {
            pane = FXMLLoader.load(getClass().getResource("../manager/scheduler/scheduler.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        contentPane.setCenter(pane);

    }

    @FXML
    protected void ticketClick() {
        contentPane.getChildren().clear();
        Pane pane = null;
        try {
            pane = FXMLLoader.load(getClass().getResource("../manager/ticket/ticket.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        contentPane.setCenter(pane);

    }

    @FXML
    protected void analyseClick() {
        contentPane.getChildren().clear();
        Pane pane = null;
        try {
            pane = FXMLLoader.load(getClass().getResource("../manager/analyse/analyse.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        contentPane.setCenter(pane);
    }

    @FXML
    protected void aboutClick() {

        contentPane.getChildren().clear();
        Pane pane = null;
        try {
            pane = FXMLLoader.load(getClass().getResource("../manager/about/about.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        contentPane.setCenter(pane);
    }


    public void login(MouseEvent mouseEvent) {

            Stage primaryStage = new Stage();
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("../common/login/login.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            primaryStage.setTitle("魔仙堡宝大剧院");
            primaryStage.setScene(new Scene(root, 600, 400));
            primaryStage.show();
    }

}
