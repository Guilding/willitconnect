package willitconnect.model;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckedEntryTest {

    @Test(expected = NullPointerException.class)
    public void cannotHaveANullEntry() {
        new CheckedEntry(null);
    }

    @Test
    public void isAValidHostName() {
        CheckedEntry e = new CheckedEntry("us-cdbr-iron-east-02.cleardb.net:3306");
        assertTrue(e.isValidHostname());
    }

    @Test
    public void isAValidURL() {
        CheckedEntry e = new CheckedEntry("https://us-cdbr-iron-east-02.cleardb.net:3306");
        assertTrue(e.isValidUrl());
    }

    @Test
    public void isNotAValidURL() {
        CheckedEntry e = new CheckedEntry("us-cdbr-iron-east-02.cleardb.net:3306");
        assertFalse(e.isValidUrl());
    }
}