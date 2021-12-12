import java.lang.reflect.AccessibleObject;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {

        Map<String, Object> testMapTmp = new HashMap<>();
        testMapTmp.put("name", "hogepiyo");
        testMapTmp.put("age", 20);
        testMapTmp.put("description", "hogehogepiyo");

        TestObject testObject = new MapParser<TestObject>().parse(testMapTmp, TestObject.class);

        System.out.println(testObject.toString());
    }
}
