package manager.analyse;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;

public class Analyse {

    @FXML
    public PieChart pieChart;

    @FXML
    public Button search;

    @FXML
    public PieChart ygpieChart;

    public void searchClick(ActionEvent actionEvent) {
        ObservableList<PieChart.Data> answer = FXCollections.observableArrayList();
        answer.addAll(new PieChart.Data("水形物语", 17.56),
                new PieChart.Data("三块广告牌", 31.37),
                new PieChart.Data("黑豹", 35));
        pieChart.setData(answer);
        ObservableList<PieChart.Data> ans = FXCollections.observableArrayList();
        ans.addAll(new PieChart.Data("sss", 17.56),
                new PieChart.Data("sss", 31.37),
                new PieChart.Data("ccc", 35));
        ygpieChart.setData(ans);
    }
}
