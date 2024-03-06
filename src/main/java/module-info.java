module com.example.walletv2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.walletv2 to javafx.fxml;
    exports com.example.walletv2;
}