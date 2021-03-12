package NewHorizonJavaProgramming;

/**
 *
 * @author allwells
 */
public class Loops {
    
    public static void main(String[] args) {
//        String [] names = {"Allwell", "Collins", "Emediong", "Joy"};
//        
//        for (String name : names) {
//            System.out.println("My name is " + name);
//        }

        double[] itemPrices = {2300.30, 320.99, 5000.00, 1000.05};
        for(double itemPrice : itemPrices) {
            System.out.println("Item price: $" + itemPrice);
        }
    }
}
