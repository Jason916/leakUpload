//package test;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.robolectric.Robolectric;
//import org.robolectric.RobolectricGradleTestRunner;
//import org.robolectric.annotation.Config;
//
//import demo.leakcanary.srain.in.leakcanarydemo.BuildConfig;
//import demo.leakcanary.srain.in.leakcanarydemo.MainActivity;
//
//import static junit.framework.Assert.assertNotNull;
//import static junit.framework.Assert.assertEquals;
//
///**
// * Created by jasonxu on 16/2/27.
// * Email: 573654699@qq.com
// **/
//@RunWith(RobolectricGradleTestRunner.class)
//@Config(constants = BuildConfig.class)
//
//public class MainActivityTest {
//
//    @Test
//    public void testActivity() {
//        MainActivity mainActivity = Robolectric.setupActivity(MainActivity.class);
//        assertNotNull(mainActivity);
//        assertEquals(mainActivity.getTitle(), "MainActivity");
//    }
//
//}
