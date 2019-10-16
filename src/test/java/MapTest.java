import events.Map;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MapTest {
    Map map;

    @Before
    public void before(){
        map = new Map("Esholt","OS596");
    }

    @Test
    public void canGetRoute(){
        assertEquals("Esholt", map.getRoute());
    }

    @Test
    public void canGetMapSerial(){
        assertEquals("OS596",map.getSerial());
    }
}
