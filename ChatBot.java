import java.util.Scanner; 
public class ChatBot {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("ChatBot: Hello! I am your chatbot.");
         while (true) {
            System.out.print("You: ");
            String userText = sc.nextLine();
            String text = userText.toLowerCase().trim();
            String reply;
            if (text.contains("hello") || text.contains("hi")) {
                reply = "Hello! Please ask your question!";
            } else if (text.contains("how many states are there in india")) {
                reply = "There are 28 states in India.";
            } 
            else if (text.contains("what is the capital of uttar pradesh")) {
                reply = "The capital of Uttar Pradesh is Lucknow.";
            }
            else if (text.contains("how many districts are there in uttar pradesh")) {
                reply = "There are 75 districts in Uttar Pradesh.";
            }
            else if (text.contains("bye")) {
                reply = "Goodbye! Have a nice day.";
                System.out.println("ChatBot: " + reply);
                break; 
            } 
            else {
                reply = "Sorry Mahima, I don't understand that.";
            }
            System.out.println("ChatBot: " + reply);
        }

        sc.close(); 
    }
}
