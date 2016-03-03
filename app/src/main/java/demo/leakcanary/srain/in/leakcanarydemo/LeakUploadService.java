package demo.leakcanary.srain.in.leakcanarydemo;

import com.squareup.leakcanary.AnalysisResult;
import com.squareup.leakcanary.DisplayLeakService;
import com.squareup.leakcanary.HeapDump;

public class LeakUploadService extends DisplayLeakService {
    @Override
    protected void afterDefaultHandling(HeapDump heapDump, AnalysisResult result, String leakInfo) {
        if (!result.leakFound || result.excludedLeak) {
            return;
        }
//        #heapDump.heapDumpFile,
        MyService.UploadLeakBlocking(leakInfo);
    }
}