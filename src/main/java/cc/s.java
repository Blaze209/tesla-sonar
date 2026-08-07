package cc;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes3.dex */
public class s extends o {
    public s(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // cc.n
    protected String b() {
        return "https://twitter.com/intent/tweet?text={message}&url={url}";
    }

    @Override // cc.n
    protected String h() {
        return "com.twitter.android";
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
