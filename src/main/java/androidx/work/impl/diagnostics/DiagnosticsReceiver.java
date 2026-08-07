package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.c0;
import androidx.work.impl.workers.DiagnosticsWorker;
import androidx.work.s0;
import androidx.work.z;

/* JADX INFO: loaded from: classes3.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f14565a = z.i("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        z.e().a(f14565a, "Requesting diagnostics");
        try {
            s0.e(context).a(c0.e(DiagnosticsWorker.class));
        } catch (IllegalStateException e11) {
            z.e().d(f14565a, "WorkManager is not initialized", e11);
        }
    }
}
