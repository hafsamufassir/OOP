package Task1Package;

public class Sequence {
    private String s;
    private String word;

    public Sequence(String word) {
        this.word = word;
    }

    public boolean isPalindronme(){

        for(int i = 0; i < s.length()/2; i++){

            if(s.equals(s[s.length()-i-1])) {
                return true;
            }
        }
        return false;
    }
    //abcba

    public boolean isSubString(Sequense seq){
        for(int i = 0; i < s.length(); i++){
            if(s.equals(word)){
                return true;
            }
        }
        return false;
    }


}
