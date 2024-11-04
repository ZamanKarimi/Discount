
package discount1;

import java.util.Scanner;


public class Discount1 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
    int price = input.nextInt();
    double discount  = 0.0 ;
    double finalPrice;
    double discountAmount;
    
    
    if (price >= 1000)
            discount = 0.2;
            
    else if (price >= 500)
            discount = 0.1;
    else if (price < 500)
            discount = 0.05;
    
    discount *= 100;
    discountAmount = price * discount/100;
    finalPrice = price - discountAmount;
    
        System.out.println("the discount is " + discount + "%");
        System.out.println("the final price is "+ finalPrice);

    }
    
}
