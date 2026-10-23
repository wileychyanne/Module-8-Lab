import javax.swing.JOptionPane;
public class RestaurantBillCalculator {
    public static void main(String[] args) {
        //ask user to enter meal cost and convert to double
        String mealInput = JOptionPane.showInputDialog("Enter the meal cost: ");
        double mealCost = Double.parseDouble(mealInput);
        //ask user to enter tip percentage and convert to double
        String tipInput = JOptionPane.showInputDialog("Enter the tip percentage: ");
        double tipPercentage = Double.parseDouble(tipInput);
        //calculate sales tax
        double salesTax = mealCost * 0.06;
        //calculate the tip
        double tip = mealCost * (tipPercentage / 100);
        //calculate the total bill
        double bill = mealCost + salesTax + tip;
        //make output string and format string to go to 2 decimal places
        String outputStr = "Meal Cost: $" + String.format("%.2f", mealCost) + "\n"
                + "Sales Tax (6%): $" + String.format("%.2f", salesTax) + "\n"
                + "Tip (15%): $" + String.format("%.2f", tip) + "\n"
                + "Total Bill: $" + String.format("%.2f", bill);
        //output bill summary in dialog box
        JOptionPane.showMessageDialog(null, outputStr);
    }
}
