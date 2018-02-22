package DesignPattern.Factory.simplefactory;

/**
 * Created by fido on 2018/2/21.
 */
public class Creator {
    private Creator(){}
    public static IProduct createProduct(String productName){
        if(productName==null){
            return null;
        }
        if(productName.equals("A")){
            return new ProductA();
        }
        if(productName.equals("B")){
            return new ProductB();
        }
        else
            return null;
    }

}
