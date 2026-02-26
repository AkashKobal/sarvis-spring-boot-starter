package io.github.akashkobal.dto;
import java.util.List;

public class ChatRequest {

    private String model;
    private List<Message> messages;

    // Default constructor
    public ChatRequest() {
    }

    // Parameterized constructor
    public ChatRequest(String model, List<Message> messages) {
        this.model = model;
        this.messages = messages;
    }

    // Getter and Setter for model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getter and Setter for messages
    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "ChatRequest{" +
                "model='" + model + '\'' +
                ", messages=" + messages +
                '}';
    }

    // Static inner Message class
    public static class Message {

        private String role;
        private String content;

        // Default constructor
        public Message() {
        }

        // Parameterized constructor
        public Message(String role, String content) {
            this.role = role;
            this.content = content;
        }

        // Getter and Setter for role
        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        // Getter and Setter for content
        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        @Override
        public String toString() {
            return "Message{" +
                    "role='" + role + '\'' +
                    ", content='" + content + '\'' +
                    '}';
        }
    }
}