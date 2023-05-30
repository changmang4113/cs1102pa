public class Quiz {

        public static void main(String[] args) {

                Question question1 = new MultipleChoiceQuestion(
                                "What is the name of the bounty hunter who captures Han Solo in Episode V?",
                                new String[] { "Boba Fett", "Jango Fett", "IG-88", "Dengar", "Bossk" },
                                "A");

                Question question2 = new MultipleChoiceQuestion(
                                "Which planet is the home of the Wookiees?",
                                new String[] { "Tatooine","Endor", "Hoth", "Kashyyyk", "Dagobah", "Coruscant", "Naboo", "Alderaan", "Bespin", "Yavin", "Geonosis", "Mustafar"},
                                "D");

                question1.check();
                question2.check();

                MultipleChoiceQuestion.showResults();

        }
}