package com.gennextit.exp3viewattributes;

import android.os.Build;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = Build.VERSION_CODES.LOLLIPOP, manifest=Config.NONE)
public class RobolectricActivityTest {

    private RobolectricActivity activity;

    @Before
    public void setUp() throws Exception {
        activity = Robolectric.buildActivity(RobolectricActivity.class)
                .create()
                .resume()
                .get();
    }
    @Test
    public void editTextUpdatesTextView() throws Exception{

    }

    @Test
    public void shouldHaveDefaultMargin() throws Exception {
        TextView textView = (TextView) activity.findViewById(R.id.hello_textview);
        int bottomMargin = ((LinearLayout.LayoutParams) textView.getLayoutParams()).bottomMargin;
        assertEquals(5, bottomMargin);
        int topMargin = ((LinearLayout.LayoutParams) textView.getLayoutParams()).topMargin;
        assertEquals(5, topMargin);
        int rightMargin = ((LinearLayout.LayoutParams) textView.getLayoutParams()).rightMargin;
        assertEquals(10, rightMargin);
        int leftMargin = ((LinearLayout.LayoutParams) textView.getLayoutParams()).leftMargin;
        assertEquals(10, leftMargin);
    }

    @Test
    public void checkActivityNotNull() throws Exception {
        assertNotNull(activity);
    }

    @Test
    public void shouldHaveCorrectAppName() throws Exception {
        String hello = activity.getResources().getString(R.string.app_name);
        assertThat(hello, equalTo("Exp3 ViewAttributes"));
    }

//    @Test
//    public void buttonClickShouldStartNewActivity() throws Exception {
//        Button button = (Button) activity.findViewById(R.id.startNextActivity);
//        button.performClick();
//        Intent intent = Shadows.shadowOf(activity).peekNextStartedActivity();
//        assertEquals(RobolectricSecondActivity.class.getCanonicalName(), intent.getComponent().getClassName());
//    }
//
//    @Test
//    public void testButtonClickShouldShowToast() throws Exception {
//        RobolectricActivity activity = Robolectric.buildActivity(RobolectricActivity.class).create().get();
//        Button view = (Button) activity.findViewById(R.id.showToast);
//        assertNotNull(view);
//        view.performClick();
//        assertThat(ShadowToast.getTextOfLatestToast(), equalTo("Lala"));
//    }


}