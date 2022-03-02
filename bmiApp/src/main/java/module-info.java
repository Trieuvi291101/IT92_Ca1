module com.trieuvi.bmiapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.trieuvi.bmiapp to javafx.fxml;
    exports com.trieuvi.bmiapp;
}
