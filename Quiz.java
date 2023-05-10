public class Quiz {

        public static void main(String[] args) {

                Question question1 = new TrueFalseQuestion("It is important to learn", "T");
                Question question2 = new TrueFalseQuestion("It is good to have friends", "T");
                Question question3 = new TrueFalseQuestion("Being healthy is not important", "F");
                Question question4 = new TrueFalseQuestion("Penguins can fly", "F");
                Question question5 = new TrueFalseQuestion("Learning Java is fun", "T");

                question1.check();
                question2.check();
                question3.check();
                question4.check();
                question5.check();

                MultipleChoiceQuestion.showResults();

        }
}