package cc;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.common.internal.ImagesContract;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o extends n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f19033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String f19034g;

    public o(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.f19033f = null;
        this.f19034g = null;
    }

    @Override // cc.n
    public void l(ReadableMap readableMap) {
        String strI;
        System.out.println(h());
        if (h() != null || b() != null || i() != null) {
            if (n.k(h(), this.f19028a)) {
                System.out.println("INSTALLED");
                if (a() != null) {
                    f().setComponent(new ComponentName(h(), a()));
                } else {
                    f().setPackage(h());
                }
                super.l(readableMap);
                return;
            }
            System.out.println("NOT INSTALLED");
            if (b() != null) {
                strI = b().replace("{url}", n.o(readableMap.getString(ImagesContract.URL))).replace("{message}", n.o(readableMap.getString("message")));
            } else {
                strI = i() != null ? i() : "";
            }
            n(new Intent(new Intent("android.intent.action.VIEW", Uri.parse(strI))));
        }
        super.l(readableMap);
    }

    @Override // cc.n
    protected void m() {
        p(null);
    }

    protected void p(ReadableMap readableMap) {
        if (!this.f19032e.hasKey("forceDialog") || !this.f19032e.getBoolean("forceDialog")) {
            f().addFlags(268435456);
            this.f19028a.startActivity(f());
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putBoolean("success", true);
            writableMapCreateMap.putString("message", f().getPackage());
            q.b(writableMapCreateMap);
            return;
        }
        Activity currentActivity = this.f19028a.getCurrentActivity();
        if (currentActivity == null) {
            q.a("Something went wrong");
            return;
        }
        if (readableMap != null && !n.j("social", readableMap)) {
            throw new IllegalArgumentException("social is empty");
        }
        if (q.d()) {
            Intent intentCreateChooser = Intent.createChooser(f(), this.f19030c, q.c(this.f19028a));
            intentCreateChooser.addFlags(1073741824);
            currentActivity.startActivityForResult(intentCreateChooser, 16845);
            return;
        }
        Intent intentCreateChooser2 = Intent.createChooser(f(), this.f19030c);
        intentCreateChooser2.addFlags(1073741824);
        currentActivity.startActivityForResult(intentCreateChooser2, 16845);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putBoolean("success", true);
        writableMapCreateMap2.putString("message", "OK");
        q.b(writableMapCreateMap2);
    }
}
