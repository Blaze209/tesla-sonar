package hu;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class a0 {
    public static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }
}
