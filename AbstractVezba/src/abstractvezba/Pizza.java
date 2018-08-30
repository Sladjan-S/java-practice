/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractvezba;

/**
 *
 * @author TheRedBaron
 */
public class Pizza extends Product
{
    
    public Pizza(String name,double price)
    {
    this.additions = new String[10];
    this.name = name;
    this.price = price;
    }
    
    @Override
    public double countPrice()
    {
    return this.price+this.price*0.1;
    }
    //uprosceno
//    public class Pizza extends Product {
// 
//    public Pizza(String name, double price) {
//        this.additions = new String[10];
//        this.name = name;
//        this.price = price;
//    }
// 
//    public double countPrice() {
//        return this.price * 1.1;
//    }
}

