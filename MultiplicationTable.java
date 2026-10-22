import javax.swing.JOptionPane;
public class MultiplicationTable {
    public static void main(String[] args) {
        int integer, product;
        //initialize outputStr to empty string so it can store the multiplication table
        String integerStr, outputStr = "";
        //ask user to enter integer
        integerStr = JOptionPane.showInputDialog("Enter an integer between 1 and 12: ");
        integer = Integer.parseInt(integerStr);
        //use for loop, less than equal 12
        for (int i = 1; i <= 12; i++) {
            product = integer * i;
            //add outputStr to the string because it keeps the previous
            //multiplication and adds the next one
            outputStr = outputStr + integer + " x " + i + " = " + product + "\n";
        }
        //show output in dialog box
        JOptionPane.showMessageDialog(null, outputStr);
    }
}
