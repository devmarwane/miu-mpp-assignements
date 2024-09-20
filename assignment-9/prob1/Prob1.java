package lesson9.lab9updatedsolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Prob1 {
//    counts the number of words in the input list words that have length equal to len, that
//    contain the character c, and that do not contain the character d.
    public static int countWords(List<String> words, char c, char d, int len){
        int number = (int) words.stream()
                .filter(x->x.length() == len)
                .filter(x->x.chars().filter(y->y==c).count()>0)
                .filter(x->x.chars().filter(y->y==d).count()==0)
                .count();
        return number;
    }

    public static void main(String[] args) {
        List<String> nouns = new ArrayList<String>(Arrays.asList("be","person","year","way","day","thing","man","world","life","hand","part","child","eye","woman","place","work","week","case","point","government","company","number","group","problem","fact"));


        BiConsumer<Character,Character> count5 = (c, d)->System.out.println (Prob1.countWords(nouns,c,d,5) +
        " words of length 5 contains '" + c + "' but not '" + d + "'") ;

        count5.accept('a','p'); //woman
        count5.accept('p','z'); //place, point, group

        BiConsumer<Character,Character> count4 = (c, d)->System.out.println (Prob1.countWords(nouns,c,d,4) +
                " words of length 4 contains '" + c + "' but not '" + d + "'") ;

        count4.accept('a','p'); // year,hand, case,fact
        count4.accept('p','z'); // part
        count4.accept('z','a');
    }
}
