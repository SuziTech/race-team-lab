import events.Map;
import org.junit.Before;
import org.junit.Test;
import people.Navigator;

import static org.junit.Assert.assertEquals;

public class NavigatorTest {
    Navigator navigator;
    Map map;

    @Before
    public void before() {
        navigator = new Navigator("Tom", 1);
        map = new Map("Esholt", "OS596");
    }

    @Test
    public void navigatorHasName(){
        assertEquals("Tom", navigator.getName());
    }

    @Test
    public void navigatorCanRide() {
        assertEquals("I'm Navigating...", navigator.ride());
    }

    @Test
    public void navigatorCanUseMap(){
        assertEquals("I'm using a map...", navigator.useMap());
    }

    @Test
    public void canInaugurate() {
        assertEquals("You have entered the Hall of Fame", navigator.inaugurate());
    }
}
