module com.example.compareprice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.compareprice to javafx.fxml;
    exports com.example.compareprice;
}