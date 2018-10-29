package Task2Package;

public class Customer {
    public String name;
    public boolean member = false;
    public String memberType;

    public Customer(){

    }
    public Customer(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public boolean isMember(){
        return member;
    }

    public void setMember(boolean member){
        this.member = member;
    }

    public String getMemberType(){
        return memberType;
    }

    public void setMemberType(String type){
        this.memberType = type;
    }

    public String toString(){
        return "The member's name is: " + getName() + "and tyoe is: " + getMemberType();
    }
}
