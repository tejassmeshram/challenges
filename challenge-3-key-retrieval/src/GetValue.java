import java.util.Map;
 
public class GetValue {
       /**
         * This method assumes the input as a Map & key with 'delimiter' separated objects
         * e.g. input - {a={b={c=d}}} & key - a/b/c
         * Output - d
         *
         * @param input
         * @param key
         * @return Value in object, for the mentioned key
       */
       public Object getValue(Object input, String key, String delimiter) {
             // If below "if" statement is true, then we have reached the end of the tree in key - otherwise keep traversing level by level recursively
             if (input instanceof String) {
                    return input;
             }
            
             if (input instanceof Map<?, ?>) {
                    Map<String, Object> map = (Map)input;
                   
                    String[] keys = key.split(delimiter);
                    String currentKey = keys[0];
                   
                    // If Input doesn't contain a valid key, return null
                    if (!map.containsKey(currentKey)) {
                          return null;
                    }
                   
                    int remainingKeyIndex = key.indexOf(currentKey) + 2;           // e.g. key=a/b/c; currentKey=a; therefore remainingKeyIndex=2 & remainingKeyString=b/c
                   
                    if (key.length() > remainingKeyIndex) {
                          String remainingKeyString = key.substring(remainingKeyIndex);
                        
                          // Dive a level deeper with remainingKey
                          return getValue(map.get(currentKey), remainingKeyString, delimiter);
                    }     
             }
             return ((Map)input).get(key);
       }
}
