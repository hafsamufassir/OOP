public class Animal {
    private int paws;
    private String name;
    private String color;
    
    public Animal() {

    }

    public Animal(int paws) {
        this.paws = 4;
        this.name = "No name";
        this.color = "No color";
    }

    public void meowing() {
        System.out.println("Meow");
    }
    
    public String getInfo() {
        return String.format("Name: " + name + ", Color: " + color + ", Paws: ");
    }

}
