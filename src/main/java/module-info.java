module com.example.ebobekok {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ebobekok to javafx.fxml;
    exports com.example.ebobekok;
}