import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StudentInfoTest {
    StudentInfo si = new StudentInfo("TomD", "2 Park St", "Eliot", "ME", "01303");
    @Test
    public void testGetAddress() {
        assertEquals("2 Park St", si.getAddress());
    }

    @Test
    public void testGetCity() {
        assertEquals("Eliot", si.getCity());
    }

    @Test
    public void testGetName() {
        assertEquals("Tom", si.getName());
    }

    @Test
    public void testGetState() {
        assertEquals("ME", si.getState());
    }

    @Test
    public void testGetZipCode() {
        assertEquals("01303", si.getZipCode());
    }
}
