public class Main {

    public static void main(String[] args) {

        Position pos = new Position(1,1);
        Position pos2 = new Position(2,2);
        Knight knight = new Knight(pos);
        System.out.println(knight.isLegalMove(pos,pos2));

    }
}
