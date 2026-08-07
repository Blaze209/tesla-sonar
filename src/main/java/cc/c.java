package cc;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes3.dex */
public class c extends o {
    public c(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // cc.n
    protected String b() {
        return "https://www.facebook.com/sharer/sharer.php?u={url}";
    }

    @Override // cc.n
    protected String h() {
        return "com.facebook.pages.app";
    }

    @Override // cc.n
    protected String i() {
        return null;
    }

    @Override // cc.o, cc.n
    public void l(ReadableMap readableMap) {
        super.l(readableMap);
        m();
    }
}
