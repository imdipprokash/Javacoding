/* Wap that simulates the shopping carts for the operation
1. Add item
2.Remove item
3.Display the total bill for all items and
4.Exit
 */

import java.util.*;
class ProductItem
{
    int id;
    private  float price;
    ProductItem(int id,float price)
    {
        this.id = id;
        this.price = price;

    }
    public  String toString()
    {
        return  "ID:"+id+" price: "+price;
    }
    float getPrice()
    {
        return  price;
    }
}
class ShoppingCart
{
    int custid;
    Vector itemsv;
    ShoppingCart(int custid)
    {
        this.custid = custid;
        itemsv = new Vector();

    }
    public  void addItem(ProductItem pit)
    {
        itemsv.addElement(pit);

    }
    public void removeItem(ProductItem pit)
    {
        itemsv.remove(pit);
    }
    public  void doPayment()
    {
        float amt = 0.0f;
        for (int i=0;i<itemsv.size();i++)
        {
            amt +=((ProductItem)itemsv.get(i)).getPrice();
        }
        System.out.println("Total price : "+amt);
    }
}
public class ShopDemo
{
    public static void main(String[] args) {
        int count = 0;
        ShoppingCart sc = new ShoppingCart(1);
        ProductItem it1 = new ProductItem(count++,200);
        sc.addItem(it1);
        ProductItem it2 = new ProductItem(count++,300);
        sc.removeItem(it2);
        System.out.println();
        sc.doPayment();
        System.out.println();
    }
}