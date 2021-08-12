import static org.junit.Assert.*;

public class mainTest {
    main m1;

    @org.junit.Before
    public void setUp() throws Exception {
        m1 = new main(5.0);
    }

    @org.junit.Test
    public void changeNum() {
        assertEquals(5.0, m1.getNumber(), 0.0);
        m1.changeNum(6.0);
        assertEquals(6.0, m1.getNumber(), 0.0);
    }

    @org.junit.Test
    public void printNum() {
        String s = m1.printNum();
        assertNotNull(s);
    }

}