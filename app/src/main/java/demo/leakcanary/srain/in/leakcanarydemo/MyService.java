package demo.leakcanary.srain.in.leakcanarydemo;

import android.os.Message;
import android.util.Log;

import tool.common.GetPostUtil;

public class MyService {

    public static void UploadLeakBlocking(String leakInfo) {
        String url = "http://192.168.1.4:5000/uploadleak";
        Message m = new Message();
        m.what = 0x123;
        Log.i("iiiiiii", "发送POST请求");
        m.obj = GetPostUtil.sendPost(url, "msg="+leakInfo);
        Log.i("gggggggg", ">>>>>>>>>>>>" + m.obj);
    }
}

