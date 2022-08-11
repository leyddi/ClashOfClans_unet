module clashofclans.simulacion {
    requires javafx.controls;
    requires javafx.fxml;


    opens clashofclans.simulacion to javafx.fxml;
    exports clashofclans.simulacion;
}