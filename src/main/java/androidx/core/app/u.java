package androidx.core.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class u {
    static int a(boolean z11, int i11) {
        int i12;
        if (!z11) {
            i12 = 67108864;
        } else {
            if (Build.VERSION.SDK_INT < 31) {
                return i11;
            }
            i12 = 33554432;
        }
        return i12 | i11;
    }

    public static PendingIntent b(Context context, int i11, Intent intent, int i12, boolean z11) {
        return PendingIntent.getActivity(context, i11, intent, a(z11, i12));
    }
}
