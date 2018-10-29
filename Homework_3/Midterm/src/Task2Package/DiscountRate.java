package Task2Package;

public class DiscountRate {

    public static double serviceDiscountPremium = 0.2;

    public static double serviceDiscountGold = 0.15;

    public static double serviceDiscountSilver = 0.1;

    public static double productDiscountPremium = 0.1;

    public static double productDiscountGold = 0.1;

    public static double productDiscountSilver = 0.1;

    public static double getServiceDiscountRate(String type){
       if(type.equals("Premium")) {
           return serviceDiscountPremium;
       }else if(type.equals("Gold")){
           return serviceDiscountGold;
       }else{
           return serviceDiscountSilver;
       }
    }

    public static double getProductDiscountRate(String type){
        if(type.equals("Premium")) {
            return productDiscountPremium;
        }else if(type.equals("Gold")){
            return productDiscountGold;
        }else{
            return productDiscountSilver;
        }
    }
}

