import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
 
public class GetValueFromMapTest {
 
    @Test
    public void testKeyRetrieval() {
         GetValue getValueObject = new GetValue();

         Map<String, Object> level3 = new HashMap<String, Object>();
         level3.put("c", "d");

         Map<String, Object> level2 = new HashMap<String, Object>();
         level2.put("b", level3);

         Map<String, Object> input = new HashMap<String, Object>();
         input.put("a", level2);    // Input: {a={b={c=d}}}

         String key = "a/b/c";
         String delimiter = "/";

         assertTrue(getValueObject.getValue(input, key, delimiter).equals("d"));
    }
}
