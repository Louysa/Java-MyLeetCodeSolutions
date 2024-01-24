import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);


        int sum = 0;
        char[] a = s.toCharArray();
        for (int i = 0; i <s.length() ; i++) {
            char c = a[i];
            if(i == s.length()-1){
                sum += map.get(c);
                break;
            }
            char cc = a[i+1];
            if( i != s.length()-1 && map.get(c) < map.get(cc)) {
                sum -= map.get(c);
            } else
                sum += map.get(c);
        }
        return sum;
    }
}