import javax.swing.JOptionPane;

public class TrueFalseQuestion extends Question {

    // Constructor
    TrueFalseQuestion(String question, String answer) {
        this.question = "TRUE or FALSE: " + question;
        correctAnswer = answer.toUpperCase();
    }

    // Methods
    String ask() {
        String answer = JOptionPane.showInputDialog(question);
        answer = answer.toUpperCase();
        if (answer.equals("T") || answer.equals("TRUE") || answer.equals("Y") || answer.equals("YES")) {
            answer = "T";
        } else if (answer.equals("F") || answer.equals("FALSE") || answer.equals("N") || answer.equals("NO")) {
            answer = "F";
        }
        System.out.println("Answer: " + answer);

        if (answer.equals("T") || answer.equals("F")) {
            return answer;
        } else {
            JOptionPane.showMessageDialog(null, "Invalid answer. Please enter True or False.");
            return ask();
        }
    }
}
