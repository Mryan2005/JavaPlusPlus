import org.junit.Test;
import translate.Trans;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class TransClassTest {
    @Test
    public void testTrans() throws Exception {
        Trans trIn = new Trans("test/TransClass/in.json");
        RAFile raIn = new RAFile("test/TransClass/out.dat");
        int i = 0;
        for(String key : trIn.object.keySet()) {
            if((trIn.object.get(key)).equals(raIn.content.get(i))) {
                i++;
            } else {
                fail();
            }
        }
    }
}