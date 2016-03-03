package demo.leakcanary.srain.in.leakcanarydemo;

import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

public class DebugExampleApplication extends ExampleApplication {
    protected RefWatcher installLeakCanary() {
        return LeakCanary.install(this, LeakUploadService.class);
    }
}
