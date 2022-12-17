module com.example.list_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.list_1 to javafx.fxml;
    exports com.example.list_1;
}