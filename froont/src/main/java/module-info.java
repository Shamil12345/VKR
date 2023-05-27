module com.example.front {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.front to javafx.fxml;
    exports com.example.front;
}