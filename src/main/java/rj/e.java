package rj;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class e implements c {
    @Override // rj.c
    @NonNull
    public b a(@NonNull Context context, @NonNull b.a aVar) {
        boolean z11 = androidx.core.content.b.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z11 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z11 ? new d(context, aVar) : new n();
    }
}
