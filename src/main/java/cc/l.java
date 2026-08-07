package cc;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes3.dex */
public class l extends o {
    public l(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // cc.n
    protected String b() {
        return "https://pinterest.com/pin/create/button/?url={url}&media=$media&description={message}";
    }

    @Override // cc.n
    protected String h() {
        return "com.pinterest";
    }

    @Override // cc.n
    protected String i() {
        return "market://details?id=com.pinterest";
    }

    @Override // cc.o, cc.n
    public void l(ReadableMap readableMap) {
        super.l(readableMap);
        m();
    }
}
