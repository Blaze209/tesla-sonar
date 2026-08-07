package androidx.core.app;

import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class h {
    @Deprecated
    public static IBinder a(Bundle bundle, String str) {
        return bundle.getBinder(str);
    }

    @Deprecated
    public static void b(Bundle bundle, String str, IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}
