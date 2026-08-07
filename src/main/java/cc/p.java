package cc;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes3.dex */
public class p extends o {
    public p(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // cc.n
    protected String a() {
        return "com.snap.mushroom.MainActivity";
    }

    @Override // cc.n
    protected String b() {
        return null;
    }

    @Override // cc.n
    protected String h() {
        return "com.snapchat.android";
    }

    @Override // cc.n
    protected String i() {
        return "market://details?id=com.snapchat.android";
    }

    @Override // cc.o, cc.n
    public void l(ReadableMap readableMap) {
        super.l(readableMap);
        m();
    }
}
