module com.example.dados {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dados to javafx.fxml;
    exports com.example.dados;
}