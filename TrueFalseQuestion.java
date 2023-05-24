import javax.swing.JOptionPane;
import java.awt.*;
import javax.swing.*;

public class TrueFalseQuestion extends Question {

    // Constructor
    TrueFalseQuestion(String question, String answer) {
        this.question = new QuestionDialog();
        this.question.setLayout(new GridLayout(0, 1));
        this.question.add(new JLabel("     " + question + "     ", JLabel.CENTER));
        JPanel buttons = new JPanel();
        addButton(buttons, "TRUE");
        addButton(buttons, "FALSE");
        this.question.add(buttons);
        this.question.setModal(true);
        this.question.pack();
        this.question.setLocationRelativeTo(null);
        correctAnswer = answer.toUpperCase();
    }

    // Methods
    String ask() {
        question.setVisible(true);
        return question.answer;

        // String answer = JOptionPane.showInputDialog(question);
        // answer = answer.toUpperCase();
        // if (answer.equals("T") || answer.equals("TRUE") || answer.equals("Y") || answer.equals("YES")) {
        //     answer = "TRUE";
        // } else if (answer.equals("F") || answer.equals("FALSE") || answer.equals("N") || answer.equals("NO")) {
        //     answer = "FALSE";
        // }
        // System.out.println("Answer: " + answer);

        // if (answer.equals("TRUE") || answer.equals("FALSE")) {
        //     return answer;
        // } else {
        //     JOptionPane.showMessageDialog(null, "Invalid answer. Please enter True or False.");
        //     return ask();
        // }
    }
    void addButton(JPanel buttons, String label){
        JButton button = new JButton(label);
        button.addActionListener(question);
        buttons.add(button);
    }
}
