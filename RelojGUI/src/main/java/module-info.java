module com.example.relojgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.relojgui to javafx.fxml;
    exports com.example.relojgui;
}