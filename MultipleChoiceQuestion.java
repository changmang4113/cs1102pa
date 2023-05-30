import java.awt.*;
import javax.swing.*;

public class MultipleChoiceQuestion extends Question {

    // Constructor
    MultipleChoiceQuestion(String query, String[] choices, String answer) {
        super(query);
        for (int i = 0; i < choices.length; i++) {
            addChoice((char) ('A' + i), choices[i]); // 選択肢の番号を追加
        }
        initQuestionDialog(); // 質問ダイアログの初期化を行う
        correctAnswer = answer.toUpperCase();
    }
    
    // Methods
    void addChoice(char option, String label){
        JPanel choice = new JPanel(new BorderLayout());
        JButton button = new JButton(Character.toString(option)); // 番号のみを表示
        button.addActionListener(question);
        choice.add(button, BorderLayout.WEST);
        choice.add(new JLabel(label, JLabel.LEFT), BorderLayout.CENTER); // 選択肢のみを表示
        question.add(choice);
    }
}
