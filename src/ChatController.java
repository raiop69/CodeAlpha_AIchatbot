import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class ChatController {

    @FXML
    private VBox chatBox;

    @FXML
    private TextField inputField;

    private final ChatEngine engine = new ChatEngine();

    @FXML
    public void sendMessage() {

        String userMessage = inputField.getText();

        if(userMessage.isEmpty()) {
            return;
        }

        // User Message
        Label userLabel = new Label("You: "+userMessage);

        userLabel.setStyle(
                 "-fx-background-color: #007bff;" +
                "-fx-text-fill: white;" +
                "-fx-padding: 10;" +
                "-fx-background-radius: 12;"
        );

        chatBox.getChildren().add(userLabel);

    
        String response = engine.getResponse(userMessage);

        Label botLabel = new Label("Chatbot: " + response);

        botLabel.setStyle(
                "-fx-background-color: #353535;" +
                "-fx-padding: 10;" +
                "-fx-background-radius: 12;"
        );

        chatBox.getChildren().add(botLabel);

        inputField.clear();
    }
}