package ai;

import android.content.Context;
import java.io.File;
import lh.c;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static b f1127b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f1128a;

    public static b d() {
        if (f1127b == null) {
            f1127b = new b();
        }
        return f1127b;
    }

    public static boolean f() {
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        for (int i11 = 0; i11 < 10; i11++) {
            if (new File(strArr[i11]).exists()) {
                return true;
            }
        }
        return false;
    }

    public c a() {
        return c.c();
    }

    public void b(Context context) {
        c.c();
        this.f1128a = context.getApplicationContext();
    }

    public Context c() {
        return this.f1128a;
    }

    public String e() {
        return mg.b.d(null, this.f1128a);
    }
}
