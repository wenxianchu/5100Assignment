module com.example.week10 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculator to javafx.fxml;
    exports com.example.calculator;
}