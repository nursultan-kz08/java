module com.shop.itprog {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.shop.itprog to javafx.fxml;
    exports com.shop.itprog;
}