public class Quiz {

        public static void main(String[] args) {

                Question question1 = new TrueFalseQuestion(
                        "It is important to learn", "TRUE");
                // Question question2 = new TrueFalseQuestion(
                //         "It is good to have friends", "TRUE");

                // Question question3 = new MultipleChoiceQuestion(
                //         "What is the name of the bounty hunter who captures Han Solo in Episode V?",
                //         "Boba Fett", "Jango Fett",
                //         "IG-88", "Dengar", "Bossk", "A");

                question1.check();
                // question2.check();
                // question3.check();

                MultipleChoiceQuestion.showResults();

        }
}