import javax.swing.JOptionPane;
public class MultiplicationTable {
    public static void main(String[] args) {
        int integer, product;
        //initialize outputStr to empty string so it can store the multiplication table
        String integerStr, outputStr = "";
        //ask user to enter integer
        integerStr = JOptionPane.showInputDialog("Enter an integer between 1 and 12: ");
        integer = Integer.parseInt(integerStr);
        //initialize i to 1
        int i = 1;
        while (i <= 12) {
            product = integer * i;
            //add outputStr to the string because it keeps the previous
            //multiplication and adds the next one
            outputStr = outputStr + integer + " x " + i + " = " + product + "\n";
            //increase counter by 1
            i++;
        }
        //show output in dialog box
        JOptionPane.showMessageDialog(null, outputStr);
    }
}
