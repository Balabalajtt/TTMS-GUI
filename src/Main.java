
import common.StageList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("common/UserMain.fxml"));
        primaryStage.setTitle("魔仙堡宝大剧院");
        primaryStage.setScene(new Scene(root, 1500, 700));
        primaryStage.show();

        StageList.stageList.add(primaryStage);

    }

    public static void main(String[] args) {
        launch(args);
    }



}
