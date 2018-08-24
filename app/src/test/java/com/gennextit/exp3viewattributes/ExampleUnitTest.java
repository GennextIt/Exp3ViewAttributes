package com.gennextit.exp3viewattributes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    private MainActivity activity;

    @Before
    public void setUp() throws Exception {
        activity = new MainActivity();
    }
    @Test
    public void editTextUpdatesTextView() throws Exception{

    }

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void buttonClickShouldStartNewActivity() throws Exception {
    }

    @Test
    public void testMusicSearchNotBlank() throws Exception {
        // Click on the add note button
    }
}