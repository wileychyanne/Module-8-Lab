import javax.swing.JOptionPane;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        int firstScore, secondScore, thirdScore;
        char grade;
        String outputStr;
        //ask user to enter test scores and convert them into integers
        String score1Input = JOptionPane.showInputDialog("Enter the first test score: ");
        firstScore = Integer.parseInt(score1Input);
        String score2Input = JOptionPane.showInputDialog("Enter the second test score: ");
        secondScore = Integer.parseInt(score2Input);
        String score3Input = JOptionPane.showInputDialog("Enter the third test score: ");
        thirdScore = Integer.parseInt(score3Input);
        //calculate the average
        double average = (double)(firstScore + secondScore + thirdScore) / 3;
        //use if, else if, else to determine what grade they will receive
        if (average <= 100 && average >= 90){
            grade = 'A';
        }
        else if (average >= 80) {
            grade = 'B';
        }
        else if (average >= 70) {
            grade = 'C';
        }
        else if (average >= 60) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }
        //make output string
        outputStr = "Average Score: " + average + "\n"
                + "Letter Grade: " + grade;
        //show message dialog
        JOptionPane.showMessageDialog(null, outputStr);
    }
}
