package normal.foreshow;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class Foreshow {
    @FXML
    public MediaView m1;
    @FXML
    public MediaView m2;
    @FXML
    public MediaView m3;
    @FXML
    public MediaView m4;

    {


        init();

    }

    public void init() {

        System.out.println(m1);
    }

    public void ccc(MouseEvent mouseEvent) {
        init();
        String source = "http://uc.cdn.kaiyanapp.com/6b7cb67fce3a5fe446c55045c254bd1c_1280x720.mp4?t=1521881659&k=d97392d341d43fd2";
        Media media = new Media(source);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        m4.setMediaPlayer(mediaPlayer);
        System.out.println(mediaPlayer + "  " + media);
        mediaPlayer.play();
    }
}
