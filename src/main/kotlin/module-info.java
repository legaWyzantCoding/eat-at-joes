module com.example.eatatjoes {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.eatatjoes to javafx.fxml;
    exports com.example.eatatjoes;
}