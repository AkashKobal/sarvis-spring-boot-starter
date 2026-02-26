package io.github.akashkobal.dto;

import java.util.List;

public class ChatResponse {

    private List<Choice> choices;

    // Default constructor
    public ChatResponse() {
    }

    // Parameterized constructor
    public ChatResponse(List<Choice> choices) {
        this.choices = choices;
    }

    // Getter
    public List<Choice> getChoices() {
        return choices;
    }

    // Setter
    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }

    @Override
    public String toString() {
        return "ChatResponse{" +
                "choices=" + choices +
                '}';
    }

    // Choice class
    public static class Choice {

        private Message message;

        // Default constructor
        public Choice() {
        }

        // Parameterized constructor
        public Choice(Message message) {
            this.message = message;
        }

        // Getter
        public Message getMessage() {
            return message;
        }

        // Setter
        public void setMessage(Message message) {
            this.message = message;
        }

        @Override
        public String toString() {
            return "Choice{" +
                    "message=" + message +
                    '}';
        }

        // Message class
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

            // Getter
            public String getRole() {
                return role;
            }

            // Setter
            public void setRole(String role) {
                this.role = role;
            }

            // Getter
            public String getContent() {
                return content;
            }

            // Setter
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
}