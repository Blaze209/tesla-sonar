package cc;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes3.dex */
public class g extends o {
    public g(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // cc.n
    protected String b() {
        return "https://plus.google.com/share?url={url}";
    }

    @Override // cc.n
    protected String h() {
        return "com.google.android.apps.plus";
    }

    @Override // cc.n
    protected String i() {
        return "market://details?id=com.google.android.apps.plus";
    }

    @Override // cc.o, cc.n
    public void l(ReadableMap readableMap) {
        super.l(readableMap);
        m();
    }
}
