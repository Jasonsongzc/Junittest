
import java.lang.reflect.Array;
import java.util.*;

public class KotlinTest {
    public static void main(String args[]) {
        List<String> list = new ArrayList<>();
        list = Arrays.asList("good1","222222");
        for(String str: list){
            System.out.println(str);
        }
    }
}