public class Cat extends Animal {
    
    
    public Cat() {
        super();
    }

    public Cat(int paws) {
        super(paws);
        //this.paws = paws;
    }

    public void meowing() {
        System.out.println("Meow meow");
    }

    public void meowing(int num){
        for(int i = 0; i < num; i++){
            System.out.println("Meow!");
        }
    }
    
    public String getInfo() {
        return "Animal: Cat\n" + super.getInfo();
    }

}
