module com.example.test_task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.test_task3 to javafx.fxml;
    exports com.example.test_task3;
}