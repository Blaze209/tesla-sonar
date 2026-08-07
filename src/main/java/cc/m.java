package cc;

import android.provider.Telephony;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes3.dex */
public class m extends o {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ReactApplicationContext f19027h;

    public m(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.f19027h = reactApplicationContext;
    }

    @Override // cc.n
    protected String b() {
        return null;
    }

    @Override // cc.n
    protected String h() {
        return Telephony.Sms.getDefaultSmsPackage(this.f19027h);
    }

    @Override // cc.n
    protected String i() {
        return "market://details?id=com.android.mms";
    }

    @Override // cc.o, cc.n
    public void l(ReadableMap readableMap) {
        super.l(readableMap);
        m();
    }
}
