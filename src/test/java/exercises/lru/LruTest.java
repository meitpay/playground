package exercises.lru;

import org.junit.Test;
import static org.junit.Assert.*;

public class LruTest {
    @Test
    public void testPutGet() {
        Lru<Integer> lru = new Lru<>();
        lru.put("A", 1);
        Integer a = lru.get("A");
        assertSame(1, a);
    }
    @Test
    public void testLru() {
        Lru<Integer> lru = new Lru<>(2);
        lru.put("A", 1);
        lru.put("B", 2);
        Integer a = lru.get("A");
        assertSame(1, a);
        lru.put("C", 3);
        Integer b = lru.get("B");
        assertNull(b);
        lru.put("D", 4);
        assertSame(3, lru.get("C"));
        assertSame(4, lru.get("D"));
    }
}