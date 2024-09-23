module es.ieslosmontecillos.helloworldjavafxstyle {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.helloworldjavafxstyle to javafx.fxml;
    exports es.ieslosmontecillos.helloworldjavafxstyle;
}