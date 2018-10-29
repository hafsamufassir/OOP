package Task2Package;

import java.util.Date;

public class Visit {
    Customer customer;
    Date date;
    public double serviceExpense;
    public double productExpense;

    public Visit(Customer customer, Date date){
        this.customer = customer;
        this.date = date;
    }

    public String getName(){
        return customer.getName();
    }

    public double getServiceExpense(){
        return serviceExpense;
    }

    public void setServiceExpense(double ex){
        //this.serviceExpense = ex;
        if(customer.isMember()){
            serviceExpense -= serviceExpense * DiscountRate.getServiceDiscountRate(customer.getMemberType());
        }

//        if(customer.memberType.equals("Premium")){
//            serviceExpense = ex * 0.2;
//        }else if(customer.memberType.equals("Gold")){
//            serviceExpense = ex * 1.5;
//        }else{
//            serviceExpense = ex * 0.1;
//        }
    }

    public double getProductExpense(){
        return productExpense;
    }

    public void setProductExpense(double ex){
        this.productExpense = ex;
    }

    public double getTotalExpense(){
        return getProductExpense() + getServiceExpense();
    }

    public String toString(){
        return "The service expense is: " + getServiceExpense() + " and the product expence is: " + getProductExpense() + " so total is: " + getTotalExpense();
    }
}
