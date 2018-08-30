
package oopjava;


public class Cookie
{
    String name;
    double weight;
    
    void bake()//metoda
    {
        System.out.println("The cookie is baked!");
    }
    
    @Override
    public String toString()
    {
    return "This is object of class Cookie.";
    }
    
}
