import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String,String> myHashMap = new HashMap<>();
        myHashMap.put("apple", "vine");
        myHashMap.put("one", "two");

        Set<String> keySet = myHashMap.keySet();

        for (String key : keySet) {
             System.out.print(key + ": ");
             System.out.println(myHashMap.get(key));
        }
        System.out.println();
        for (Map.Entry entry: myHashMap.entrySet()) {

            System.out.println(entry);

        }
    }
}
