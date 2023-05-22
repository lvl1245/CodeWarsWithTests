import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.DoubleStream;
public  class Program {
        public static void main(String[] args){
            String d = "......\n"+
                    "......\n"+
                    "......\n"+
                    "......\n"+
                    ".....W\n"+
                    "....W.";
           System.out.println(pathFinder(d));
        }
        // примеры для проверки junit
        static double add(double... operands) {
            return DoubleStream.of(operands)
                    .sum();
        }

        static double multiply(double... operands) {
            return DoubleStream.of(operands)
                    .reduce(1, (a, b) -> a * b);
        }
        // конец примеров

        //задачи
        static boolean scramble(String str1, String str2) {
            Map<Character, Integer> Pairs = new HashMap<Character, Integer>();
            for (char ch:
                 str1.toCharArray()) {
                if (Pairs.containsKey((ch))) {
                    Pairs.replace(ch ,Pairs.get(ch) + 1) ;
                    continue;
                }
                Pairs.put(ch,1);
            }
            for (char ch:
                    str2.toCharArray()) {
                if (Pairs.containsKey(ch)){
                    if (Pairs.get(ch) > 0){  Pairs.replace(ch, Pairs.get(ch) - 1);}
                 else { return false;}
                }else { return false;}
            }
            return true;
        }

    static String encode(String word){
        Map<Character, Integer> Pairs = new HashMap<>();
        for (char ch:
                word.toCharArray()) {
            if (Pairs.containsKey((ch))) {
                Pairs.replace(ch ,Pairs.get(ch) + 1) ;
                continue;
            }
            Pairs.put(ch,1);
        }
        char[] Result = new char[word.length()];
        for (int i = 0; i < word.length(); i++){
            if (Pairs.get(word.charAt(i)) > 1) {Result[i] =  '(';}
            else {Result[i] = '(';}
        }
        return Result.toString();
    }



    static public String spinWords(String sentence) {
            String result = "";

            for (String str:
                sentence.split(" ")) {
            if (str.length() >= 5){
                str = new StringBuilder(str).reverse().toString();
            }
                result += str + " ";
        }
            return result.trim();
    }
    public  static <T> ArrayList<T> AddRange (ArrayList<T> collection1, ArrayList<T> collection2){
        for (T c:
             collection1) {
            collection2.add(c);
        }
        return  collection2;
    }
    public class Cell{
            Point p;
            Cell prev;
    }
    static boolean pathFinder(String maze) {
        ArrayList<Cell> CellsForSerch= new ArrayList<Cell>();
        ArrayList<Cell> ValidCells= new ArrayList<Cell>();
        String[] str = maze.split("\n");
        char[][] Grid = new char[str.length][str.length];
        for (int i = 0; i < str.length; i++) {
            Grid[i] = str[i].toCharArray();
        }


        return false;
    }
}
