import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double itemPrice = 0.0;
        double totalPrice = 0.0;
        boolean moreItems = true;
        while (moreItems){
            itemPrice = SafeInput.getRangedDouble(in, "Enter the price of the item: ", 0.50, 10.00);
            totalPrice += itemPrice;
            moreItems = SafeInput.getYNConfirm(in, "Do you have more items? ");
        }
        System.out.println("Total cost: $"+ totalPrice);
    }
}