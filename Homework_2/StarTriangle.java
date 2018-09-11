public class StarTriangle 
{ 
    int width; 
  
    public StarTriangle(int width) 
    { 
        this.width = width;  
    } 
   
    public int getWidth() 
    { 
        return width; 
    } 
  
  
    @Override
    public String toString() 
    { 
        int n = this.getWidth();
        String result = "";
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                result += "[*]";
            }
            result += "\n";
        }
        return result;

    } 
  
    public static void main(String[] args) 
    { 
        StarTriangle small = new StarTriangle(3);
        System.out.println(small.toString());
    } 
}