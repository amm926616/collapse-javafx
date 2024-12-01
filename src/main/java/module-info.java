module com.amm.firstapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.amm.firstapp to javafx.fxml;
    exports com.amm.firstapp;
}