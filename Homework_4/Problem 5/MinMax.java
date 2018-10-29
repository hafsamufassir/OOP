public class MinMax {
    static class Pair {
        private int first;
        private int second;

        public Pair(int _first, int _second){
            first = _first;
            second = _second;
        }

        public int getFirst(){
            return first;
        }

        public void setFirst(int _first){
            first = _first;
        }

        public int getSecond(){
            return second;
        }

        public void setSecond(int _second){
            second = _second;
        }

        @Override
        public String toString(){
            return String.format("Min: %d\nMax: %d", first, second);
        }
    }
    static Pair minmax(int values[]){
        int min, max;
        min = max = values[0];

        for(int i : values){
            if(i > max) max = i;
            else if (i < min) min = i;
        }

        return new Pair(min, max);
    }

}