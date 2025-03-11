module com.javafx.ai_voice_teaching {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.javafx.ai_voice_teaching to javafx.fxml;
    exports com.javafx.ai_voice_teaching;
}